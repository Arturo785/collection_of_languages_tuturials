from PIL import Image

myImage = Image.open("imageScrapped.jpg")


print(type(myImage))

#myImage.show()

print(myImage.size)
print(myImage.filename)

#myImage.crop((0,0,100,100))

#item.paste() puts an image inside an image
#resize and rotate methods also exist
#we can change the rgb with put alpha

# var.save() to save the image

