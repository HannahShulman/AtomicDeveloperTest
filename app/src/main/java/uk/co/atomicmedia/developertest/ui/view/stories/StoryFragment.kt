package uk.co.atomicmedia.developertest.ui.view.stories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import uk.co.atomicmedia.developertest.databinding.FragmentStoryBinding

class StoryFragment : Fragment() {
    private var _binding: FragmentStoryBinding? = null
    private val binding: FragmentStoryBinding
        get() = _binding!!

    private val viewModel: StoryViewModel by viewModels()
    private val navArgs by navArgs<StoryFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoryBinding.inflate(inflater, container, false)
        binding.tvId.text = navArgs.storyId
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}