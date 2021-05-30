package com.example.tourguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantsFragment : Fragment() {
    private var linearLayoutManager: LinearLayoutManager? = null
    var adapter: LocationAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.location_list, container, false)

        val location = ArrayList<Location>()
        location.add(
            Location(
                "Torro Burger",
                "Pervomayskiy",
                R.drawable.torroburger,
                getString(R.string.torroburger),
                getString(R.string.addresstorroburger),
                getString(R.string.phonetorroburger),
                "42.869916, 74.590703"
            )
        )
        location.add(
            Location(
                "Avenue",
                "Pervomayskiy",
                R.drawable.avenue,
                getString(R.string.Avenue),
                getString(R.string.addressAvenue),
                getString(R.string.phoneAvenue),
                "42.866946, 74.608378"
            )
        )
        location.add(
            Location(
                "Supara",
                "Chunkurchack",
                R.drawable.supara,
                getString(R.string.supara),
                getString(R.string.addresssupara),
                getString(R.string.phonesupara),
                "42.629472, 74.622061"
            )
        )
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.rvLocation)
        linearLayoutManager = LinearLayoutManager(activity)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = linearLayoutManager
        adapter = LocationAdapter()
        recyclerView.adapter = adapter
        adapter!!.setData(location)
        return rootView
    }

}