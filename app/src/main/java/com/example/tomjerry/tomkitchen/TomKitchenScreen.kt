package com.example.tomjerry.tomkitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IBMPlexFont
import com.example.tomjerry.ui.theme.darkBlue

@Preview(showSystemUi = true)
@Composable
fun TomKitchenScreen() {
    Box(
        modifier = Modifier
            .safeDrawingPadding()
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.tom_account_bg_1),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            alignment = Alignment.TopEnd,
        )
        Image(
            painter = painterResource(R.drawable.tom_account_bg_2),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            alignment = Alignment.TopEnd
        )
        Image(
            painter = painterResource(R.drawable.tom_account_bg_3),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(0.55F),
            alignment = Alignment.TopStart
        )

        Column(
            modifier = Modifier
                .fillMaxHeight(0.75F)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEndPercent = 10, topStartPercent = 10))
                .background(color = Color(0xFFEEF4F6))
                .align(Alignment.BottomCenter)
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 32.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        "Electric Tom pasta",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier) {
                        Row(
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(Color(0xFFD0E5F0))
                                .padding(horizontal = 12.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.pocket),
                                contentDescription = null,
                                tint = darkBlue
                            )
                            Spacer(modifier = Modifier.width(4.dp))

                            Text(
                                "5 cheeses",
                                color = darkBlue,
                                fontSize = 12.sp,
                                fontFamily = IBMPlexFont,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
                Icon(
                    painter = painterResource(R.drawable.heart),
                    contentDescription = "Heart",
                    tint = darkBlue,
                )
            }
        }

        Image(
            painter = painterResource(R.drawable.spagity_dish),
            contentDescription = "Pasta",
            modifier = Modifier
                .size(height = 210.dp, width = 230.dp)
                .align(Alignment.TopEnd)
                .offset(y = (10).dp)
                .padding(end = 14.dp)
               ,
            contentScale = ContentScale.FillBounds
        )
        Column(modifier = Modifier.padding(start = 16.dp, top = 60.dp)) {
            Row {
                Icon(
                    painter = painterResource(R.drawable.ruler),
                    contentDescription = "Ruler",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    "High tension",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IBMPlexFont
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Icon(
                    painter = painterResource(R.drawable.chef),
                    contentDescription = "Ruler",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    "Shocking foods",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IBMPlexFont
                )
            }
        }

    }
}