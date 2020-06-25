import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Hello World!");

        // Creating a random UUID (Universally unique identifier).

//        Date aujourdhui = new Date();
//        DateFormat shortDateFormat = DateFormat.getDateInstance(DateFormat.SHORT);

        //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
       // SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
       // Date firstDate = null;
//        try {
//            firstDate = sdf.parse("23/12/2019");//2019-10-20
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Date secondDate = sdf.parse("04/20/2020");//2019-11-20
//
//        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
//        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//
//
//        System.out.println(diff);
//            if (diff >= 183 ) {
//                System.out.println("jjj");
//            }
//    }
        Date today = new Date();
        Date stoday = new Date();

        long diff = getDifferenceDays(today,stoday );
        System.out.println("diff "+diff);


    }

    public static long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    }
