import java.util.*;
import java.text.SimpleDateFormat;

public class Puzzle2 {

    /**
     * Given the timestamp, convert to the time display for the given timezone.
     *
     * @param timestamp epoch time in milliseconds
     * @param timezone  Timezone to use for display
     * @return Display string for the time in the proper timezone
     */
    public static String convertToDisplayTime(Long timestamp, String timezone) {
          //Time zone
          TimeZone tz = TimeZone.getTimeZone(timezone);
          //System.out.println("time zone" + timezone);

          //Time stamp
          SimpleDateFormat datetime = new SimpleDateFormat();
          datetime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
          //System.out.println("Date & Time " + datetime);

          //align zone with stamp
          datetime.setTimeZone(tz);

          // //Create a date object
          Date date = new Date(timestamp);
          //System.out.println("date timezone" + date);
          return datetime.format(date);

          

    }

    public static void main(String[] args)throws Exception {
        System.out.println(convertToDisplayTime(1383858000000L,"America/New_York"));
        System.out.println(convertToDisplayTime(1383840000000L,"Europe/London"));
        System.out.println(convertToDisplayTime(1383858000000L,"America/Bogota"));
        System.out.println(convertToDisplayTime(1383807600000L,"Asia/Tokyo"));
        System.out.println(convertToDisplayTime(1383840000000L,"America/Los_Angles"));
        System.out.println(convertToDisplayTime(1383825600000L,"Asia/Dubai"));
        System.out.println(convertToDisplayTime(1383811200000L,"Asia/Hong_Kong"));
    }
}
