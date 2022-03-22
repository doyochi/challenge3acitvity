package id.hikmah.binar.challenge3activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.hikmah.binar.challenge3activity.databinding.ActivityFourthBinding
import id.hikmah.binar.challenge3activity.databinding.ActivitySecondBinding

class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        moveToFifthActivity()
    }

    private fun moveToFifthActivity(){
        binding.btnTo5.setOnClickListener {
            val usia = binding.inputUsia
            val alamat = binding.inputAlamat
            val pekerjaan = binding.inputPekerjaan
            val bundle = Bundle()
            bundle.putString("data_usia",usia.text.toString())
            bundle.putString("data_alamat",alamat.text.toString())
            bundle.putString("data_pekerjaan",pekerjaan.text.toString())
            val intent = Intent (this, FifthActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

}