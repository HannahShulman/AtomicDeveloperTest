package uk.co.atomicmedia.developertest.ui.view.headlines

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uk.co.atomicmedia.developertest.databinding.FragmentHeadlinesBinding

class HeadlinesFragment : Fragment() {
    private var _binding: FragmentHeadlinesBinding? = null
    private val binding: FragmentHeadlinesBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHeadlinesBinding.inflate(inflater, container, false)
        binding.btnHeadline.setOnClickListener {
            findNavController().navigate(
                HeadlinesFragmentDirections.actionHeadlinesFragmentToStoryFragment("123")
            )
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}