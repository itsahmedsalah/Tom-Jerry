package com.example.tomjerry.tomaccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.models.favoriteFoodItemsList
import com.example.tomjerry.models.settingItemsList
import com.example.tomjerry.ui.theme.IBMPlexFont
import com.example.tomjerry.ui.theme.blackText
import com.example.tomjerry.ui.theme.darkGrayTextColor
import com.example.tomjerry.ui.theme.grayTextColor
import com.example.tomjerry.ui.theme.lightGrayTextColor

@Preview(showSystemUi = true)
@Composable
fun TomAccountScreen() {
    Box(
        modifier = Modifier
            .background(color = Color(0xFFEEF4F6))
            .safeDrawingPadding()
            .fillMaxSize()

    ) {

        Image(
            painter = painterResource(R.drawable.tomaccount_background_container),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.248F),
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.donkey_tom),
                contentDescription = null,
                alignment = Alignment.TopEnd,
                modifier = Modifier.size(64.dp),
                contentScale = ContentScale.FillBounds
            )
            Text(
                "Tom",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = IBMPlexFont,
                color = Color.White,
                modifier = Modifier.padding(top = 4.dp),


            )
            Text(
                "specializes in failure!",
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal  ,
                fontFamily = IBMPlexFont,
                color = Color.White,
            )
            Box(
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .clip(shape = RoundedCornerShape(40.dp))
                    .background(
                        Color(0x33FFFFFF)
                    ),

                ) {
                Text(
                    "Edit foolishness",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IBMPlexFont,
                    color = Color.White,
                    modifier = Modifier.padding(vertical = 6.dp, horizontal = 12.dp)
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxHeight(0.766F)
                .fillMaxWidth()
                .clip(
                    shape = RoundedCornerShape(
                        topEndPercent = 4,
                        topStartPercent = 4,
                        bottomEndPercent = 4,
                        bottomStartPercent = 4
                    )
                )
                .background(color = Color(0xFFEEF4F6))
                .align(Alignment.BottomCenter)


        ) {
            Column(
                modifier = Modifier
                    .weight(1F)

                    .verticalScroll(rememberScrollState())
            ) {
                StatContainer()
                TomSettingContainer()
                HorizontalDivider(
                    modifier = Modifier

                        .padding(vertical = 12.dp), color = Color(0xFFDBE3E5)
                )
                TomFavoriteContainer()
                Text(
                    "v.TomBeta",
                    fontSize = 12.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    fontWeight = FontWeight.Normal,
                    fontFamily = IBMPlexFont,
                    color = lightGrayTextColor,
                    textAlign = TextAlign.Center
                )
            }

        }


    }
}

@Composable
fun StatContainer() {
    Column(
        modifier = Modifier
            .padding(top = 23.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),

            ) {
            Row(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color(0xFFD0E5F0))
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .weight(1F),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.stat_icon_container_evil),
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        "2M 12K",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = IBMPlexFont,
                        color = darkGrayTextColor
                    )
                    Text(
                        "No. of quarrels",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                        color = lightGrayTextColor
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Row(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color(0xFFDEEECD))
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .weight(1F),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.stat_icon_con_running),
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        "+500 h",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = IBMPlexFont,
                        color = darkGrayTextColor
                    )
                    Text(
                        "Chase time",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                        color = lightGrayTextColor
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),

            ) {
            Row(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color(0xFFF2D9E7))
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .weight(1F),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.stat_icon_cont_heartbreak),
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        "2M 12K",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = IBMPlexFont,
                        color = darkGrayTextColor
                    )
                    Text(
                        "Hunting times",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                        color = lightGrayTextColor
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Row(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color(0xFFFAEDCF))
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .weight(1F),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.stat_icon_cont_sad),
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        "3M 7K",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = IBMPlexFont,
                        color = darkGrayTextColor
                    )
                    Text(
                        "Heartbroken",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                        color = lightGrayTextColor
                    )
                }
            }
        }
    }
}

@Composable
fun TomSettingContainer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp)
            .padding(horizontal = 16.dp)
    ) {
        Text(
            "Tom settings",
            color = blackText,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = IBMPlexFont,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        settingItemsList.forEach {
            ItemContainer(imageRes = it.imageRes, itemTitle = it.itemTitle)
        }
    }
}

@Composable
fun ItemContainer(imageRes: Int, itemTitle: String) {
    Row(
        modifier = Modifier.padding(vertical = 6.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(8.dp))
                .background(color = Color.White)
                .padding(8.dp)

        ) {
            Icon(painter = painterResource(imageRes), contentDescription = null)
        }
        Text(
            itemTitle,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = IBMPlexFont,
            color = blackText,
            modifier = Modifier.padding(start = 12.dp)
        )
    }
}

@Composable
fun TomFavoriteContainer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            "His favorite foods",
            color = blackText,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = IBMPlexFont,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        favoriteFoodItemsList.forEach {
            ItemContainer(imageRes = it.imageRes, itemTitle = it.itemTitle)
        }
    }
}



