# Tic-Tac-Toe Game in Java

This Java application is a simple implementation of the classic game Tic-Tac-Toe. The game supports two players, identified as Player 1 and Player 2, who take turns marking spaces in a 3x3 grid with their respective symbols (X and O). The first player to align three of their symbols vertically, horizontally, or diagonally wins the game. If all nine squares are filled and no player has three in a row, the game is a draw.

## Features

- Two-player game mode.
- Players take turns marking their symbols on the board.
- The game checks for a win or draw condition after each move.
- Console-based user interface for easy interaction.

## How to Run

To run the game, you need a Java Development Kit (JDK) installed on your machine. Follow these steps:

1. Open your terminal or command prompt.
2. Navigate to the directory containing the `Main.java` file.
3. Compile the Java program by running `javac Main.java`.
4. Execute the compiled class by running `java Main`.

## Gameplay Instructions

- The game board consists of a 3x3 grid, where each cell can be marked with an 'X' or an 'O'.
- Player 1 uses the 'X' symbol, and Player 2 uses the 'O' symbol.
- Players take turns to input their choice of cell they wish to mark, choosing from positions 1 to 9. The positions are numbered as follows:

1 | 2 | 3  
4 | 5 | 6  
7 | 8 | 9  

- If a player successfully aligns three of their symbols vertically, horizontally, or diagonally, they win the game.
- If all cells are filled without any player aligning three symbols, the game ends in a draw.

## Code Structure

- `ticTakToe()`: Main game loop that initializes the board and manages player turns.
- `printBoard(char[][] board)`: Prints the current state of the game board to the console.
- `markSpot(char[][] board, char symbol)`: Allows players to mark a spot on the board with their symbol.
- `checkThreeInARow(char[][] board, char targetElement)`: Checks if a player has won by aligning three symbols in a row.

Enjoy playing Tic-Tac-Toe!

