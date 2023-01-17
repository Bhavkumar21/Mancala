# Mancala

## HOW TO PLAY
1. The game begins with one player picking up all of the pieces in any one of the pockets on his/her side.
2. Moving counter-clockwise, the player deposits one of the stones in each pocket until the stones run out.
3. If you run into your own Mancala (store), deposit one piece in it. If you run into your opponent's Mancala, skip it and
 continue moving to the next pocket.
4. If the last piece you drop is in your own Mancala, you take another turn.
5. If the last piece you drop is in an empty pocket on your side, you capture that piece and any pieces in the pocket directly
opposite.

## GAMEPLAY
- Each turn the user is presented with the current state of the board and asked to pick house they'd like to play from their side. 
- After picking a house the seeds are distributed and the turns are switched.
- Example:
``` 
Game Board 
*P1*..1...2...3...4...5...6..*P2*
---------------------------------
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
| 0 |-----------------------| 0 | 
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
---------------------------------

Player 1's turn.
2
Game Board 
---------------------------------
|   | 5 | 0 | 4 | 4 | 4 | 4 |   |
| 1 |-----------------------| 0 | 
|   | 5 | 5 | 4 | 4 | 4 | 4 |   |
---------------------------------
*P1*..1...2...3...4...5...6..*P2*

Player 2's turn. 
```

## MANCALA BONUS TURN
- If the last seed lands on the endzone of the player, the player earns an bonus turn.
- Example:
```
Game Board 
*P1*..1...2...3...4...5...6..*P2*
---------------------------------
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
| 0 |-----------------------| 0 | 
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
---------------------------------

Player 1's turn.
4
Your stones landed on your endzone! You get an extra turn
Game Board 
*P1*..1...2...3...4...5...6..*P2*
---------------------------------
|   | 5 | 5 | 5 | 0 | 4 | 4 |   |
| 1 |-----------------------| 0 | 
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
---------------------------------

Player 1's turn.
```

## STEALING 
- If the last piece you drop is in an empty pocket on your side, you capture that piece and any pieces in the pocket directly
opposite.
- Example:
```
Game Board 
*P1*..1...2...3...4...5...6..*P2*
---------------------------------
|   | 10 | 10 | 0 | 0 | 0 | 0 |   |
| 3 |-----------------------| 4 | 
|   | 0 | 1 | 1 | 0 | 10 | 9 |   |
---------------------------------

Player 1's turn.
2
Mancala Steal!
Game Board 
---------------------------------
|   | 11 | 0 | 0 | 0 | 0 | 1 |   |
| 16 |-----------------------| 4 | 
|   | 1 | 2 | 2 | 1 | 0 | 10 |   |
---------------------------------
*P1*..1...2...3...4...5...6..*P2*

Player 2's turn.
```

## ILLEGAL MOVES
- You are required to choose a Mancala house on your side which is an integer between 1-6.
- A valid Mancala house is a house that has more than 0 stones.
- If an illegal move occurs then your turn is completely skipped.
- Example 1:
```
Game Board 
*P1*..1...2...3...4...5...6..*P2*
---------------------------------
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
| 0 |-----------------------| 0 | 
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
---------------------------------

Player 1's turn.
7
**Illegal move: Please enter valid house that you'd like to play (number between 1-6)

Game Board 
---------------------------------
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
| 0 |-----------------------| 0 | 
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
---------------------------------
*P1*..1...2...3...4...5...6..*P2*

Player 2's turn.
```
- Example 2:
```
Game Board 
*P1*..1...2...3...4...5...6..*P2*
---------------------------------
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
| 0 |-----------------------| 0 | 
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
---------------------------------

Player 1's turn.
4
Your stones landed on your endzone! You get an extra turn
Game Board 
*P1*..1...2...3...4...5...6..*P2*
---------------------------------
|   | 5 | 5 | 5 | 0 | 4 | 4 |   |
| 1 |-----------------------| 0 | 
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
---------------------------------

Player 1's turn.
4
**Illegal move: Please enter valid house that you'd like to play (number between 1-6)

Game Board 
---------------------------------
|   | 5 | 5 | 5 | 0 | 4 | 4 |   |
| 1 |-----------------------| 0 | 
|   | 4 | 4 | 4 | 4 | 4 | 4 |   |
---------------------------------
*P1*..1...2...3...4...5...6..*P2*

Player 2's turn.
``` 
## FINAL REMARKS
This project was part of my CS 126 course I took during Winter 2023. I hope you enjoy playing the game!
