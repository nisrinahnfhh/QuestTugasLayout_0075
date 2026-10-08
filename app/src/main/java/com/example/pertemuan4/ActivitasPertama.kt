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

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(bgColor)
        )
    ) {

        Code:
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
    }
}

