package com.example.orderitem.Interface

import android.view.View

interface ItemClickListener {
    fun onItemClick(view: View, pos:Int, isLongClick:Boolean)
}