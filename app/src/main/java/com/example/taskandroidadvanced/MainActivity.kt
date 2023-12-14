package com.example.taskandroidadvanced


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.taskandroidadvanced.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private var wisataList = ArrayList<Wisata>()
    private lateinit var adapter: WisataAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        adapter = WisataAdapter(wisataList)
        recyclerView.adapter = adapter

    }

    private fun addDataToList() {
        wisataList.add(Wisata(R.drawable.pagaruyuang, "Istana Pagaruyuang"))
        wisataList.add(Wisata(R.drawable.jamgadang, "Jam Gadang"))
        wisataList.add(Wisata(R.drawable.lawang, "Puncak Lawang"))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_item, menu)

        val searchItem = menu?.findItem(R.id.search)
        val searchView = searchItem?.actionView as SearchView

        // Configure the search info and add any event listeners.

        return super.onCreateOptionsMenu(menu)
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.nav_beranda -> {
                val intent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(intent)
                true
            }

            R.id.nav_history -> {
                val intent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.nav_notifikasi -> {
                val intent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(intent)
                true
            }

            else -> {
                val intent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(intent)
                true
            }
        }
    }
}