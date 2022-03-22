package id.hikmah.binar.challenge3activity

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import id.hikmah.binar.challenge3activity.SecondActivity.Companion.KEY_NAME
import id.hikmah.binar.challenge3activity.databinding.ActivityThirdBinding


class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        moveToFourthActivity()

        val intent = Intent()
        val nama = binding.viewNama
        nama.setText("Hello, " + intent.getStringExtra("data_nama") + " !")
    }
    private fun moveToFourthActivity(){
        binding.btnTo4.setOnClickListener {
            val bundle = Bundle()
            val intent = Intent (this, FourthActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}