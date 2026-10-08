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

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.logoharvard),
                contentDescription = stringResource(R.string.logo_desc),
                modifier = Modifier.size(80.dp)
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {

            Text(
                text = nama,
                fontSize = 20.sp,
                fontFamily = namaFontFamily,
                fontWeight = namaFontWeight,
                color = colorResource(namaColor)
            )

            if (telepon != null) {
                Text(
                    text = telepon,
                    fontSize = 15.sp,
                    color = colorResource(teleponColor)
                )
            }
            Text(
                text = alamat,
                fontSize = 15.sp,
                color = colorResource(alamatColor)
            )

            Image(
                painter = painterResource(R.drawable.logoharvard),
                contentDescription = stringResource(R.string.logo_desc),
                modifier = Modifier.size(80.dp)
            )

        }

        @Composable
        fun ActivitasPertama(modifier: Modifier = Modifier) {
            Column(
                modifier = modifier
                    .padding(top = 100.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = stringResource(R.string.prodi),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.univ),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(25.dp))

                CardItem(
                    nama = stringResource(R.string.nama_0),
                    alamat = stringResource(R.string.alamat_0),
                    bgColor = R.color.card_0_bg,
                    namaColor = R.color.text_white,
                    alamatColor = R.color.text_yellow,
                    namaFontFamily = FontFamily.Cursive,
                    namaFontWeight = FontWeight.Normal
                )

                CardItem(
                    nama = stringResource(R.string.nama_1),
                    telepon = stringResource(R.string.telepon),
                    alamat = stringResource(R.string.alamat_1),
                    bgColor = R.color.card_1_bg,
                    namaColor = R.color.text_white,
                    alamatColor = R.color.text_yellow
                )
            }
        }
    }
}

