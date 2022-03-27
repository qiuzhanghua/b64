package cn.com.taiji.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.binary.Base64;

public class Main {

    public static void main(String[] args) {
        String s, s2;
        s = (new BASE64Encoder()).encode("中文".getBytes(StandardCharsets.UTF_8));
        System.out.println(s);
        try {
            s2 = new String((new BASE64Decoder()).decodeBuffer(s), StandardCharsets.UTF_8);
            System.out.println(s2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        s = new String(Base64.encodeBase64("中文".getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        System.out.println(s);
        s2 = new String(Base64.decodeBase64(s), StandardCharsets.UTF_8);
        System.out.println(s2);
    }
}
