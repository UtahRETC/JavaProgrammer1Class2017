# Projects

**Guess the number:** the program generates a random number between -250 - 250.
It should then ask the user to guess a number and it will then tell the user if
the guess was high, or low, or correct.  If it is correct, then the program
tells you that you guessed right and it quits. Otherwise, it should have you
guess another number.

**Hangman:** create a program that starts with a list of words. The program
should randomly pick one of those words and make the user guess it. You should
tell the user what the length of the word is and then on a loop ask them to
guess a letter. If the letter is in the word that was chosen, it should tell
the user the position of every instance of that letter in the word. If the
letter is not present in the word, it should tell the user and make them guess
another letter. Keep track of the number of attempts that the user takes,
because after 20 guesses have been made and the game is not complete, the game
should end.

**Battleship:** write a program that creates a two-dimensional grid that is ten
spaces tall and ten spaces wide. Create a `Ship` class that has an `x` and a
`y` coordinate. When your program starts up, it will create twenty ships and
randomly place them on the grid. As it creates ships, it should check that is
places the ship on an empty space. Then you will accept user input. The user
will enter a guess that is a `x` and a `y` coordinate. You will then tell the
user whether or not they hit a ship. After 50 guesses the game is over and you
should output the number of ships that were hit. If all ships are hit before
the 50 guesses, you can end the game.
