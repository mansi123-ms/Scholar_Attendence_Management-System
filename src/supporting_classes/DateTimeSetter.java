/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supporting_classes;

import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JLabel;

/**
 *
 * @author Ashu Jain
 */
public class DateTimeSetter 
{

    public static void getDateTime(JLabel label1,JLabel label2)
    {
        LocalDateTime ldt = LocalDateTime.now();
        String date = ldt.getDayOfMonth() + " " + ldt.getMonth().toString() + "," + ldt.getYear();
        label2.setText(date);
        String time;
        String hours = null;
        String minutes;
        String format = "AM";
        while (true) {
            try {
                LocalTime lt = LocalTime.now();
                int hr = lt.getHour();
                if (hr > 12) {
                    hr = hr - 12;
                    if (hr < 10) {
                        hours = "0" + hr;
                    } else {
                        hours = hr + "";
                    }
                    format = "PM";
                } else if (hr <= 12) {
                    if (hr < 10) {
                        hours = "0" + hr;
                    } else {
                        hours = hr + "";
                    }
                    format = "AM";
                }

                if (hours.equals("00")) {
                    hours = "12";
                }

                if (lt.getMinute() < 10) {
                    minutes = "0" + lt.getMinute();
                } else {
                    minutes = lt.getMinute() + "";
                }

                time = hours + ":" + minutes + " " + format;
                label1.setText(time);

                Thread.sleep(1000);

            } catch (InterruptedException ex) {
            }
        }
    }
}
