package com.codefororlando.petadoption.search

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.SearchView
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import com.codefororlando.petadoption.R

/**
 * Created by Ryan on 4/2/2018.
 */
class PetSearchView : ConstraintLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_search, this)
    }




}