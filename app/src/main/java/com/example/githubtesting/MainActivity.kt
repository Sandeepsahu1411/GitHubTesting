package com.example.githubtesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubtesting.ui.theme.GithubTestingTheme
import com.example.githubtesting.R

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GithubTestingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ExposedDropdownMenuBox(
                        expanded = true,
                        onExpandedChange = {},
                        modifier = Modifier.padding(innerPadding)

                    ){
                        Text(text = getString(R.string.My_name_sandeep))
                    }
                }
            }
        }
    }
}

