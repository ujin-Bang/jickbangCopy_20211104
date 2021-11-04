package com.neppplus.jickbangcopy_20211104.adapters

import android.content.Context
import android.security.identity.AccessControlProfileId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jickbangcopy_20211104.R
import com.neppplus.jickbangcopy_20211104.datas.RoomData

class RoomAdapter(val mContext: Context,
                  val resId: Int,
                  val mList: ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext,resId,mList) {

                  val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temRow = convertView
        if (temRow == null) {
            temRow = mInflater.inflate(R.layout.room_list_item, null)
        }
        val row = temRow!!

        val roomData = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddrassAndFloor = row.findViewById<TextView>(R.id.txtAddrassAndFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtDescription.text = roomData.description


        return row

    }

}