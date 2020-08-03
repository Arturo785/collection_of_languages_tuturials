from Card import Card

class Deck():

    def __init__(self,cards):
        self.cards = cards

    def numberOfCards(self):
        return len(self.cards)

    def withDrawCardFromDeck(self,card):
        try:
            self.cards.remove(card)
            print("Card removed")
        except:
            print("Card not found")

    def addCardToDeck(self,card):
        self.cards.append(card)

    def seeDeck(self):
        for card in self.cards:
            print(card)