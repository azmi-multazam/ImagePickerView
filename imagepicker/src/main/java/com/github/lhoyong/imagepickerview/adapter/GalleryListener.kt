package com.github.lhoyong.imagepickerview.adapter

import android.view.View
import com.github.lhoyong.imagepickerview.model.Image

interface GalleryListener {
    fun onChecked(image: Image)
    fun onClick(view: View,image: Image)
}