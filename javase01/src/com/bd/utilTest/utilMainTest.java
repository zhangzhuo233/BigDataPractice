package com.bd.utilTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class utilMainTest {
    public static void main(String[] args) {
        /**
         * StringBuffer 使用
         */
        StringBuffer strBuffer = new StringBuffer("0123456789");
        for (int i = strBuffer.length() - 3; i > 0; i -= 3) {
            strBuffer.insert(i, ",");
        }
//        for (int i = 2; i < strBuffer.length(); i += 3) {
//            strBuffer.insert(i, ",");
//            i++;
//        }
        System.out.println(strBuffer.toString());
        /**
         * Date使用
         */
        Date now = new Date();
        System.out.println(now.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("y年M月D日H:m:s:S 时区z");
        System.out.println(sdf.format(now));
        String date = "2019年1月20日17:0:32:451 时区CST";
        Date d = null;
        try {
            d = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
        /**
         * 测验
         */
        Calendar cal = Calendar.getInstance();
//        cal.set(2019, 2, 1);
//        cal.set(Calendar.YEAR, 2018);
//        cal.set(Calendar.MONTH, 1-1); //MONTH从0开始
//        cal.set(Calendar.DAY_OF_MONTH, 6);
        cal.set(2018,1-1, 6);
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        System.out.println(week);
//        System.out.println(Calendar.WEEK_OF_MONTH);
//        System.out.println(cal.WEEK_OF_YEAR);
    }
}
