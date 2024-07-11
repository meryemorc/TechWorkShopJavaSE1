package com.meryemoruc;

enum Eticaret{
    SMALL,MEDIUM,LARGE,XLARGE
}

public class _12_Enum {
    public static void main(String[]args){
        Eticaret eticaret =Eticaret.SMALL;
        System.out.println(eticaret);
        System.out.println(eticaret.hashCode());
        System.out.println(eticaret.ordinal());

        //stringe çevir
        String etic = Eticaret.XLARGE.toString();
        System.out.println(etic);


    }
}
