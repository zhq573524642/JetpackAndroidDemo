package com.zhq.jetpackandroid.old.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.zhq.jetpackandroid.R
import com.zhq.jetpackandroid.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    lateinit var binding:FragmentUserBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentUserBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnReopenCategoryFragment.setOnClickListener {
            findNavController().navigate(R.id.category_fragment,
            null,
            NavOptions.Builder().setRestoreState(true).build())
        }
    }
}