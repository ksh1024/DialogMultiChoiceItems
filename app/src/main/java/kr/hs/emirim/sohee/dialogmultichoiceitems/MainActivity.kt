package kr.hs.emirim.sohee.dialogmultichoiceitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener{
            var gameArray = arrayOf("하프라이프 시리즈","포탈 시리즈","라스트 오브 어스 : 파트1")
            var checkArray = booleanArrayOf(false,true,false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 게임은?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setMultiChoiceItems(gameArray,checkArray){
                dialog,index,isChecked ->
                btn.text = gameArray[index]
            }
            dlg.setNegativeButton("닫기",null)
            dlg.show()
        }
    }
}