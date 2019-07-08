package tables;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetSystemDate {
	
	private static final DateFormat sdf = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
        cal.add(Calendar.DATE, 7);
        System.out.println(sdf.format(cal.getTime()));
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        
        System.out.println(now.plusDays(7));
        

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyy").format(localDate));

    } 
}
