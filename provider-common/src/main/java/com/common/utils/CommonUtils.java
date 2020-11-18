package com.common.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class CommonUtils {
    /**
     * 获取list实例
     *
     * @return
     */
    @SafeVarargs
    public static <T> List<T> getList(T... ts) {
        List<T> list = new ArrayList<T>();
        for (T t : ts) {
            list.add(t);
        }
        return list;
    }

    /**
     * 日期转格式字符串
     *
     * @param format 格式
     * @param date   日期
     * @return
     */
    public static String getFormatDate(String format, Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    /**
     * 日期计算
     *
     * @param format   格式
     * @param date     日期
     * @param category 年,月,日;Calendar.YEAR,Calendar.MONTH,Calendar.DATE
     * @param num      数量 加1天:1,减一天:-1
     * @return
     */
    public static String getDate(String format, Date date, int category, int num) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(category, num);
        Date date2 = calendar.getTime();
        return dateFormat.format(date2);
    }

    /**
     * 模糊匹配字符串
     *
     * @param para
     * @return
     */
    public static String getLikeStr(Object para) {
        if(para == null){
            return null;
        }
        return "%" + para + "%";
    }
}