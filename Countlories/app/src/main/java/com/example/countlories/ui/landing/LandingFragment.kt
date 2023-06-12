package com.example.countlories.ui.landing

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.example.countlories.R
import com.example.countlories.databinding.FragmentLandingBinding
import java.io.File

class LandingFragment : Fragment(), View.OnClickListener {
    private var _binding: FragmentLandingBinding? = null
    private val binding get() = _binding!!

    private val rotateOpen: Animation by lazy { AnimationUtils.loadAnimation(context,R.anim.rotate_open_anim)}
    private val rotateClose: Animation by lazy { AnimationUtils.loadAnimation(context,R.anim.rotate_close_anim)}
    private val fromBottom: Animation by lazy { AnimationUtils.loadAnimation(context,R.anim.from_bottom_anim)}
    private val toBottom: Animation by lazy { AnimationUtils.loadAnimation(context,R.anim.to_bottom_anim)}

    private var clicked = false

    private var getFile: File? = null
    private lateinit var currentPhotoPath: String

    private val launcherIntentGallery = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == AppCompatActivity.RESULT_OK) {
            val selectedImg = result.data?.data as Uri
            selectedImg.let { uri ->
                val myFile = uriToFile(uri, requireContext())
                getFile = myFile
                toastMaker("Berhasil memilih gambar")
            }
        } else
            toastMaker("Berhasil memilih gambar")
    }

    private val launcherIntentCamera = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        if (it.resultCode == AppCompatActivity.RESULT_OK) {
            val myFile = File(currentPhotoPath)

            myFile.let { file ->
                getFile = file
            }
        }
    }

    private fun allPermissionsGranted() = REQUIRED_PERMISSIONS.all {
        ContextCompat.checkSelfPermission(requireContext(), it) == PackageManager.PERMISSION_GRANTED
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLandingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButton()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setupButton() {
        binding.fabMedia.setOnClickListener(this)
        binding.fabCamera.setOnClickListener(this)
        binding.fabGallery.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.fab_media -> {
                setVisible(clicked)
                setAnim(clicked)
                setClickable(clicked)
                if (!allPermissionsGranted()) {
                    ActivityCompat.requestPermissions(
                        requireActivity(),
                        REQUIRED_PERMISSIONS,
                        REQUEST_CODE_PERMISSIONS
                    )
                }
                clicked = if (clicked == true) false else true
            }
            R.id.fab_camera -> {
                openCamera()
            }
            R.id.fab_gallery -> {
                openGallery()
            }
        }
    }

    private fun openGallery() {
        val intent = Intent()
        intent.action = Intent.ACTION_GET_CONTENT
        intent.type = "image/*"
        val chooser = Intent.createChooser(intent, "Pilih gambar")
        launcherIntentGallery.launch(chooser)
    }

    private fun openCamera() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        intent.resolveActivity(requireActivity().packageManager)

        createTempFile(requireActivity().application).also {
            val photoURI: Uri = FileProvider.getUriForFile(
                requireContext(),
                "com.example.countlories",
                it
            )
            currentPhotoPath = it.absolutePath
            intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
            launcherIntentCamera.launch(intent)
        }
    }

    private fun setVisible(clicked: Boolean) {
        if (!clicked){
            binding.fabGallery.visibility = View.VISIBLE
            binding.fabCamera.visibility = View.VISIBLE
        }else{
            binding.fabGallery.visibility = View.INVISIBLE
            binding.fabCamera.visibility = View.INVISIBLE
        }
    }

    private fun setAnim(clicked: Boolean) {
        if (!clicked){
            binding.fabGallery.startAnimation(fromBottom)
            binding.fabCamera.startAnimation(fromBottom)
            binding.fabMedia.startAnimation(rotateOpen)
        } else{
            binding.fabGallery.startAnimation(toBottom)
            binding.fabCamera.startAnimation(toBottom)
            binding.fabMedia.startAnimation(rotateClose)
        }
    }

    private fun setClickable(clicked: Boolean) {
        if (!clicked){
            binding.fabGallery.isClickable = true
            binding.fabCamera.isClickable = true
        } else{
            binding.fabGallery.isClickable = false
            binding.fabCamera.isClickable = false
        }
    }

    private fun toastMaker(msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    companion object {
        const val TAG = "Landing Fragment"
        private val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)
        private const val REQUEST_CODE_PERMISSIONS = 10
    }
}