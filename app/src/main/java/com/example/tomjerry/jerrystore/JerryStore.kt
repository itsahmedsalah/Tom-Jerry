package com.example.tomjerry.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.models.TomItemModel
import com.example.tomjerry.models.tomItemModel
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
        TomOfferBanner()
        SectionTitle()
        TomItemsList()
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
                "Hi, Jerry 👋🏻",
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
                        width = 1.dp, color = Color(0x261F1F1E), shape = RoundedCornerShape(26)
                    )
                    .padding(10.dp)
            )
            Box(
                modifier = Modifier
                    .offset(x = 5.dp, y = (-5).dp)
                    .size(16.dp)
                    .background(color = darkBlue, shape = CircleShape)
                    .align(Alignment.TopEnd),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "3",
                    color = Color.White,
                    fontSize = 10.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        textAlign = TextAlign.Center
                    )
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
        Box(modifier = Modifier.weight(1F)) {
            Card(
                modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.search),
                    contentDescription = "Search",
                    modifier = Modifier.padding(12.dp)
                )
            }
            Text(
                "Search about tom ...",
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(end = 60.dp),
                color = Color(0x80969799),
                fontWeight = FontWeight.Normal,
                fontFamily = IBMPlexFont,

                )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
            {},
            modifier = Modifier.size(48.dp),
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
fun TomOfferBanner() {
    Box(
        modifier = Modifier
            .padding(top = 24.dp)
            .fillMaxWidth()

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF03446A), Color(0xFF0685D0)),
                        start = Offset(0f, 0f), end = Offset.Infinite
                    )
                )
                .padding(start = 16.dp, top = 12.dp, bottom = 12.dp, end = 90.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1F)) {
                Text(
                    "Buy 1 Tom and get 2 for free",
                    fontSize = 16.sp,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = IBMPlexFont
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Adopt Tom! (Free Fail-Free \nGuarantee)",
                    fontSize = 12.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Normal,
                    fontFamily = IBMPlexFont
                )
            }

        }
        Box(
            modifier = Modifier
                .size(height = 125.dp, width = 124.dp)
                .align(Alignment.TopEnd)
                .offset(y = (-25).dp)
        ) {

            Image(
                painter = painterResource(R.drawable.tom_counting_money),
                contentDescription = "Tom Counting",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()


            )
            Image(
                painter = painterResource(R.drawable.ellipse1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .offset(x = 20.dp, y = (10).dp)
            )
            Image(
                painter = painterResource(R.drawable.ellipse_2),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .offset(x = 16.dp, y = (10).dp)
            )
        }

    }
}

@Composable
fun SectionTitle() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 28.dp),

        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            "Cheap tom section",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            fontFamily = IBMPlexFont,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            "View all",
            color = darkBlue,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = IBMPlexFont,
            modifier = Modifier.padding(end = 4.dp)
        )
        Icon(
            painter = painterResource(R.drawable.left_arrow), contentDescription = null,
            tint = darkBlue
        )
    }
}

@Composable
fun TomItemsList() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(4.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(tomItemModel) {

            TomItem(it)
        }
    }
}

//@Preview
@Composable
fun TomItem(tomItemModel: TomItemModel) {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.size(height = 236.dp, width = 160.dp)
    ) {
        Card(
            modifier = Modifier
                .height(height = 220.dp)
                .offset(y = 16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 88.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    tomItemModel.itemTitle,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = IBMPlexFont,
                )
                Text(
                    tomItemModel.description,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = IBMPlexFont,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f),
                    lineHeight = 16.sp,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis

                )
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier) {
                    Row(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(Color(0xFFE9F6FB))
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                            .weight(1F),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.pocket),
                            contentDescription = null,
                            tint = darkBlue
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        if (tomItemModel.originalCostInCheeses != null && tomItemModel.costInCheeses < tomItemModel.originalCostInCheeses) {
                            Text(
                                "${tomItemModel.originalCostInCheeses}",
                                color = darkBlue,
                                fontSize = 12.sp,
                                fontFamily = IBMPlexFont,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(end = 2.dp),
                                textDecoration = TextDecoration.LineThrough
                            )
                        }
                        Text(
                            "${tomItemModel.costInCheeses} cheeses",
                            color = darkBlue,
                            fontSize = 12.sp,
                            fontFamily = IBMPlexFont,
                            fontWeight = FontWeight.Medium
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        painter = painterResource(R.drawable.cart),
                        contentDescription = null,
                        tint = darkBlue,
                        modifier = Modifier
                            .border(
                                width = 1.dp, color = darkBlue, shape = RoundedCornerShape(16)
                            )
                            .padding(7.5.dp)
                    )
                }
            }
        }
        Image(
            painter = painterResource(tomItemModel.imageResId),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )
    }
}

