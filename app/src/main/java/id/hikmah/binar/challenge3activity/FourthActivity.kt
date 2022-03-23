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
        binding.btnBack.setOnClickListener{
            onBackPressed()
        }
    }

    override fun onBackPressed(){
        val intent = Intent()
        val inUsia = binding.inputUsia.text.toString()
        val inAlamat = binding.inputAlamat.text.toString()
        val inPekerjaan = binding.inputPekerjaan.text.toString()
        intent.putExtra("data_usia",inUsia)
        intent.putExtra("data_alamat", inAlamat)
        intent.putExtra("data_pekerjaan", inPekerjaan)
        val dataPage4 = DataPage4(inUsia, inAlamat, inPekerjaan)
        intent.putExtra("dataaaa",dataPage4)
        Intent (this, ThirdActivity::class.java)
        setResult(RESULT_OK, intent)
        super.onBackPressed()
    }

}