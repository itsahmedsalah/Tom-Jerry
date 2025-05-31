package com.example.tomjerry

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.ui.theme.Orange

@Preview(showSystemUi = true)
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeContentPadding()
            .padding(all = 14.dp),

        ) {
        Text(
            "Account",
            fontSize = 18.sp,
            fontWeight = FontWeight(700)
        )
        Text(
            "Edit and manage your account",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp), contentAlignment = Alignment.Center
        ) {
            Column(

                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.jerry_on_the_beach),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                )
                Spacer(Modifier.height(20.dp))
                Text(
                    "Change Profile Picture",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W800,
                    color = Orange
                )
            }
        }

    }

}