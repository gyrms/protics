package com.protics.util;

public class StringUtil {

    // 메서드 A: 문자열 비어있는지 확인
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    // 메서드 B: 문자열 뒤집기 ★ 이것만 필요!
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
}
