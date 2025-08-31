package com.example.blogapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blogapplication.ui.theme.BlogApplicationTheme

@Composable
fun DesignSystemButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: ButtonVariant = ButtonVariant.Primary,
    size: ButtonSize = ButtonSize.Medium,
    enabled: Boolean = true
) {
    val colors = when (variant) {
        ButtonVariant.Primary -> ButtonDefaults.buttonColors(
            containerColor = Color(0xFF6366F1),
            contentColor = Color.White,
            disabledContainerColor = Color(0xFF9CA3AF),
            disabledContentColor = Color(0xFFE5E7EB)
        )
        ButtonVariant.Secondary -> ButtonDefaults.buttonColors(
            containerColor = Color(0xFFE5E7EB),
            contentColor = Color(0xFF374151),
            disabledContainerColor = Color(0xFFE5E7EB),
            disabledContentColor = Color(0xFF9CA3AF)
        )
    }
    
    val contentPadding = when (size) {
        ButtonSize.Small -> PaddingValues(horizontal = 12.dp, vertical = 6.dp)
        ButtonSize.Medium -> PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ButtonSize.Large -> PaddingValues(horizontal = 20.dp, vertical = 12.dp)
    }
    
    val fontSize = when (size) {
        ButtonSize.Small -> 12.sp
        ButtonSize.Medium -> 14.sp
        ButtonSize.Large -> 16.sp
    }

    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        contentPadding = contentPadding,
        shape = RoundedCornerShape(6.dp)
    ) {
        Text(
            text = text,
            fontSize = fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun DesignSystemOutlinedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: ButtonSize = ButtonSize.Medium,
    enabled: Boolean = true
) {
    val contentPadding = when (size) {
        ButtonSize.Small -> PaddingValues(horizontal = 12.dp, vertical = 6.dp)
        ButtonSize.Medium -> PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ButtonSize.Large -> PaddingValues(horizontal = 20.dp, vertical = 12.dp)
    }
    
    val fontSize = when (size) {
        ButtonSize.Small -> 12.sp
        ButtonSize.Medium -> 14.sp
        ButtonSize.Large -> 16.sp
    }

    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        contentPadding = contentPadding,
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(1.dp, Color(0xFF6366F1)),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color(0xFF6366F1),
            disabledContentColor = Color(0xFF9CA3AF)
        )
    ) {
        Text(
            text = text,
            fontSize = fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}

enum class ButtonVariant {
    Primary,
    Secondary
}

enum class ButtonSize {
    Small,
    Medium,
    Large
}

@Preview(name = "Primary Button - Small", showBackground = true)
@Composable
fun PrimaryButtonSmallPreview() {
    BlogApplicationTheme {
        DesignSystemButton(
            text = "Primary Small",
            onClick = {},
            variant = ButtonVariant.Primary,
            size = ButtonSize.Small,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(name = "Primary Button - Medium", showBackground = true)
@Composable
fun PrimaryButtonMediumPreview() {
    BlogApplicationTheme {
        DesignSystemButton(
            text = "Primary Medium",
            onClick = {},
            variant = ButtonVariant.Primary,
            size = ButtonSize.Medium,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(name = "Primary Button - Large", showBackground = true)
@Composable
fun PrimaryButtonLargePreview() {
    BlogApplicationTheme {
        DesignSystemButton(
            text = "Primary Large",
            onClick = {},
            variant = ButtonVariant.Primary,
            size = ButtonSize.Large,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(name = "Secondary Button - Medium", showBackground = true)
@Composable
fun SecondaryButtonPreview() {
    BlogApplicationTheme {
        DesignSystemButton(
            text = "Secondary",
            onClick = {},
            variant = ButtonVariant.Secondary,
            size = ButtonSize.Medium,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(name = "Outlined Button - Medium", showBackground = true)
@Composable
fun OutlinedButtonPreview() {
    BlogApplicationTheme {
        DesignSystemOutlinedButton(
            text = "Outlined",
            onClick = {},
            size = ButtonSize.Medium,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(name = "Disabled Primary Button", showBackground = true)
@Composable
fun DisabledPrimaryButtonPreview() {
    BlogApplicationTheme {
        DesignSystemButton(
            text = "Disabled",
            onClick = {},
            variant = ButtonVariant.Primary,
            enabled = false,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(name = "Disabled Outlined Button", showBackground = true)
@Composable
fun DisabledOutlinedButtonPreview() {
    BlogApplicationTheme {
        DesignSystemOutlinedButton(
            text = "Disabled",
            onClick = {},
            enabled = false,
            modifier = Modifier.padding(16.dp)
        )
    }
}