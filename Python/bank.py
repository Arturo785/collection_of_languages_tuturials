from classes_class import Animal, someMethodToImport


class Account(Animal):

    def __init__(self,owner,money):
        Animal.__init__(self)
        self.owner = owner
        self.money = money
    
    def __str__(self):
        return """Account owner {}\nAccount balance ${}""".format(self.owner, self.money)

    def deposit(self,ammount):
        if(ammount > 0):
            self.money += ammount
            return "Money Accepted: Current amount ${}".format(self.money)
        
        return "Money not accepted"

    def withdraw(self,ammount):
        if(ammount > 0):
            if(self.money - ammount >= 0):
                self.money -= ammount
                return "Money Taken: Current amount ${}".format(self.money)
        
        return "Withdraw not accepted"

jorgeAccount = Account("Jorge", 1000)

#print(jorgeAccount)

print(jorgeAccount.deposit(150))
print(jorgeAccount.withdraw(150))
jorgeAccount.eat()

print(jorgeAccount)

someMethodToImport()

    