
class Player:

    # Constructor
    def __init__(self,id) -> None:
        self.id         = id
        self.selection  = None # initialize
        self.get_nickname()

    def __str__(self) -> str:
        return f"""
--- PLAYER {self.id}
| Nickname : {self.nickname}
| Selection: {self.selection}
        """

    # Behaviours
    def get_nickname(self):
        self.nickname = input("Nickname: ")

    def select(self):
        self.selection = int(input("* 1 -> Rock(🪨)\n* 2 -> Paper(📰)\n* 3 -> Scissors(️️✂️))\nSelect: "))

class Game():

    def __init__(self):
        self.p1 = Player(1)
        self.p2 = Player(2)

    def play(self):
        self.p1.select()
        self.p2.select()

        self.winner()

    def print_players(self):
        print(self.p1)
        print(self.p2)

    def winner(self):
        # tie
        if self.p1.selection == self.p2.selection:
            print("There is no winner! It's draw.")
        else:
            if self.p1.selection == 1: # P1 Rock
                if self.p2.selection == 2: # P2 WINNER
                    print(f"Player {self.p2.nickname} is the winner !!!")
                else:
                    print(f"Player {self.p1.nickname} is the winner !!!")
            elif self.p1.selection == 2: # P1 Paper
                if self.p2.selection == 1: # P1 WINNER
                    print(f"Player {self.p1.nickname} is the winner !!!")
                else:
                    print(f"Player {self.p2.nickname} is the winner !!!")
            elif self.p1.selection == 3: # P1 Scissors 
                if self.p2.selection == 2: # P1 WINNER
                    print(f"Player {self.p1.nickname} is the winner !!!")
                else:
                    print(f"Player {self.p2.nickname} is the winner !!!")


game = Game()
game.play()

