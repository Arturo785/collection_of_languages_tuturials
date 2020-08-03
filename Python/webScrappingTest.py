import requests
import bs4

base_url = "http://books.toscrape.com/catalogue/page-{}.html"

twoStarsList = []

for page in range(1,51):
    scrapeUrl = base_url.format(page)

    result = requests.get(scrapeUrl)

    soup = bs4.BeautifulSoup(result.text,"lxml")
    books = soup.select(".product_pod")

    for book in books:
        if len(book.select(".star-rating.Two")) != 0:
            twoStarsList.append(book.select("a")[1]["title"])

print(twoStarsList)


