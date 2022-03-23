package id.hikmah.binar.challenge3activity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

class Data4 {
}

@Parcelize
data class DataPage4(
    val usia: String,
    val alamat: String,
    val pekerjaan: String
): Parcelable