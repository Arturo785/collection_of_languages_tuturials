import requests
import bs4

# result = requests.get("http://example.com")

# soup = bs4.BeautifulSoup(result.text,"lxml")

# print(soup.select("title")[0].getText())

result = requests.get("https://en.wikipedia.org/wiki/Deep_Blue_(chess_computer)")

soup = bs4.BeautifulSoup(result.text,"lxml")

# for item in soup.select("img"):
#     print(item.text)


computerImg =  soup.select(".thumbimage")[0]["src"]

imageLink = "https:"
imageLink += computerImg

print(imageLink)

image = requests.get(imageLink)

#print(image.content)

storedImage = open("d:/Arturo/Documents/python course/imageScrapped.jpg","wb")
storedImage.write(image.content)
storedImage.close()

