package com.example.countlories.ui.landing

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.countlories.R
import com.example.countlories.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFoodFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val args: DetailFoodFragmentArgs by navArgs()

    private val viewModel: LandingViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            Glide.with(view.context)
                .load(args.img)
                .listener(object: RequestListener<Drawable> {
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        TODO("Not yet implemented")
                    }

                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        showLoading(false)
                        return false
                    }

                })
                .into(ivFood)
            tvName.text = args.foodName
            tvDesc.text = args.foodDesc
            tvNumCal.text = args.foodCal
            tvNumCarb.text = args.foodCarb
            tvNumFat.text = args.foodFat
            tvNumProtein.text = args.foodProtein
        }

        viewModel.isFavoriteFood(args.foodId)
        setupViewModel()
        binding.ivBack.setOnClickListener(this)
        binding.fabAddTrack.setOnClickListener(this)
        binding.ivFavorite.setOnClickListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setupViewModel() {
        viewModel.addedToTrack.observe(viewLifecycleOwner) {
            when(it){
                1 -> {
                    toastMaker("Berhasil menambah ke tracker")
                    viewModel.setAddToTrackerDone()
                }
                2 -> {
                    toastMaker("Tracker gagal di tambahkan")
                }
            }
        }
        viewModel.isFavorite.observe(viewLifecycleOwner) {
            if (it){
                binding.ivFavorite.setImageDrawable(ContextCompat.getDrawable(binding.ivFavorite.context,R.drawable.ic_baseline_favorite_24))
            }
            else{
                binding.ivFavorite.setImageDrawable(ContextCompat.getDrawable(binding.ivFavorite.context,R.drawable.ic_baseline_favorite_border_24))
            }
        }
    }

    private fun showLoading(isLoading: Boolean = false) {
        binding.pbDetail.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.iv_back -> {
                findNavController().navigate(R.id.action_fragment_detail_page_to_landingFragment)
            }
            R.id.fab_add_track -> {
                viewModel.addToTracker(args.foodId)
            }
            R.id.iv_favorite -> {
                viewModel.setFavorite(args.foodId)
            }
        }
    }

    private fun toastMaker(msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

}