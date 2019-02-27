package com.mitrais.training.j7;

public class BinaryLiteralWithPrefixExample {
    public static void main(String[] args) {
        //Binary Literals
        byte input1 = 0b1001; //9
        byte input2 = 0B1001; //9
        System.out.println("Binary Literal for byte : "+input1);
        System.out.println("Binary Literal for byte : "+input2);

        short input3 = 0b10000000; //128
        short input4 = 0b1000_0000; //128
        System.out.println("Binary Literal for type short : "+input3);
        System.out.println("Binary Literal for type short : "+input4);

        int input5 = 0b100000001111; //527
        int input6 = 0b1000_0000_1111; //527
        System.out.println("Binary Literal for type int : "+input5);
        System.out.println("Binary Literal for type int : "+input6);

        long input7 = 0b1000000101010110101010101010; //68512426
        long input8 = 0b1000_0001_0101_0110_1010_1010_1010; //68512426
        System.out.println("Binary Literal for type long : "+input7);
        System.out.println("Binary Literal for type long : "+input8);

        //underscore(_) to break the digits to improve the readibilty
        int input9 = 1_000_123;
        long input10 = 1_111_123_424;
        float input11 = 3.14_234_345_713f;

        System.out.println("Integer data type with underscore: "+input9);
        System.out.println("Long data type with underscore: "+input10);
        System.out.println("Float data type with underscore: "+input11);

    }
}
