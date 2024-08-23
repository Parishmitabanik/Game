package com.example.guessinggame

data class GuessingGameState(
    val userNumber: String = "",
    val noOfGuessLeft: Int = 5,
    val guessedNumbersList: List<Int> = emptyList(),
    val mysteryNumber: Int = (1..99).random(),
    val hintDescription: String = "Can you guess the number between 0 and 100 that the computer is thinking?\n",
    val gameStage: GameStage = GameStage.PLAYING
)

enum class GameStage {
    WON,
    LOSE,
    PLAYING
}
