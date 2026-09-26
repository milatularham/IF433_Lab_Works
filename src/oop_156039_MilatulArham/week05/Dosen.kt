package oop_156039_MilatulArham.week05

class Dosen(nama:String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$name] sedang menyiapkan materi perkuliahan dan mrevisi RPKPS.")
    }

    fun mengajar() {
        println("[$name] sedang mengajar mahasiswa di kelas.")
    }
}