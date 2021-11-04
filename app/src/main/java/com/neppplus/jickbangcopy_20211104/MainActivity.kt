package com.neppplus.jickbangcopy_20211104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20211104.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20211104.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRooms.add(RoomData(8000, "서울시 동대문구" , 5, "1번째방입니다."))
        mRooms.add(RoomData(18000, "강원도 철원군", 0, "2번째방입니다"))
        mRooms.add(RoomData(29700, "경기도 고양시", 17, "3번째방입니다"))
        mRooms.add(RoomData(4300, "서울시 중구",-3, "4번째방입니다."))
        mRooms.add(RoomData(43300, "부산 동구", 2, "5번째방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRooms)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->


        val clickedRoom = mRooms[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
        myIntent.putExtra("room", clickedRoom)
        startActivity(myIntent)
        }
    }
}