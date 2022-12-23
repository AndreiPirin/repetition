package sample_code;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTIme {

    public static void main(String[] args) {
        java.text.DateFormat format = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        Date date = new Date();
        System.out.println(format.format(date));

    }

    public void Second2 () {
        System.out.println("Hello");
    };
}