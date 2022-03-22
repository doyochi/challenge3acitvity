package id.hikmah.binar.challenge3activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.hikmah.binar.challenge3activity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        moveToThirdActivity()

    }

    private fun moveToThirdActivity(){
        binding.btnTo3.setOnClickListener {
            val nama = binding.inputNama
            val intent = Intent (this, ThirdActivity::class.java)
            intent.putExtra("data_nama",nama.text.toString())
            startActivity(intent)
        }
    }

    companion object {
        const val KEY_NAME = "NAMA"
    }

//    private fun getData() {
//        texNama = intent.getStringExtra(KEY_NAMA)
//        binding.vi
//    }
}