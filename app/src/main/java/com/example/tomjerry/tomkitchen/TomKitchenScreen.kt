package com.example.tomjerry.tomkitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.models.PreparationMethodStepModel
import com.example.tomjerry.models.stepsList
import com.example.tomjerry.ui.theme.IBMPlexFont
import com.example.tomjerry.ui.theme.blackText
import com.example.tomjerry.ui.theme.darkBlue
import com.example.tomjerry.ui.theme.grayTextColor
import com.example.tomjerry.ui.theme.lightBlue

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
            modifier = Modifier.fillMaxSize(0.5F),
            alignment = Alignment.TopStart
        )

        Column(
            modifier = Modifier
                .fillMaxHeight(0.79F)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEndPercent = 4, topStartPercent = 4))
                .background(color = Color(0xFFEEF4F6))
                .align(Alignment.BottomCenter)


        ) {
            Column(
                modifier = Modifier
                    .weight(1F)
                    .padding(horizontal = 16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                TitleMealContainer()
                Text(
                    "Pasta cooked with a charger cable and\nsprinkled with questionable cheese. Make sure\nto unplug it before eating (or not, you decide).",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IBMPlexFont,
                    color = grayTextColor,
                    modifier = Modifier.padding(top = 12.dp, bottom = 14.dp),
                    lineHeight = 20.sp
                )

                ProductDetails()
                PreparationMethod()
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(vertical = 12.dp, horizontal = 16.dp)
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF226993)),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Row(
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Add to cart",
                            fontSize = 16.sp,
                            fontFamily = IBMPlexFont,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFE2ECF1),

                            )
                        Icon(
                            painter = painterResource(R.drawable.dot),
                            contentDescription = "Dot",
                            tint = Color(0xFF76A2BC),
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                "3 cheeses",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                fontFamily = IBMPlexFont,
                                lineHeight = 16.sp,
                                color = Color.White
                            )
                            Text(
                                "5 cheeses",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                fontFamily = IBMPlexFont,
                                color = Color(0xFFE2ECF1),
                                textDecoration = TextDecoration.LineThrough
                            )
                        }
                    }
                }
            }
        }

        Image(
            painter = painterResource(R.drawable.spagity_dish),
            contentDescription = "Pasta",
            modifier = Modifier
                .size(height = 185.dp, width = 215.dp)
                .align(Alignment.TopEnd)
                .offset(y = (10).dp)
                .padding(end = 18.dp),
            contentScale = ContentScale.FillBounds
        )
        Column(modifier = Modifier.padding(start = 18.dp, top = 50.dp)) {
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

@Composable
fun ProductDetails() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            "Details",
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = IBMPlexFont,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),

            ) {
            Card(
                modifier = Modifier
                    .weight(1F)
                    .padding(horizontal = 4.dp),
                colors = CardDefaults.cardColors(
                    containerColor = lightBlue
                )
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .align(Alignment.CenterHorizontally),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(R.drawable.temperature),
                        contentDescription = "Temp",
                        tint = darkBlue,

                        )
                    Text(
                        "1000 V", color = grayTextColor,
                        modifier = Modifier.padding(top = 12.dp),
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                    )
                    Text(
                        "Temperature",
                        color = Color(0x4D121212),
                        fontSize = 12.sp,
                        letterSpacing = 0.5.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                    )
                }
            }
            Card(
                modifier = Modifier
                    .weight(1F)
                    .padding(horizontal = 4.dp),
                colors = CardDefaults.cardColors(
                    containerColor = lightBlue
                )
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .align(Alignment.CenterHorizontally),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(R.drawable.timer_02),
                        contentDescription = "Temp",
                        tint = darkBlue,

                        )
                    Text(
                        "3 sparks", color = grayTextColor,
                        modifier = Modifier.padding(top = 12.dp),
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                    )
                    Text(
                        "Time",
                        color = Color(0x4D121212),
                        fontSize = 12.sp,
                        letterSpacing = 0.5.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                    )
                }
            }
            Card(
                modifier = Modifier
                    .weight(1F)
                    .padding(horizontal = 4.dp),
                colors = CardDefaults.cardColors(
                    containerColor = lightBlue
                )
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .align(Alignment.CenterHorizontally),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(R.drawable.evil),
                        contentDescription = "Temp",
                        tint = darkBlue,

                        )
                    Text(
                        "1M 12K", color = grayTextColor,
                        modifier = Modifier.padding(top = 12.dp),
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                    )
                    Text(
                        "No. of deaths",
                        color = Color(0x4D121212),
                        fontSize = 12.sp,
                        letterSpacing = 0.5.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = IBMPlexFont,
                    )
                }
            }
        }
    }
}

@Composable
fun TitleMealContainer() {
    Row(
        modifier = Modifier
            .padding(top = 28.dp)
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
                color = blackText
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier) {
                Row(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(lightBlue)
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

@Composable
fun PreparationMethod() {
    Column(
        modifier = Modifier
            .padding(top = 22.dp)
            .fillMaxWidth()
    ) {
        Text(
            "Preparation method",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 8.dp),
            color = Color(0xFF1F1F1E)
        )
        Column(modifier = Modifier) {
            stepsList.forEach { stepList ->
                PreparationStepUi(stepList)

            }
        }
    }
}


@Composable
fun PreparationStepUi(step: PreparationMethodStepModel) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),

        ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 2.5.dp, bottom = 2.5.dp, start = 10.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(Color.White)
                .fillMaxWidth()
                .align(Alignment.Center),
        ) {

            Text(
                step.description,
                modifier = Modifier
                    .padding(top = 6.dp, bottom = 6.dp, start = 34.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color.White)
                    .fillMaxWidth(),
                color = grayTextColor
            )
        }
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .size(38.dp)
                .background(color = Color.White, shape = CircleShape)
                .border(width = 1.dp, color = lightBlue, shape = CircleShape),
            contentAlignment = Alignment.Center

        ) {
            Text(
                text = step.id.toString(),
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IBMPlexFont,
                style = TextStyle(textAlign = TextAlign.Center),
                color = Color(0xFF035587)
            )
        }
    }
}