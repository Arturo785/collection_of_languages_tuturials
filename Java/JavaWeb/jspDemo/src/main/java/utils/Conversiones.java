package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversiones {
    private static final String FORMAT_DATE = "dd-MM";

    public static String format(Date date){
        SimpleDateFormat format = new SimpleDateFormat(FORMAT_DATE);

        return format.format(date);
    }

    public static String format(String date){
        SimpleDateFormat format = new SimpleDateFormat(FORMAT_DATE);

        return format.format(date);
    }
}
