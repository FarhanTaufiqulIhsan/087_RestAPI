package com.example.pakeapi.ui.home.screen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pakeapi.navigation.DestinasiNavigasi
import com.example.pakeapi.ui.home.viewmodel.InsertUiEvent

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = "Entry Siswa"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntryKontakScreen(){}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSiswa(
    insertUiEvent: InsertUiEvent,
    modifier: Modifier = Modifier,
    onValueChange : (InsertUiEvent) -> Unit = {},
    enabled: Boolean = true
){}