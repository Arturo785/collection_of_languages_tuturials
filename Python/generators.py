

def generatorOfSquares(n):
    for num in range(n):
        yield num ** 2  #Creates and sends the number one of a time instead of creating a whole list and waste memory

# for num in generatorOfSquares(5):
#     print(num)

gen = generatorOfSquares(5)

print(gen)
print(next(gen))
print(next(gen))
print(next(gen))

word = "Hello"
s = iter(word)
print(next(s))
print(next(s))
print(next(s))