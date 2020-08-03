import csv

myFile = open("D:\Arturo\Documents\python course\\find_the_link.csv",encoding="utf-8")

csvData = csv.reader(myFile)

dataLines = list(csvData)

#print(dataLines)

myFile.close()

index = 0
fileURL = ""

# for line in dataLines:
#     fileURL+= line[index]
#     index += 1

#or
for index, data in enumerate(dataLines): #enumerates the elements inside, 1st param takes the number, second the element in the list
    fileURL += data[index]

print(fileURL)
