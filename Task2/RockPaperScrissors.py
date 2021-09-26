
class Player:

    # Constructor
    def __init__(self,id) -> None:
        self.id         = id
        self.selection  = None
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

    def print_players(self):
        print(self.p1)
        print(self.p2)

    def winner(self):
        pass