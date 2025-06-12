package com.example.blogapplication


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest
import com.example.blogapplication.ui.theme.BlogApplicationTheme

class ExamplePreviewsScreenshots {

    //@PreviewTest
    //@Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        BlogApplicationTheme {
            Greeting("Android!")
        }
    }
}
