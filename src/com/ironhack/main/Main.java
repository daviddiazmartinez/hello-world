package com.ironhack.main;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Good bye World :)");
        int day=5;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");

        }
        int[] numList = {1,4,7,9,6,10};
        System.out.println(maximum(numList));

        String product = productFormatter("Nike model 956 ", "2021 06 10");
        System.out.println(product);

        int[] input = {5,4,3,2,1};
        int[] output = multiplierLoop(input);
        System.out.println(Arrays.toString(output));

        System.out.println(Arrays.toString(invertPosition(input)));

    }

    String productName = "Nike model 956 ";
    String date = "20210502";

//    métodos de los String
    public static String productFormatter ( String productName, String date){
        return (productName.trim() +" "+ date.trim()).replace(" ","_").toUpperCase();
    }

    public static int[] multiplierLoop (int[] input){
        int initial = input[0];
        for(int i=0; i<input.length;i++){
            if(i==input.length-1){
                input[i] *= initial;
            }else {
                input[i] *= input[i+1];
            }
        } return input;
    }

    public static int[] invertPosition (int[] input){
        int[] invertArray = new int[input.length];
        int indexPosition = 0;
        for(int i=input.length-1; i>=0;i--){
            invertArray[indexPosition] = input[i];
            indexPosition++;
        }
        return invertArray;
    }


    public static int maximum(int[] numList){
        int max=0;
        for(int i=0; i<numList.length;i++){
            if(numList[i]>max){
                max=numList[i];
            }
        }
        return max;
    }
}



