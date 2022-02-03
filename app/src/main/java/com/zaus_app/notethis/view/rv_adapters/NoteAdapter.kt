package com.zaus_app.moviefrumy.view.rv_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zaus_app.moviefrumy.view.rv_viewholders.NoteViewHolder
import com.zaus_app.notethis.data.entity.Note
import com.zaus_app.notethis.databinding.NoteItemBinding

class NoteAdapter(private val clickListener: OnItemClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items = mutableListOf<Note>()

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = NoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is NoteViewHolder -> {
                holder.bind(items[position])
                holder.itemView.setOnClickListener {
                    clickListener.click(items[position])
                }
            }
        }
    }

    fun getItems(): MutableList<Note> {
        return items
    }

    fun setItems(list: MutableList<Note>) {
        this.items = list
    }

    interface OnItemClickListener {
        fun click(note: Note)
    }
}