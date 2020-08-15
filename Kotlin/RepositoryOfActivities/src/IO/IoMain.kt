package IO

import java.io.*

val PATH = "D:\\Arturo\\Documents\\Kotlin course\\RepositoryOfActivities\\src\\IO\\txts\\"
fun main() {

    writeToFile("MyText.txt","Escribir en el archivo")
    addToFile("myText.txt","Contenido Agregado")
    println(readFile("myText.txt"))
}

fun crearArchivo(nameOfTxt: String) {
    val file = File(PATH.toString() + nameOfTxt)
    try {
        val out = PrintWriter(file)
        out.close()
        println("file created")
    } catch (e: Exception) {
        println("Something happened: " + e.message)
    }
}

fun writeToFile(fileName: String, content: String?) {
    val file = File(PATH.toString() + fileName)
    try {
        val out = PrintWriter(file)
        out.println(content)
        out.close()
        println("Content written")
    } catch (e: Exception) {
        println("Something happened: " + e.message)
    }
}

fun addToFile(fileName: String, content: String?) {
    val file = File(PATH.toString() + fileName)
    try {
        val out = PrintWriter(FileWriter(file, true))
        out.println(content)
        out.close()
        println("Content edited")
    } catch (e: Exception) {
        println("Something happened: " + e.message)
    }
}

fun readFile(fileName: String): String? {
    val file = File(PATH.toString() + fileName)
    var message: String? = ""
    try {   //Buffer reader reads whole lines, file reader does not
        val entry = BufferedReader(FileReader(file))
        var lineOfText: String?
        lineOfText = entry.readLine()
        while (lineOfText != null) {
            message += lineOfText
            lineOfText = entry.readLine()
        }
        entry.close()
    } catch (e: Exception) {
        println("Something happened: " + e.message)
    }
    return message
}