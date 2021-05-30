package com.example.tourguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ParksFragment : Fragment() {
    private var linearLayoutManager: LinearLayoutManager? = null
    private var adapter: LocationAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.location_list, container, false)

        val location = ArrayList<Location>()
        location.add(
            Location(
                "Derjinka",
                "Pervomayski",
                R.drawable.derjinka,
                getString(R.string.derjinka),
                getString(R.string.addressderjinka),
                NO_NUMBER_PROVIDED,
                "42.869962, 74.605934"
            )
        )
        location.add(
            Location(
                "HEALTH PARK",
                "Bishkek",
                R.drawable.healthpark,
                getString(R.string.healthpark),
                getString(R.string.addresshealthpark), NO_NUMBER_PROVIDED,
                "42.833191, 74.587076"
            )
        )
        location.add(
            Location(
                "Botanical Garden",
                "Octyabrskij",
                R.drawable.botsad,
                getString(R.string.botsad),
                getString(R.string.addressbotsad),
                NO_NUMBER_PROVIDED,
                "42.839268, 74.634577"
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