package com.app.common;

import com.jfinal.kit.StrKit;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParamVerifyUtil {
    /**
     * 判断集合是否为空
     *
     * @param list
     * @return
     */
    public static boolean verifyList(List<?> list) {
        return !(list == null || list.size() < 1);
    }

    /**
     * 校验Integer 整形 null或<=0 返回false
     *
     * @param id
     * @return
     */
    public static boolean verifyInteger(Integer... ids) {
        for (Integer id : ids) {
            return !(id == null || id <= 0);
        }
        return true;
    }

    /**
     * 校验Long 长整形 null或<=0 返回false
     *
     * @param id
     * @return
     */
    public static boolean verifyLong(Long... ids) {
        for (Long id : ids) {
            return !(id == null || id <= 0);
        }
        return true;
    }

    /**
     * 校验邮箱格式是否正确
     *
     * @param mail
     * @return
     */
    public static boolean verifyMail(String mail) {
        return StrKit.notBlank(mail) && mail.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
    }

    /**
     * 校验手机号码格式是否正确
     *
     * @param phone
     * @return
     */
    public static boolean isPhone(String phone) {
        if (StringUtils.isEmpty(phone)) {
            return false;
        }
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        if (phone.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            return isMatch;
        }
    }
}