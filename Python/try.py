import unittest


# def sumar(num1, num2):
#     return num1+num2


# while True:
#     try:
#         result = sumar(5,5)
#         print(result)
#     except:
#         print("Que verga paso")
#         continue
#     else: 
#         print("Si no la cagas salgo yo")
#         break
#     finally:
#         print("Yo salgo de awebo")

# def tryTest1():
#     try:
#         for i in ['a','b','c']:
#             print(i**2)
#     except TypeError:
#         print("Son letras we")


class Testing(unittest.TestCase):

    def test_tryTest2(self):
        x = 5
        y = 5
        z = x/y

        self.assertEqual(z,1)

if __name__ == "__main__":
    unittest.main()



