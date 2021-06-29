package jp.techacademy.ayumi.preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preference = PreferenceManager.getDefaultSharedPreferences(this)

        putButton.setOnClickListener {
            val editor = preference.edit()
            editor.putString("TEXT", editText.text.toString())
            editor.commit()
        }

        getButton.setOnClickListener {
            editText.setText(preference.getString("TEXT", "まだ保存されていません"))
        }
    }
}