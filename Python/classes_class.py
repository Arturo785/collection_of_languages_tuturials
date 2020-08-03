class Dog():

    breed = ""
    size = ""
    name = ""
    weight = 0

    def __init__(self,breed, size):
        self.breed = breed
        self.size = size
    
    def nameIt(self,name):
        self.name = name

    def setWeight(self,weight):
        self.weight = weight
    
    def setSize(self,size):
        self.size = size





class Animal():
    age = 5

    def __init__(self):
        print("Animal created")

    def eat(self):
        print("I am eating")

class Cat(Animal):

    color = "Brown"
    weight = 5
    lolo = "abc"
    
    def __init__(self):
        Animal.__init__(self)
        print("Cat created")

    def __str__(self):
        return """{} color, {} weight, {} lolo""".format(self.color, self.weight, self.lolo)

    def __len__(self):
        return 4

def someMethodToImport():
    print("YEEEEI")



myCat = Cat()

myCat.eat()
print(myCat)
print(len(myCat))