package com.example.countlories.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.countlories.R
import com.example.countlories.databinding.FragmentLoginBinding

class fragment_login : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel: AuthViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupModel()
    }

    private fun setupModel() {
        viewModel.isLoading.observe(viewLifecycleOwner) {
            showLoading(it)
        }

        viewModel.loginProc.observe(viewLifecycleOwner) {
//            when (it) {
//                1 -> {
//                    toastMaker(getString(R.string.login_berhasil))
//                    findNavController().navigate(R.id.action_loginFragment_to_landingFragment)
//                    viewModel.setLoginDone()
//                }
//                2 -> {
//                    toastMaker(getString(R.string.email_pass_salah))
//                }
//            }

        }
    }

    private fun toastMaker(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    private fun showLoading(isLoading: Boolean = false) {
//        binding.pbLogin.visibility = if (isLoading) View.VISIBLE else View.GONE
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val TAG = "Fragment Login"
    }
}