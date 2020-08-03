from collections import Counter
import os
import shutil
from datetime import datetime




myList = [1,1,2,2,3,3,4]

count = Counter(myList)

print(count)


# OS MODULES

#print(os.listdir("C:\\users"))

#shutil.move("naruto.txt","C:\\Users\\Arturo\\Desktop")
#print(os.listdir())

#print(datetime)

#OS.walk makes a three in which you could iterarte through



  
numbers1 = [1, 2, 3] 
numbers2 = [4, 5, 6] 
  
result =list( map(lambda x: x **2, numbers1) )
#print(result)
print(result)

#Tuple unpacling with *args

myTuple = ((1,2,"hola"),"aaaa",5,4,8,9,5,4,"soy el ultimo")

a,b,*c = myTuple
*args,j = myTuple

print(a)
print(b)
print(c)

print("///////////////////////////////")
print(args)
print(j)




