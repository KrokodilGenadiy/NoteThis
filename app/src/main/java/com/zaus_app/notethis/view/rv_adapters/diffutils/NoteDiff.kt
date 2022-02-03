package com.zaus_app.moviefrumy.view.rv_adapters.diffutils

import androidx.recyclerview.widget.DiffUtil
import com.zaus_app.notethis.data.entity.Note

class NoteDiff(val oldList: MutableList<Note>, val newList: MutableList<Note>) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id &&
                oldList[oldItemPosition].title == newList[newItemPosition].title &&
                oldList[oldItemPosition].content == newList[newItemPosition].content &&
                oldList[oldItemPosition].color == newList[newItemPosition].color
    }

}