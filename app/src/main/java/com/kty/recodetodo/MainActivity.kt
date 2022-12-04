package com.kty.recodetodo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.kty.recodetodo.join.JoinActivity

class MainActivity : AppCompatActivity() {

    private var id : String = ""
    private var pw : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Mainid : TextInputEditText = findViewById(R.id.Mainid)
        val Mainpw : TextInputEditText = findViewById(R.id.Mainpw)

        val LoginBtn : Button = findViewById(R.id.mainLoginBtn)
        val JoinBtn : Button = findViewById(R.id.mainJoinBtn)
        val GoogleBtn : Button = findViewById(R.id.mainGoogleBtn)
        val NaverBtn : Button = findViewById(R.id.mainNaverBtn)
        val KakaoBtn : Button = findViewById(R.id.mainKakaoBtn)

        // 로그인 버튼 클릭 이벤트
        LoginBtn.setOnClickListener {

        }

        // 회원가입 버튼 클릭 이벤트
        JoinBtn.setOnClickListener {

            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)

        }

        // SNS 가입 버튼 클릭 이벤트
        GoogleBtn.setOnClickListener {

        }

        NaverBtn.setOnClickListener {

        }

        KakaoBtn.setOnClickListener {

        }

    }//onCreate()

}