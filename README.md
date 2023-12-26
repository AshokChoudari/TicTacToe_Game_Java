# TicTacToe_Game_Java

Java program implements a simple console-based Tic-Tac-Toe game where a player (human) plays against the computer (CPU). Below is an overview of the key components and functionalities of program:

Board Representation:

The Tic-Tac-Toe board is represented as a 2D array of characters (char[][] board).
The board is displayed as a 3x3 grid, and positions are labeled from 1 to 9.


Player Input:

Players (human and CPU) input their moves by entering a number corresponding to the position on the board (1 to 9).
The positions are displayed to the players as follows:

1 | 2 | 3

4 | 5 | 6

7 | 8 | 9


Game Loop:

The game is played in a loop until a winner is determined or the game ends in a draw.
The loop alternates between the human player and the CPU making moves.
Player Moves:

The enter method updates the board based on the player's move (human or CPU).
The humNum and cpuNum ArrayLists keep track of the positions chosen by the human and CPU, respectively.


Winning Conditions:

The isWin method checks for winning conditions after each move.
Winning conditions include completing a row, column, or diagonal with the same symbol (X for the human, O for the CPU).
The game can end in a draw if no player wins and all positions on the board are filled.


Random CPU Moves:

The CPU makes random moves using the Random class to generate a random position on the board.


Displaying the Board:

The display method prints the current state of the Tic-Tac-Toe board.


Game Outcome:

The game announces the winner or declares a draw based on the outcome of the isWin method.


Game Initialization:

The program begins by initializing an empty board and printing a welcome message.


Usage of ArrayLists:

The humNum and cpuNum ArrayLists are used to store the positions chosen by the human and CPU, respectively.


Error Handling:

The program handles cases where a player tries to choose a position that is already taken by either the human or the CPU.


Overall, Java program provides a basic implementation of a Tic-Tac-Toe game, allowing a human player to compete against a CPU opponent.
