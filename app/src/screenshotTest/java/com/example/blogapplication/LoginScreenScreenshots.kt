package com.example.blogapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import com.example.blogapplication.ui.theme.BlogApplicationTheme

class LoginScreenScreenshots {

    @PreviewTest
    @Preview(name = "Login Screen - Empty State", showBackground = true, widthDp = 360, heightDp = 640)
    @Composable
    fun LoginScreenEmptyStateScreenshot() {
        BlogApplicationTheme {
            LoginScreen()
        }
    }

    @PreviewTest
    @Preview(name = "Login Screen - Filled Form", showBackground = true, widthDp = 360, heightDp = 640)
    @Composable
    fun LoginScreenFilledFormScreenshot() {
        BlogApplicationTheme {
            LoginScreenWithPredefinedData()
        }
    }

    @PreviewTest
    @Preview(name = "Login Screen - Error State", showBackground = true, widthDp = 360, heightDp = 640)
    @Composable
    fun LoginScreenErrorStateScreenshot() {
        BlogApplicationTheme {
            LoginScreenWithError()
        }
    }

    @PreviewTest
    @Preview(name = "Login Screen - Loading State", showBackground = true, widthDp = 360, heightDp = 640)
    @Composable
    fun LoginScreenLoadingStateScreenshot() {
        BlogApplicationTheme {
            LoginScreenWithLoadingState()
        }
    }

    @PreviewTest
    @Preview(name = "Login Screen - Tablet Layout", showBackground = true, widthDp = 800, heightDp = 600)
    @Composable
    fun LoginScreenTabletScreenshot() {
        BlogApplicationTheme {
            LoginScreen(
                modifier = Modifier.padding(horizontal = 120.dp)
            )
        }
    }

    @PreviewTest
    @Preview(name = "Login Screen - Small Phone", showBackground = true, widthDp = 320, heightDp = 568)
    @Composable
    fun LoginScreenSmallPhoneScreenshot() {
        BlogApplicationTheme {
            LoginScreenWithPredefinedData()
        }
    }

    @PreviewTest
    @Preview(name = "Login Screen - Dark Mode", showBackground = true, widthDp = 360, heightDp = 640)
    @Composable
    fun LoginScreenDarkModeScreenshot() {
        BlogApplicationTheme(darkTheme = true) {
            LoginScreenWithPredefinedData()
        }
    }

    @PreviewTest
    @Preview(name = "Login Screen - Error State Dark Mode", showBackground = true, widthDp = 360, heightDp = 640)
    @Composable
    fun LoginScreenErrorStateDarkModeScreenshot() {
        BlogApplicationTheme(darkTheme = true) {
            LoginScreenWithError()
        }
    }
}

@Composable
private fun LoginScreenWithPredefinedData() {
    var email by remember { mutableStateOf("john.doe@example.com") }
    var password by remember { mutableStateOf("mypassword123") }
    var passwordVisible by remember { mutableStateOf(false) }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "Welcome Back",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 32.dp)
            )
            
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                ) {
                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email address") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        singleLine = true
                    )
                    
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        trailingIcon = {
                            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                                Icon(
                                    imageVector = Icons.Default.Visibility,
                                    contentDescription = "Show password"
                                )
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp),
                        singleLine = true
                    )
                    
                    DesignSystemButton(
                        text = "Sign In",
                        onClick = {},
                        variant = ButtonVariant.Primary,
                        size = ButtonSize.Large,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Composable
private fun LoginScreenWithError() {
    var email by remember { mutableStateOf("invalid-email") }
    var password by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "Welcome Back",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 32.dp)
            )
            
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                ) {
                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email address") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp),
                        singleLine = true,
                        isError = true
                    )
                    
                    Text(
                        text = "Please enter a valid email address",
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp),
                        singleLine = true
                    )
                    
                    DesignSystemButton(
                        text = "Sign In",
                        onClick = {},
                        variant = ButtonVariant.Primary,
                        size = ButtonSize.Large,
                        modifier = Modifier.fillMaxWidth(),
                        enabled = false
                    )
                    
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFFEF2F2))
                    ) {
                        Text(
                            text = "⚠️ Login failed. Please check your credentials and try again.",
                            color = Color(0xFFDC2626),
                            style = MaterialTheme.typography.bodyMedium,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun LoginScreenWithLoadingState() {
    var email by remember { mutableStateOf("john.doe@example.com") }
    var password by remember { mutableStateOf("mypassword123") }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "Welcome Back",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 32.dp)
            )
            
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                ) {
                    OutlinedTextField(
                        value = email,
                        onValueChange = {},
                        label = { Text("Email address") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        singleLine = true,
                        enabled = false
                    )
                    
                    OutlinedTextField(
                        value = password,
                        onValueChange = {},
                        label = { Text("Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp),
                        singleLine = true,
                        enabled = false
                    )
                    
                    DesignSystemButton(
                        text = "Signing In...",
                        onClick = {},
                        variant = ButtonVariant.Primary,
                        size = ButtonSize.Large,
                        modifier = Modifier.fillMaxWidth(),
                        enabled = false
                    )
                }
            }
        }
    }
}