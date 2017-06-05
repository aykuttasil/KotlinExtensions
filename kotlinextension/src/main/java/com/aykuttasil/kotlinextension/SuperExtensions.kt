package com.aykuttasil.kotlinextension

import android.content.Context
import android.content.res.AssetManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.nio.charset.Charset


fun AssetManager.fileAsString(subdirectory: String, filename: String): String {
    return open("$subdirectory/$filename").use {
        it.readBytes().toString(Charset.defaultCharset())
    }
}

/*
fun Context.color(@ColorRes id: Int) = when {
    isAtLeastMarshmallow() -> resources.getColor(id, null)
    else -> resources.getColor(id)
}
*/

fun Context.inflate(res: Int, parent: ViewGroup? = null): View {
    return LayoutInflater.from(this).inflate(res, parent, false)
}


