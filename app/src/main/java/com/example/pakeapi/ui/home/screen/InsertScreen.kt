package com.example.pakeapi.ui.home.screen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.example.pakeapi.navigation.DestinasiNavigasi

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = "Entry Siswa"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntryKontakScreen(){}