package com.lizi.year2022.month6.day0629;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/29 08:46
 **/
public class OneTopic0629 {

    public static void main(String[] args) {
        encode("https://leetcode.com/problems/design-tinyurl");
    }

    public static String encode(String longUrl) {
        byte[] bArr = longUrl.getBytes();
        for(int i = 0; i < bArr.length; i++){
            bArr[i] = (byte) (bArr[i] ^ (int)'8');
        }
        return new String(bArr, 0, bArr.length);
    }

    public static String decode(String shortUrl) {
        return encode(shortUrl);
    }
}
