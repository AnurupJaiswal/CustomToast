package com.anurupjaiswal.mylibrary

import android.content.Context
import android.widget.Toast

object CustomToast {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}