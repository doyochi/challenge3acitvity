package id.hikmah.binar.challenge3activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import id.hikmah.binar.challenge3activity.SecondActivity.Companion.KEY_NAME
import id.hikmah.binar.challenge3activity.databinding.ActivityThirdBinding
import kotlinx.serialization.Serializable

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        moveToFourthActivity()

        val nama = binding.viewNama
        nama.setText("Hello, " + intent.getStringExtra("data_nama") + " !")
    }
    private fun moveToFourthActivity(){
        binding.btnTo4.setOnClickListener {
            val dataNama = binding.viewNama
            intent.putExtra("data_nama",dataNama.text.toString())
            val intent = Intent (this, FourthActivity::class.java)
            getResult.launch(intent)
        }
    }
    private val getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == RESULT_OK){
            val dataPage4 = it.data?.getParcelableExtra<DataPage4>("dataaaa")
            binding.apply {
                viewUsia.text = dataPage4?.usia
                viewUsia.visibility = View.VISIBLE
                viewAlamat.text = dataPage4?.alamat
                viewAlamat.visibility = View.VISIBLE
                viewPekerjaan.text = dataPage4?.pekerjaan
                viewPekerjaan.visibility = View.VISIBLE
            }
        }
    }
}