package archivos;

import java.io.*;

public class ArchivosMain {

    public static final String PATH = "D:\\Arturo\\Documents\\Java course\\1st\\src\\archivos\\archivosTXT\\";

    public static void main(String[] args) {
        var prueba = "prueba.txt";

        //crearArchivo(prueba);
        writeToFile(prueba,"gegegeg como andamos");
        addToFile(prueba,"\ngegegeg como andamos x2");
        System.out.println(readFile(prueba));

    }

    public static void crearArchivo(String nameOfTxt){
        File file = new File(PATH + nameOfTxt);

        try {
            PrintWriter out = new PrintWriter(file);
            out.close();
            System.out.println("file created");
        }
        catch (Exception e){
            System.out.println("Something happened: " + e.getMessage());
        }
    }

    public static void writeToFile(String fileName, String content){
        File file = new File(PATH + fileName);

        try {
            PrintWriter out = new PrintWriter(file);
            out.println(content);
            out.close();
            System.out.println("Content written");
        }
        catch (Exception e){
            System.out.println("Something happened: " + e.getMessage());
        }
    }

    public static void addToFile(String fileName, String content){
        File file = new File(PATH + fileName);

        try {
            PrintWriter out = new PrintWriter(new FileWriter(file,true));
            out.println(content);
            out.close();
            System.out.println("Content edited");
        }
        catch (Exception e){
            System.out.println("Something happened: " + e.getMessage());
        }
    }

    public static String readFile(String fileName){
        File file = new File(PATH + fileName);
        String message = "";

        try {   //Buffer reader reads whole lines, file reader does not
            var entry = new BufferedReader(new FileReader(file));

            String lineOfText;
            lineOfText = entry.readLine();

            while (lineOfText != null){
                message += lineOfText;
                lineOfText = entry.readLine();
            }
            entry.close();
        }
        catch (Exception e){
            System.out.println("Something happened: " + e.getMessage());
        }
        return message;
    }
}
