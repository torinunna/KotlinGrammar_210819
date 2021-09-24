package com.yujin.kotlingrammar_210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myName : String

        myName = "조경진"

        Log.d("변수확인", myName)

        var myBirthYear : Int
        myBirthYear = 1988
        Log.d("출생년도", myBirthYear.toString())

        val userAge = 13

        if ( userAge >= 20 ) {
            Log.d("나이확인",  "성인입니다.")
        }
        else if ( userAge >= 17 ) {
            Log.d("나이확인", "고등학생입니다.")
        }
        else if ( userAge >= 14 ) {
            Log.d("나이확인", "중학생입니다.")
        }
        else if ( userAge >= 8 ) {
            Log.d("나이확인", "초등학생입니다.")
        }
        else {
            Log.d("나이확인", "미취학아동입니다.")
        }


        val companyASalary = 5800
        val companyADistance = 12.5
        val companyABalance = true

        if ( companyASalary >= 4000 ) {

        }


        if ( companyADistance < 10 && companyASalary >= 3000 ) {

        }

        if ( companyABalance || companyASalary >= 5000 ) {

        }


    }
}