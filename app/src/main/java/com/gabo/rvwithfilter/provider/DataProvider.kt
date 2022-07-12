package com.gabo.rvwithfilter.provider

import com.gabo.rvwithfilter.R
import com.gabo.rvwithfilter.model.Filter
import com.gabo.rvwithfilter.model.ListItem

object DataProvider {
    fun getFilterList(): MutableList<Filter> {
        return mutableListOf(
            Filter(R.drawable.ic_empty, "All", R.color.darkBlue, R.color.txtGray, true),
            Filter(R.drawable.ic_party, "Party", R.color.darkBlue, R.color.txtGray),
            Filter(R.drawable.ic_camping, "Camping", R.color.darkBlue, R.color.txtGray),
            Filter(R.drawable.ic_party, "Category1", R.color.darkBlue, R.color.txtGray),
            Filter(R.drawable.ic_camping, "Category2", R.color.darkBlue, R.color.txtGray),
            Filter(R.drawable.ic_camping, "Category3", R.color.darkBlue, R.color.txtGray)
        )
    }

    fun getItemsList(): MutableList<ListItem> {
        return mutableListOf(
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$120", getFilterList()[0]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$120", getFilterList()[1]),
            ListItem(R.drawable.photo_yellow_clothes, "yellow Clothes", "$140", getFilterList()[2]),
            ListItem(R.drawable.photo_blue_clothes, "blue Clothes", "$160", getFilterList()[3]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$180", getFilterList()[4]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$220", getFilterList()[5]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$120", getFilterList()[0]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$120", getFilterList()[1]),
            ListItem(R.drawable.photo_yellow_clothes, "yellow Clothes", "$140", getFilterList()[2]),
            ListItem(R.drawable.photo_blue_clothes, "blue Clothes", "$160", getFilterList()[3]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$180", getFilterList()[4]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$220", getFilterList()[5]),
            ListItem(R.drawable.photo_yellow_clothes, "red Clothes", "$120", getFilterList()[0]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$120", getFilterList()[1]),
            ListItem(R.drawable.photo_yellow_clothes, "yellow Clothes", "$140", getFilterList()[2]),
            ListItem(R.drawable.photo_blue_clothes, "blue Clothes", "$160", getFilterList()[3]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$180", getFilterList()[4]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$220", getFilterList()[5]),
            ListItem(R.drawable.photo_yellow_clothes, "red Clothes", "$120", getFilterList()[0]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$120", getFilterList()[1]),
            ListItem(R.drawable.photo_yellow_clothes, "yellow Clothes", "$140", getFilterList()[2]),
            ListItem(R.drawable.photo_blue_clothes, "blue Clothes", "$160", getFilterList()[3]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$180", getFilterList()[4]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$220", getFilterList()[5]),
            ListItem(R.drawable.photo_blue_clothes, "red Clothes", "$120", getFilterList()[0]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$120", getFilterList()[1]),
            ListItem(R.drawable.photo_yellow_clothes, "yellow Clothes", "$140", getFilterList()[2]),
            ListItem(R.drawable.photo_blue_clothes, "blue Clothes", "$160", getFilterList()[3]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$180", getFilterList()[4]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$220", getFilterList()[5]),
            ListItem(R.drawable.photo_blue_clothes, "red Clothes", "$120", getFilterList()[0]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$120", getFilterList()[1]),
            ListItem(R.drawable.photo_yellow_clothes, "yellow Clothes", "$140", getFilterList()[2]),
            ListItem(R.drawable.photo_blue_clothes, "blue Clothes", "$160", getFilterList()[3]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$180", getFilterList()[4]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$220", getFilterList()[5]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$120", getFilterList()[0]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$120", getFilterList()[1]),
            ListItem(R.drawable.photo_yellow_clothes, "yellow Clothes", "$140", getFilterList()[2]),
            ListItem(R.drawable.photo_blue_clothes, "blue Clothes", "$160", getFilterList()[3]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$180", getFilterList()[4]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$220", getFilterList()[5]),
            ListItem(R.drawable.photo_blue_clothes, "red Clothes", "$120", getFilterList()[0]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$120", getFilterList()[1]),
            ListItem(R.drawable.photo_yellow_clothes, "yellow Clothes", "$140", getFilterList()[2]),
            ListItem(R.drawable.photo_blue_clothes, "blue Clothes", "$160", getFilterList()[3]),
            ListItem(R.drawable.photo_red_clothes, "red Clothes", "$180", getFilterList()[4]),
            ListItem(R.drawable.photo_black_clothes, "black Clothes", "$220", getFilterList()[5]),
        ).toMutableList()
    }
}
