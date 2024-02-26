package com.zhq.jetpackandroid.old.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zhq.jetpackandroid.R
import com.zhq.jetpackandroid.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {
    lateinit var binding: FragmentCategoryBinding
    var count = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        if (savedInstanceState!=null){
            Log.d(TAG, "===CategoryFragment-onCreateView: "+savedInstanceState)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState!=null){
            Log.d(TAG, "===CategoryFragment-onViewCreated: "+savedInstanceState)
        }
        binding.btnCount.setOnClickListener {
            count++
            binding.tvCategoryTitle.text = "CategoryFragmet：${count}"
        }
        binding.btnNavigateToTagsFragment.setOnClickListener {
            findNavController().navigate(R.id.navigate_to_tags_fragment)
        }
    }

    companion object {
        private const val TAG = "CategoryFragment"
    }

}