package com.example.tomjerry

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.ui.theme.IBMPlexFont
import com.example.tomjerry.ui.theme.backgroundDefaultColor
import com.example.tomjerry.ui.theme.darkBlue


@Preview(showSystemUi = true)
@Composable
fun JerryStore() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundDefaultColor)
            .safeContentPadding()
            .padding(horizontal = 16.dp)
    ) {
        JerryHeader()
        SearchBarComp()
        TomOfferCard()
    }
}

@Composable
fun JerryHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.jerry_on_the_beach),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                "Hi, Jerry 👋",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IBMPlexFont
            )
            Text(
                "Which Tom do you want to buy?",
                fontSize = 12.sp,
                color = Color(0xFFA5A6A4),
                fontWeight = FontWeight.Normal,
                fontFamily = IBMPlexFont
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Box(modifier = Modifier) {
            Icon(
                painter = painterResource(R.drawable.notfication),
                contentDescription = null,
                modifier = Modifier
                    .border(
                        width = 1.dp, color = Color(0xFFA5A6A4), shape = RoundedCornerShape(26)
                    )
                    .padding(10.dp)
            )
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = (6.dp), y = (-6).dp)
                    .size(24.dp)
                    .background(darkBlue, shape = CircleShape), // blue badge
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "3",
                    modifier = Modifier.clip(shape = CircleShape),
                    color = Color.White,
                    fontSize = 10.sp
                )
            }
        }
    }
}

@Composable
fun SearchBarComp() {
    Row(
        modifier = Modifier.padding(top = 12.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.weight(1F), colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Icon(
                painter = painterResource(R.drawable.search),
                contentDescription = "Search",
                modifier = Modifier.padding(12.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
            {}, modifier = Modifier.size(48.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White, containerColor = darkBlue
            ),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.fillter),
                contentDescription = "Filter",
            )
        }
    }
}

@Composable
fun TomOfferCard() {
    Box(
        modifier = Modifier
            .padding(top = 24.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .size(40.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF005789), Color(0xFF00ADEF)), // customize these
                        start = Offset(0f, 0f),
                        end = Offset.Infinite // ⬅ bottom-right corner
                    )
                )
        ) {
            
        }
        Text(
            "Ahmed Slaha", color = Color.Red
        )
    }
}