package com.example.pertemuan4

@Composable
fun CardItem(
    nama: String,
    alamat: String,
    bgColor: Int,
    namaColor: Int,
    alamatColor: Int,
    modifier: Modifier = Modifier,
    telepon: String? = null,
    teleponColor: Int = R.color.text_cyan,
    namaFontFamily: FontFamily = FontFamily.Default,
    namaFontWeight: FontWeight = FontWeight.Bold
) {

