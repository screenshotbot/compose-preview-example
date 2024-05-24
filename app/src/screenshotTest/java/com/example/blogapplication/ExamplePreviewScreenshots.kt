package com.example.blogapplication


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.blogapplication.ui.theme.BlogApplicationTheme

class ExamplePreviewsScreenshots {

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        BlogApplicationTheme {
            Greeting("Android!")
        }
    }
}
