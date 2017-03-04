package com.xmbaby.babyutils

import android.app.Activity

/**
 * Created by yhz on 2017/1/10.
 * 简化系统的方法
 */

fun android.support.v4.app.Fragment.Log(msg: String) = activity.Log(msg)

fun android.support.v4.app.Fragment.Log(tag: String, msg: String) = activity.Log(tag, msg)

fun android.app.Fragment.Log(tag: String) = activity.Log(tag)

fun android.app.Fragment.Log(tag: String, msg: String) = activity.Log(tag, msg)

fun Activity.Log(msg: String) = android.util.Log.e("look", msg)

fun Activity.Log(tag: String, msg: String) = android.util.Log.e(tag, msg)

fun Log(msg: String) = android.util.Log.e("look", msg)