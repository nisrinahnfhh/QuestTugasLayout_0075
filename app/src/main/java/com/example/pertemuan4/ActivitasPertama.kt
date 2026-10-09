package com.example.pertemuan4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


val FontParisienne: FontFamily = FontFamily.Serif
@Composable
fun CardItem(
    nama: String,
    alamat: String,
    bgColor: Int,
    namaColor: Int,
    alamatColor: Int,
    modifier: Modifier = Modifier,
    telepon: String? = null,
    teleponColor: Int = R.color.text_brown
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(bgColor))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logohavard),
                contentDescription = stringResource(R.string.logo_desc),
                modifier = Modifier.size(80.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = nama,
                    fontSize = 22.sp,
                    fontFamily = FontParisienne,
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
            }
            Image(
                painter = painterResource(R.drawable.logohavard),
                contentDescription = stringResource(R.string.logo_desc),
                modifier = Modifier.size(80.dp)
            )
        }
    }
}

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(colorResource(R.color.bg_screen))
            .then(modifier)
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 30.sp,
            fontFamily = FontParisienne,
            color = colorResource(R.color.text_dark)
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_brown)
        )
        Spacer(modifier = Modifier.height(25.dp))

        CardItem(
            nama = stringResource(R.string.nama_0),
            alamat = stringResource(R.string.alamat_0),
            bgColor = R.color.card_0_bg,
            namaColor = R.color.text_cream,
            alamatColor = R.color.text_white
        )
        CardItem(
            nama = stringResource(R.string.nama_1),
            telepon = stringResource(R.string.telepon),
            alamat = stringResource(R.string.alamat_1),
            bgColor = R.color.card_1_bg,
            namaColor = R.color.text_dark,
            alamatColor = R.color.text_dark
        )
        CardItem(
            nama = stringResource(R.string.nama_2),
            telepon = stringResource(R.string.telepon),
            alamat = stringResource(R.string.alamat_2),
            bgColor = R.color.card_2_bg,
            namaColor = R.color.text_cream,
            alamatColor = R.color.text_white,
            teleponColor = R.color.text_cream
        )
        CardItem(
            nama = stringResource(R.string.nama_3),
            telepon = stringResource(R.string.telepon),
            alamat = stringResource(R.string.alamat_3),
            bgColor = R.color.card_3_bg,
            namaColor = R.color.text_dark,
            alamatColor = R.color.text_dark
        )

        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                text = stringResource(R.string.copy),
                fontSize = 12.sp,
                color = colorResource(R.color.text_dark),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 30.dp)
            )
        }
    }
}