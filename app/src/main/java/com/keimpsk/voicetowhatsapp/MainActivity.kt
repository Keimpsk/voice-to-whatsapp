package com.keimpsk.voicetowhatsapp

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            AppContent() 
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AppContent() {
        val context = LocalContext.current
        var permissionsGranted by remember { mutableStateOf(false) }
        val permissions = arrayOf(Manifest.permission.RECORD_AUDIO, Manifest.permission.READ_CONTACTS)

        if (permissionsGranted) {
            // Main app content will go here
        } else {
            LaunchedEffect(Unit) {
                permissionsGranted = checkPermissions(context, permissions)
            }
        }
    }

    private fun checkPermissions(context: Context, permissions: Array<String>): Boolean {
        return permissions.all { perm ->
            ContextCompat.checkSelfPermission(context, perm) == PackageManager.PERMISSION_GRANTED
        }
    }
}
