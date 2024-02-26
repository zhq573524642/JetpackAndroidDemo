package com.zhq.jetpackandroid.old.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.zhq.jetpackandroid.R
import com.zhq.jetpackandroid.databinding.FragmentTagsBinding


class TagsFragment : Fragment() {
  lateinit var binding: FragmentTagsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentTagsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNavigateToUserFragment.setOnClickListener {
            findNavController().navigate(R.id.navigate_to_user_fragment,
            null,
            NavOptions.Builder().setPopUpTo(
                destinationId = R.id.home_fragment,
                inclusive = false,
                saveState = true
            ).build())
        }
    }
}