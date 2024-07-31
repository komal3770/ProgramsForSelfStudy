package programs.praticals;

import java.util.Calendar;

public class HoursCalc {

  public static void main(String[] args) {
    Calendar inTime = Calendar.getInstance();
    inTime.set(Calendar.HOUR_OF_DAY, 15);
    inTime.set(Calendar.MINUTE, 5);

    Calendar curr = Calendar.getInstance();
    curr.set(Calendar.HOUR_OF_DAY, 15);
    curr.set(Calendar.MINUTE, 16);
    long difference = curr.getTime().getTime() - inTime.getTime().getTime();
    long hr = difference / (60 * 60 * 1000) % 24;
    long min = difference / (60 * 1000) % 60;
    System.out.println(String.format("%02d", hr) + ":" + String.format("%02d", min));
  }
}
