package com.code4j;

/**
 * Created by code4j on 2015/1/13.
 */
public class Test {
    public static void main(String[] args) {
//        byte t = 0x01;
//        System.out.format("%02X", t);
        Integer lowByte = 0xd7;
        System.out.format("%02X", lowByte);
        System.out.println("");
        byte b = lowByte.byteValue();
        System.out.format("%02X", b);
        System.out.println("");
        int highByte = 0x01;
        System.out.format("%02X", ((lowByte & 0xFF) | ((highByte & 0xff) << 8)));
        System.out.println();
        System.out.format("%d", ((lowByte & 0xFF) | ((highByte & 0xff) << 8)));
        System.out.println();
        System.out.format("%d", ((lowByte) | ((highByte) << 8)));
    }
}
