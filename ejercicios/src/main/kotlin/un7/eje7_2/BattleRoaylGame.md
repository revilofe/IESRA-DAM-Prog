#The Battle Royal Game
## Introduction
You work in the development of a new battle royal game.
The players will fight each other inside a fixed map size, but every 10 minutes the size of the map
gets reduced and any player outside the limits will lose the game.
You have been requested to develop a small prototype to check how the map limits will work.
HINT:
The map is defined NxN
The valid player's positions go from 0 to N-1
Note that the map gets reduced by all sides! (top, bottom, right, left) and that players
do not move from their positions
Here's an example.
Input
The input will be:
•
The size of the map given as maximum rows and columns (only squares are valid
3x3,4x4,5x5 etc).
25CODEWARS 2021
SPAIN Virtual Edition
• The match time in minutes in which we want to evaluate the number of players remaining.
• Several positions on the map, representing the player's position at the beginning of the
match. (T=0 min)
The process should stop reading player's position when the program finds the character '#'.
4 4
15
1 2
3 3
#
In this example the first line describes that this is a 4x4 map.
The second line refers to 15 minutes from the start of the match.
The third line provides the position of a player on row 1 and column 2.
At the fourth line another player position is set on row 3 and column 3.
Finally the character '#' marks stop reading input file.
Output
The output will be the number of players that remain in the match at that specific point in time.