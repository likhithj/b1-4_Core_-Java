package date;


import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class date2 {

public static void main(String[] args) {

LocalDateTime myDateObj = LocalDateTime.now();

DateTimeFormatter myFormatObj =
DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

String formattedDate = myDateObj.format(myFormatObj);

System.out.println(formattedDate);

}

}