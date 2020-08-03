from Deck import Deck
from Card import Card
class Player():

    def __init__(self, name,deck):
        self.name = name
        self.deck = deck


def beginGameTest():
    
    listOfCards = []
    for num in range(10):
        newCard = Card(num,num)
        listOfCards.append(newCard)

    myDeck = Deck(listOfCards)

    jorge = Player("Jorge",myDeck)

    jorge.deck.seeDeck()
    jorge.deck.withDrawCardFromDeck(listOfCards[5])
    jorge.deck.seeDeck()
    print(jorge.deck.numberOfCards())
    jorge.deck.addCardToDeck(listOfCards[0])
    jorge.deck.seeDeck()
    print(jorge.deck.numberOfCards())




if __name__ == "__main__":
    beginGameTest()
    

    