package com.tools.extract2kafka.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
    private static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public static LocalDateTime str2dateTime(String timeStr){
        return LocalDateTime.parse(timeStr, df);
    }

    public static String dateTime2str(LocalDateTime localDateTime){
        return df.format(localDateTime);
    }

    public static String getNowTime(){
      return LocalDateTime.now().format(df);
    }
    public static void main(String[] args) {
        System.out.println(getNowTime());
    }
}
