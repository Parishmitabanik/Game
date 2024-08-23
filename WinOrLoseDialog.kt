package com.example.guessinggame

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.guessinggame.ui.theme.BlueDark
import com.example.guessinggame.ui.theme.Yellow
import com.example.guessinggame.ui.theme.YellowDark

@Composable
fun WinOrLoseDialog(
    text: String,
    buttonText: String,
    mysteryNumber: Int,
    resetGame: () -> Unit
) {
    Dialog(onDismissRequest = resetGame) {
        Column(
            modifier = Modifier
                .size(300.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(Yellow),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = text,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "The actual Number is ${mysteryNumber}",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )

            Button(
                onClick = resetGame,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = BlueDark,
                    contentColor = Color.White
                )
            ) {
                Text(text = buttonText, fontSize = 24.sp)
            }
        }
    }
}

@Preview
@Composable
fun WinDialogPrev() {
    WinOrLoseDialog(
        text = "CONGRATULATIONS\nYou won!!",
        buttonText = "Play Again",
        mysteryNumber = 32,
        resetGame = {}
    )
}

@Preview
@Composable
fun LoseDialogPrev() {
    WinOrLoseDialog(
        text = "YOU LOSE",
        buttonText = "Try Again",
        mysteryNumber = 32
    ) {}
}