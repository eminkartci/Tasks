
### Task 6
```
Title: Tic Tac Toe

    Design a game which has a 2 dimensional board. There will be 
    2 players and they have specific "char" to put on the board. 
    By considering the rules they may win or the game might be tie.

1. Welcome the users & Get nicknames:

   Make this game's UI elegant. Create "Player" and 
   "Game" Objects. Think carefully before coding !!
   The Attributes and Behaviours should be decided by you.

2. 2D Array -> Board:

   Inside the "Game" object define 2D char array.
   Borad ->  [['','',''],
              ['','',''],
              ['','','']] 3x3 matrix

    Initialize all elements assign ' ' a space.

3. Print the Board:

   Write a simple method to print the board on the screen.
   You can use new methods or ask someone to learn.

4. The rules to win:

    1 - Check all rows and if any sign fills a row the game is over.
    2 - Check all cloumns and if any sign fills a row the game is over.
    3 - Check all diagonals and if any sign fills a row the game is over.

    Basically, 3 strikes means that the player has won.

5. Hold the win count & nickname and every related behaviour on the Player Object


```
### Sample Case
```
------------------------------------------------
|   Tic Tac Toe Game
|   
|   By  : Emin Kartci
|   Date: 27 Feb 2021
------------------------------------------------

Player 1 Character:
X(this is input)
Player 2 Character
O(this is input)

Turn 1 : Player 1 (X)
Board  :
  |   |  
----------
  |   |  
----------
  |   |  


1 | 2 | 3
----------
4 | 5 | 6
----------
7 | 8 | 9
Select: 5 (this is input)

Turn 2 : Player 2 (O)
Board  :
  |   |  
----------
  | X |  
----------
  |   |  


1 | 2 | 3
----------
4 | 5 | 6
----------
7 | 8 | 9
Select: 1 (this is input)

Turn 3 : Player 1 (X)
Board  :
O |   |  
----------
  | X |  
----------
  |   |  


1 | 2 | 3
----------
4 | 5 | 6
----------
7 | 8 | 9
Select: 7 (this is input)

Turn 4 : Player 2 (O)
Board  :
O |   |  
----------
  | X |  
----------
X |   |  


1 | 2 | 3
----------
4 | 5 | 6
----------
7 | 8 | 9
Select: 2 (this is input)

Turn 5 : Player 1 (X)
Board  :
O | O |  
----------
  | X |  
----------
X |   |  


1 | 2 | 3
----------
4 | 5 | 6
----------
7 | 8 | 9
Select: 3 (this is input)

Winner is Player 1 !!
Board  :
O | O | X
----------
  | X |  
----------
X |   |  



```
---
### Thanks
```
Author      : Emin Kartci
Date        : 27/02/2021
Difficulty  : Hard
Mail        : emin.kartci@ozu.edu.tr
```


