package com.bd.practicalClass;

public class StrCheck {
    /**
     * 检查文件以.java结尾
     * @param srcStr
     * @return true or false
     */
    public static boolean suffixcheck(String srcStr) {
        if(srcStr.length() > 5 && ".java".equals(srcStr.substring(srcStr.length()-5))) {
            return true;
        }
        return false;
    }

    /**
     * 检查文件包含@和. @在.之前
     * @param srcStr
     * @return true or false
     */
    public static boolean emailCheck(String srcStr) {
        int p = srcStr.indexOf('@');
        int q = srcStr.indexOf('.');
        if (p != -1 && q != -1 && p < q)
            return true;
        return false;
    }

    /**
     * 检查一个字符串中有多少个sign
     * @param srcStr
     * @param sign
     * @return
     */
    public static int getSignCount(String srcStr, String sign) {
        String[] strArray = srcStr.split(sign);
        return strArray.length - 1;
    }
}
