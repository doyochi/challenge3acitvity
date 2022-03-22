package id.hikmah.binar.challenge3activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.hikmah.binar.challenge3activity.databinding.ActivityFifthBinding
import id.hikmah.binar.challenge3activity.databinding.ActivityThirdBinding

class FifthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val nama = binding.viewNama
        val usia = binding.viewUsia
        val getUsia = bundle?.getString("data_usia")
        val ganep: String
//        if (getUsia %2 == 0) {
//            ganep = "Genap"
//        } else {
//            ganep = "Ganjil"
//        }
        val alamat = binding.viewAlamat
        val pekerjaan = binding.viewPekerjaan
        nama.setText("Hello, " + bundle?.getString("data_nama") + " !")
        usia.setText("Usia anda " + bundle?.getString("data_usia"))
//        usia.setText("Usia anda, bernilai " + ganep)
        alamat.setText("Alamat anda " + bundle?.getString("data_alamat"))
        pekerjaan.setText("Pekerjaan anda " + bundle?.getString("data_pekerjaan"))
    }
}