

def sayHello(name = "Jose"):

    print("Inside Hello")

    def helloInside():
        return "Hello from inside helloFunction"

    def helloInside2():
        return "Hello from inside secind helloFunction"

    if name == "Jose":
        return helloInside
    else:
        return helloInside2

def iJustSayHello():
    return "Helloooo"

def funcThatReceivesAFunc(funcPassed):
    print("I do other things")
    print(funcPassed())

def newDecorator(original_func):

    #Decorates the old func with new things
    def wrap_func():
        print("Do Things before original fun")

        original_func()

        print("Do things after oroginal Fun")

    return wrap_func

@newDecorator #can be ereased and the fun will work normally
def i_need_to_be_decorated():
    print("I need new stuff")

    

    
#newOne = sayHello("jo")

#print(newOne())

#funcThatReceivesAFunc(iJustSayHello)

#newFunc = newDecorator(i_need_to_be_decorated)

#newFunc()

i_need_to_be_decorated()


