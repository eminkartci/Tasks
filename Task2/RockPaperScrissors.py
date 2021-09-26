
class Player:

    # Constructor
    def __init__(self,id,nickname) -> None:
        self.id         = id
        self.nickname   = nickname

    def __str__(self) -> str:
        return f"""
--- PLAYER {self.id}
| Nickname: {self.nickname}
        """


p1 = Player(1,"eminkartci")
p2 = Player(2,"denizucgun")

print(p2)