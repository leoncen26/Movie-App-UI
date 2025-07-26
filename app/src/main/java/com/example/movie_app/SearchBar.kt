package com.example.movie_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

@Composable
@Preview
fun SearchBar(hint: String = "", onSearchChanged: (String) -> Unit = {}) {
    var searchText by remember { mutableStateOf("") }
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .height(50.dp)
            .background(color = Color(0x20ffffff))
            .padding(horizontal = 16.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.search),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        TextField(
            value = searchText,
            onValueChange = {
                searchText = it
                onSearchChanged(it)
            },
            placeholder = {
                Text(hint, color = Color(0xffbdbdbd))
            },
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedLabelColor = Color.Transparent,
//                containerColor = Color.White,
//                unfocusTextColor = Color.White,
//                focusPlaceholderColor = Color.White,
//                focusTextColor = Color.White
            ),
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            textStyle = TextStyle(color = Color.White, fontSize = 16.sp),
            shape = RoundedCornerShape(50.dp),
            singleLine = true
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            painter = painterResource(R.drawable.microphone),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}
