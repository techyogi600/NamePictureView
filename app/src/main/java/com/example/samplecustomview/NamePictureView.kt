package com.example.samplecustomview

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.view_name_picture.view.*

class NamePictureView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {
    init {
        inflate(context, R.layout.view_name_picture, this)
        context.obtainStyledAttributes(attrs, R.styleable.NamePictureView).apply {
            userName.text = getString(R.styleable.NamePictureView_name)
            profilePicture.setImageResource(getResourceId(R.styleable.NamePictureView_image, 0))
        }.recycle()
    }
}