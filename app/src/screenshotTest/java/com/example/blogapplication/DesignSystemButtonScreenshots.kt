package com.example.blogapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import com.example.blogapplication.ui.theme.BlogApplicationTheme

class DesignSystemButtonScreenshots {

    @PreviewTest
    @Preview(name = "Button Size Variations", showBackground = true, widthDp = 400, heightDp = 300)
    @Composable
    fun ButtonSizeVariationsScreenshot() {
        BlogApplicationTheme {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "Button Size Variations",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold
                    )
                    
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        DesignSystemButton(
                            text = "Small",
                            onClick = {},
                            size = ButtonSize.Small
                        )
                        DesignSystemButton(
                            text = "Medium",
                            onClick = {},
                            size = ButtonSize.Medium
                        )
                        DesignSystemButton(
                            text = "Large",
                            onClick = {},
                            size = ButtonSize.Large
                        )
                    }
                }
            }
        }
    }

    @PreviewTest
    @Preview(name = "Button Variant Showcase", showBackground = true, widthDp = 400, heightDp = 400)
    @Composable
    fun ButtonVariantShowcaseScreenshot() {
        BlogApplicationTheme {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Text(
                        text = "Button Variants",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold
                    )
                    
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            text = "Primary Buttons",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            DesignSystemButton(
                                text = "Enabled",
                                onClick = {},
                                variant = ButtonVariant.Primary
                            )
                            DesignSystemButton(
                                text = "Disabled",
                                onClick = {},
                                variant = ButtonVariant.Primary,
                                enabled = false
                            )
                        }
                    }
                    
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            text = "Secondary Buttons",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            DesignSystemButton(
                                text = "Enabled",
                                onClick = {},
                                variant = ButtonVariant.Secondary
                            )
                            DesignSystemButton(
                                text = "Disabled",
                                onClick = {},
                                variant = ButtonVariant.Secondary,
                                enabled = false
                            )
                        }
                    }
                    
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            text = "Outlined Buttons",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            DesignSystemOutlinedButton(
                                text = "Enabled",
                                onClick = {}
                            )
                            DesignSystemOutlinedButton(
                                text = "Disabled",
                                onClick = {},
                                enabled = false
                            )
                        }
                    }
                }
            }
        }
    }

    @PreviewTest
    @Preview(name = "Button Edge Cases", showBackground = true, widthDp = 500, heightDp = 350)
    @Composable
    fun ButtonEdgeCasesScreenshot() {
        BlogApplicationTheme {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "Button Edge Cases",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold
                    )
                    
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            text = "Long Text",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium
                        )
                        DesignSystemButton(
                            text = "This is a very long button text to test wrapping",
                            onClick = {},
                            modifier = Modifier.width(200.dp)
                        )
                    }
                    
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            text = "Short Text",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            DesignSystemButton(text = "OK", onClick = {})
                            DesignSystemButton(text = "X", onClick = {})
                        }
                    }
                    
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            text = "Numbers & Symbols",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            DesignSystemButton(text = "Save & Exit", onClick = {})
                            DesignSystemButton(text = "€9.99", onClick = {})
                            DesignSystemButton(text = "100%", onClick = {})
                        }
                    }
                }
            }
        }
    }

    @PreviewTest
    @Preview(name = "Dark Background Test", showBackground = false, widthDp = 400, heightDp = 300)
    @Composable
    fun ButtonDarkBackgroundScreenshot() {
        BlogApplicationTheme {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF1F2937)),
                color = Color(0xFF1F2937)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "Buttons on Dark Background",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        DesignSystemButton(
                            text = "Primary",
                            onClick = {},
                            variant = ButtonVariant.Primary
                        )
                        DesignSystemOutlinedButton(
                            text = "Outlined",
                            onClick = {}
                        )
                    }
                }
            }
        }
    }
}