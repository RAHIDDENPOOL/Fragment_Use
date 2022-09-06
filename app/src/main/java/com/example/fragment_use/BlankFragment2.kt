package com.example.fragment_use

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.fragment_use.databinding.Fragment2Binding


class BlankFragment2 : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        dataModel.mFF2.observe(activity as LifecycleOwner) {
            binding.tvMassage.text = it
        }
        binding.bSentToFrag1.setOnClickListener {
            dataModel.mFF1.value = "Hello from Fragment 2"
        }
        binding.bSentToActivity.setOnClickListener {
            dataModel.messageForActivity.value = "Hello activity from fragment 2"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment2()
    }
}