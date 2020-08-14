fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double

    // to do
    volume = hitungvolume(panjang.toDouble(),lebar,tinggi.toDouble()).toString().toDouble()
    println("Volume dari balok mempunyai panjang $panjang, lebar $lebar, dan tinggi $tinggi ini adalah $volume")

}

fun hitungvolume(p:Double, l:Double, t:Double) : Float {
    val v = p + l + t

    // to do
    return v.toFloat()
}