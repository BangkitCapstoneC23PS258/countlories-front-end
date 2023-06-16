package com.example.countlories.ui.auth

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.countlories.R
import com.example.countlories.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    private val viewModel: AuthViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(layoutInflater, container, false)
        return return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showLoading(false)
        setupModel()
        binding.registerButton.setOnClickListener(this)
        binding.tvLogin.setOnClickListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun showLoading(isLoading: Boolean = false) {
        binding.pbRegister.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    private fun setupModel(){
        viewModel.isLoading.observe(viewLifecycleOwner) {
            showLoading(it)
        }

        viewModel.isRegistered.observe(viewLifecycleOwner) { response ->
            if (response != null) {
                AlertDialog.Builder(requireActivity())
                    .setMessage("Akun berhasil dibuat")
                    .setCancelable(false)
                    .setPositiveButton("Ok") { _, _ ->
                        findNavController().navigate(R.id.action_fragment_register_to_fragment_login)
                    }
                    .create()
                    .show()
            } else {
                toastMaker("Email telah digunakan")
            }
        }
    }

    private fun toastMaker(msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.tv_login -> findNavController().navigate(R.id.action_fragment_register_to_fragment_login)
            R.id.register_button -> register()
        }
    }

    private fun register() {
        val username = binding.etUsername.text.toString()
        val layoutEmail = binding.tlEmail
        val email = binding.etEmail.text.toString()
        val layoutPassword = binding.tlPass
        val password = binding.etPassword.text.toString()


        if (username.isEmpty() || email.isEmpty() || !TextUtils.isEmpty(layoutEmail.error) || password.isEmpty() || !TextUtils.isEmpty(layoutPassword.error))
            toastMaker("Periksa kembali form!")
        else
            viewModel.register(username,email,password)
    }

    companion object {
        const val TAG = "Fragment register"
    }
}