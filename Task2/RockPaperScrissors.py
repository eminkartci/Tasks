
class Player:

    # Constructor
    def __init__(self,id) -> None:
        self.id         = id
        self.get_nickname()

    def __str__(self) -> str:
        return f"""
--- PLAYER {self.id}
| Nickname: {self.nickname}
        """

    # Behaviours
    def get_nickname(self):
        self.nickname = input("Nickname: ")


p1 = Player(1)
p2 = Player(2)


print(p1)
print(p2)