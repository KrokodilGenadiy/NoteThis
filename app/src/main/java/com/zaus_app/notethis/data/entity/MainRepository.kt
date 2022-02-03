package com.zaus_app.notethis.data.entity

import com.zaus_app.notethis.R

object MainRepository {
    val NotesList = listOf(
        Note(1,"note 1","some rubbish text", R.color.teal),
        Note(2, "note 2", "This tool helps you convert pixels to and from DPs (density independent pixels).", R.color.light_blue_400),
        Note(3, "note 3" , "A VectorDrawable is an XML representation of a Vector. Unlike popular image formats like Bitmap, JPEG, GIF and PNG, Vectors do not lose quality as they are scaled up or down. This makes bundling of images with different densities unnecessary, hence saving you a lot of APK bloat. In effect, VectorDrawables contains path commands on (how to draw lines and arcs) and just like Path commands when working with Canvas, drawing and rendering VectorDrawables is time and memory consuming process which is why VectorDrawable’s are best used for simple flat graphics.",  R.color.light_blue_400),
        Note(4, "Note 4", "buy bread", R.color.red),
        Note(5, "Big note title", "buy bread",R.color.red),
        Note(6, "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "buy bread",R.color.teal)
    )
}