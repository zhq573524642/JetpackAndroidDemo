package com.zhq.jetpackandroid.old.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.zhq.jetpackandroid.R
import com.zhq.jetpackandroid.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.btnNavigateToCategory.setOnClickListener {

//            Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_loginFragment);//跳不了
            navController.navigate(R.id.navigate_to_category_fragment)
        }

        binding.btnIntentDeepLink.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("zhq://www.zhq.com/张慧强aa/29?sex=男&className=1304班")
            startActivity(intent)
        }

        binding.btnH5DeepLink.setOnClickListener {

        }

    }

}