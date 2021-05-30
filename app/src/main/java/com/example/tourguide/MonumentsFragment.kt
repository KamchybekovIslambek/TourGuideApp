package com.example.tourguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MonumentsFragment : Fragment() {
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
                "Manas Monument",
                "BISHKEK",
                R.drawable.manasmonument,
                getString(R.string.manasmonument),
                getString(R.string.addressmanasmonument),
                getString(R.string.phonemanasmonument),
                "42.876686,74.603762"
            )
        )
        location.add(
            Location(
                "Chyngyz Aitmatov Monument",
                "BISHKEK",
                R.drawable.chyngyzmonument,
                getString(R.string.chyngyzmonument),
                getString(R.string.addresschyngyzmonument),
                getString(R.string.phonechyngyzmonument),
                "42.87437, 74.603548"
            )
        )
        location.add(
            Location(
                "Kurmanjan Datka Monument",
                "BISHKEK",
                R.drawable.kurmanjandatkamonument,
                getString(R.string.kurmanjandatka),
                getString(R.string.addresskurmanjandatka),
                getString(R.string.phonekurmanjandatka),
                "42.877239, 74.607103"
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