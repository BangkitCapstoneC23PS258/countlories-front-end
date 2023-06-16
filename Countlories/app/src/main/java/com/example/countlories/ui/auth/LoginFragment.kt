package com.example.countlories.ui.auth

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.countlories.R
import com.example.countlories.databinding.FragmentLoginBinding
import com.example.countlories.helper.LoginPreferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment(), View.OnClickListener {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel: AuthViewModel by activityViewModels()

    @Inject
    lateinit var loginPref: LoginPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (loginPref.isLogin()){
            findNavController().navigate(R.id.action_fragment_login_to_landingFragment)
        }

        _binding = FragmentLoginBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showLoading(false)
        setupModel()
        binding.tvRegister.setOnClickListener(this)
        binding.loginButton.setOnClickListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setupModel() {
        viewModel.isLoading.observe(viewLifecycleOwner) {
            showLoading(it)
        }

        viewModel.loginProc.observe(viewLifecycleOwner) {
            when (it) {
                1 -> {
                    toastMaker("Login berhasil")
                    findNavController().navigate(R.id.action_fragment_login_to_landingFragment)
                    viewModel.setLoginDone()
                }
                2 -> {
                    toastMaker("Password / Email salah")
                }
            }

        }
    }

    private fun toastMaker(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    private fun showLoading(isLoading: Boolean = false) {
        binding.pbLogin.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.login_button -> loginFun()
            R.id.tv_register -> findNavController().navigate(R.id.action_fragment_login_to_fragment_register)
        }
    }

    private fun loginFun() {
        val layoutEmail = binding.tlEmail
        val email = binding.etEmail.text.toString()
        val layoutPassword = binding.tlPass
        val password = binding.etPassword.text.toString()

        if (email.isEmpty() || !TextUtils.isEmpty(layoutEmail.error) || password.isEmpty() || !TextUtils.isEmpty(
                layoutPassword.error
            )
        ) {
            toastMaker("Periksa kembali form")
        } else
            viewModel.login(email, password)
    }

    companion object {
        const val TAG = "Fragment Login"
    }

}