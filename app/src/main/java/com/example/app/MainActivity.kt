package com.example.app

import android.graphics.Color
import android.icu.text.CaseMap.Title
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(25.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(15.dp)) {
                        Titulo(modifier = Modifier, title = "Cartão de Visitas DEV")
                        Imagem(modifier = Modifier)
                        Nome(modifier = Modifier, msg = "Maria Fernanda T. Bonini")
                        Bio(modifier = Modifier, biografia = "Atualmente tenho 17 anos, nasci no dia 09 de setembro de 2008, estou cursando meu último ano na escola e no curso técnico,penso em fazer uma faculdade voltada para a área de exatas, como Engenharia Civil.")
                    }
                }
            }
        }
    }
}

@Composable
fun Titulo(modifier: Modifier, title: String){
    Text(text = title, modifier = modifier.padding(60.dp), fontSize = 30.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
}

@Composable
fun Nome(modifier: Modifier, msg: String){
    Text(text = msg, modifier = modifier.padding(top = 50.dp), fontSize = 23.sp , fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
}

@Composable
fun Bio(modifier: Modifier, biografia: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier.size(width = 290.dp, height = 210.dp)
    ) {
        Text(text = biografia, modifier = modifier.padding(top = 20.dp), fontWeight = FontWeight.W300, fontSize = 18.sp, textAlign = TextAlign.Center)
    }
}
@Composable
fun Imagem(modifier: Modifier){
    Image(painter = painterResource(id = R.drawable.download), contentDescription = "Foto de Perfil", modifier = Modifier.size(250.dp).clip(CircleShape).border(3.dp, androidx.compose.ui.graphics.Color.Blue, CircleShape),contentScale = ContentScale.Crop)
}




