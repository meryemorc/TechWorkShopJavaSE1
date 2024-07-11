package com.meryemoruc;

public class _13_Array {

    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] =10;
        numbers[1] = 20;
        numbers [2]= 30;
        numbers[3] = 40;
        numbers[4] =50;

        //dizi elemanlarını yazdırma
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);

            //forEach element
            for(int number:numbers){
                System.out.print(number + " ");
            }
            System.out.println("");
            System.out.println(numbers[0]);
            try{

            } catch (ArrayIndexOutOfBoundsException ai){

            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("");


        }
    }
}
