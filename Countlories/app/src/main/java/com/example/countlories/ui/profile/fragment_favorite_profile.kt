import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.countlories.R

class FavoriteFragment : Fragment() {

    private lateinit var favoriteRecyclerView: RecyclerView
    private lateinit var favoriteAdapter: FavoriteAdapter
    private val favoriteList = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_favorite_profile, container, false)

        favoriteRecyclerView = view.findViewById(R.id.favoriteRecyclerView)
        favoriteAdapter = FavoriteAdapter(favoriteList)

        favoriteRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = favoriteAdapter
        }

        // Tambahkan data ke daftar favorite
        favoriteList.add("Item A")
        favoriteList.add("Item B")
        favoriteList.add("Item C")

        return view
    }
}
