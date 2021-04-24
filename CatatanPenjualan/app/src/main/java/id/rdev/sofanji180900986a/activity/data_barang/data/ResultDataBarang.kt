package id.rdev.sofanji180900986a.activity.data_barang.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import id.rdev.sofanji180900986a.model.Barang

@Generated("com.robohorse.robopojogenerator")
data class ResultDataBarang(

    @field:SerializedName("barang")
	val barang: List<Barang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)