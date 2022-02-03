package com.zaus_app.moviefrumy.view.rv_viewholders

import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.zaus_app.notethis.App
import com.zaus_app.notethis.R
import com.zaus_app.notethis.data.entity.Note
import com.zaus_app.notethis.databinding.NoteItemBinding

class NoteViewHolder(binding: NoteItemBinding) : RecyclerView.ViewHolder(binding.root) {

    private val title = binding.title
    private val description = binding.content
    private val container = binding.card


    fun bind(note: Note) {
        title.text = note.title
        description.text = note.content
        container.setCardBackgroundColor(ResourcesCompat.getColor(App.instance.resources,note.color,null))
    }
}