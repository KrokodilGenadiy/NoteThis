package com.zaus_app.notethis.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.zaus_app.moviefrumy.view.rv_adapters.NoteAdapter
import com.zaus_app.moviefrumy.view.rv_adapters.diffutils.NoteDiff
import com.zaus_app.moviefrumy.view.rv_adapters.itemdecorators.ItemDecorator
import com.zaus_app.notethis.data.entity.MainRepository
import com.zaus_app.notethis.data.entity.Note
import com.zaus_app.notethis.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val noteAdapter: NoteAdapter by lazy {
        NoteAdapter(object : NoteAdapter.OnItemClickListener {
            override fun click(note: Note) {
                //(requireActivity() as MainActivity).launchDetailsFragment(film)
                Toast.makeText(requireContext(),"clicked",Toast.LENGTH_SHORT)
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        updateData(MainRepository.NotesList as MutableList<Note>)
    }

    fun initRecycler() {
        binding.include.mainRecycler.apply {
            adapter = noteAdapter
            layoutManager = LinearLayoutManager(requireContext())
            val decorator = ItemDecorator(8)
            addItemDecoration(decorator)
        }
    }

    fun updateData(newList: MutableList<Note>) {
        val oldList = noteAdapter.getItems()
        val productDiff = NoteDiff(oldList, newList)
        val diffResult = DiffUtil.calculateDiff(productDiff)
        noteAdapter.setItems(newList)
        diffResult.dispatchUpdatesTo(noteAdapter)
    }
}