package com.zhq.jetpackandroid.old.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

/**
 * @Author ZhangHuiQiang
 * @Date 2024/2/19 17:27
 * Description
 */
open class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Companion.TAG, "===onCreate: ")
    }

    companion object {
        private var TAG = this.javaClass.simpleName
    }
}