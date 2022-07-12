package com.gabo.rvwithfilter

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.gabo.rvwithfilter.adapter.FilterAdapter
import com.gabo.rvwithfilter.adapter.ItemsListAdapter
import com.gabo.rvwithfilter.databinding.ActivityMainBinding
import com.gabo.rvwithfilter.model.Filter
import com.gabo.rvwithfilter.model.ListItem
import com.gabo.rvwithfilter.provider.DataProvider.getFilterList
import com.gabo.rvwithfilter.provider.DataProvider.getItemsList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var itemListAdapter: ItemsListAdapter
    private lateinit var filterAdapter: FilterAdapter

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAdapters()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    @SuppressLint("NotifyDataSetChanged")
    private fun setupAdapters() {
        itemListAdapter = ItemsListAdapter()

        with(binding.rvListItems) {
            adapter = itemListAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 2)
        }

        itemListAdapter.submitList(getItemsList())

        with(binding.rvFilters) {
            filterAdapter = FilterAdapter { filter ->
                val newFilterList = getFilterList()
                if (!filter.isActive) {
                    newFilterList.find { it.filterName == getFilterList()[0].filterName }?.isActive =
                        false
                    newFilterList.find { it == filter }?.isActive = true
                    filterAdapter.submitList(newFilterList)
                    filterAdapter.notifyDataSetChanged()
                    if (filter.filterName == getFilterList()[0].filterName) {
                        itemListAdapter.submitList(getItemsList())
                    } else {
                        itemListAdapter.submitList(filterItems(filter))
                    }
                }
            }

            adapter = filterAdapter
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            filterAdapter.submitList(getFilterList())
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun filterItems(filter: Filter): MutableList<ListItem> {
        val list = getItemsList()
        list.removeIf { filter.filterName != it.categoryType.filterName }
        return list
    }
}