package com.neppplus.jickbangcopy_20211104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20211104.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRooms.add(RoomData(8000, "서울시 동대문구 , 5, 1번째방입니다."))
        mRooms.add(RoomData(18000,"서울시 서대문구", 0,"2번째방입니다"))
        mRooms.add(RoomData(29700,"경기도 고양시", 17,"3번째방입니다"))
        mRooms.add(RoomData(4300,"서울시 중구,2,""4번째방입니다."))
        mRooms.add(RoomData(43300,"서울시 남구,2,""5번째방입니다."))

}