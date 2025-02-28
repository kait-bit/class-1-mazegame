## Problem Description
````{verbatim}

___________E_________
|       |   |       |
|______ | | | _____ |
| |   | | |   |   | |
| | | | |_|__ | | | |
| | | |     | | | | |
| | | |____ | | | | |
| | | |   | | | | | |
| | | | | | |_| | | |
|   |   |       |   |
|___|___|_______|__S|
````

Create a class MazeGame, which provides the functionality to play a game with the above maze.
The class should store the maze solution, user moves, and whether or not the user has solved the maze.

The solution to the maze is: Up, Left, Down, Left, Up.

The MazeGame constructor should initialize the fields and call a method startGame.

The startGame method should add the correct solution (listed above) to the solution field.

Add the following methods to your MazeGame class plus getters for your fields:
addMove - adds a user move to the user moves field and returns nothing.
checkSolution - checks a user's moves against the stored solution and returns a String indicating if the maze has been solved. If it has been solved, set solved field to true.
clearMoves - clears a user's moves

Include a Tester class where you will print a message "Welcome to the Maze Game".
Initialize a game of the MazeGame, then call addMoves and add the correct moves.
Print the result of the moves getter method and the results of the checkSolution method.

### Sample output:
<br>>Welcome to the Maze Game
<br>>Your moves: [Up, Left, Down, Left, Up]
<br>>Congratulations, you solved the maze!

Maze ASCII art generated using: https://www.asciiart.eu/ascii-maze-generator