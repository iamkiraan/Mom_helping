package com.example.mom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun Show() {
    var text by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 20.dp),
        contentAlignment = Alignment.TopCenter


    ) {
        Column(  modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween) {
            Row(horizontalArrangement = Arrangement.spacedBy(80.dp)) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.padding(start = 30.dp)
                ) {
                    Text(text = "Connect")
                }
                Button(onClick = { }, shape = RoundedCornerShape(6.dp)) {
                    Text(text = "Disconnect")

                }

            }

                Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.spacedBy(10.dp),modifier  = Modifier.padding(bottom = 20.dp)) {
                    TextField(
                        value = text,
                        onValueChange = { newText -> text = newText },
                        label = { Text("Enter your text here")},
                        modifier = Modifier.padding(start = 10.dp).width(250.dp)
                    )
                    Button(onClick = {  }, shape = RoundedCornerShape(6.dp)) {
                        Text("Send")
                        
                    }
                }

            }
        }

    }

