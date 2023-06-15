import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.countlories.R

class TrackFragment : Fragment() {

    private lateinit var trackRecyclerView: RecyclerView
    private lateinit var trackAdapter: TrackAdapter
    private val trackList = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_track_profile, container, false)

        trackRecyclerView = view.findViewById(R.id.trackRecyclerView)
        trackAdapter = TrackAdapter(trackList)

        trackRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = trackAdapter
        }

        // Tambahkan data ke daftar track
        trackList.add("Item 1")
        trackList.add("Item 2")
        trackList.add("Item 3")

        return view
    }
}
