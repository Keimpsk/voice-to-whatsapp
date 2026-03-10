package com.keimpsk.voicetowhatsapp

<<<<<<< HEAD
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
=======
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.keimpsk.voicetowhatsapp.ui.theme.VoiceToWhatsAppTheme
>>>>>>> cfc70f4 (Initial Android Studio project)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
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
=======
        enableEdgeToEdge()
        setContent {
            VoiceToWhatsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VoiceToWhatsAppTheme {
        Greeting("Android")
    }
}
>>>>>>> cfc70f4 (Initial Android Studio project)
