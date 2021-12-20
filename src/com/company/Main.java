package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz :");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");

        }else if (heat <= 25){
            if (heat >= 5 && heat <=10){
                System.out.print("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 11 && heat <=14){
                System.out.print("Sinemaya veya pikniğe gidebilirsiniz.");
            }
            if (heat >= 15 && heat <=25){
                System.out.print("Pikniğe gidebilirsiniz. ");
            }
        }else{
            System.out.print("Yüzmeye gidebilirsiniz.");
        }


    }
}
