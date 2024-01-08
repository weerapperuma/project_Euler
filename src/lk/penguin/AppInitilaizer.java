package lk.penguin;

import java.util.ArrayList;
import java.util.Scanner;

public class AppInitilaizer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input number: ");
        int number=scanner.nextInt();

        ArrayList<Integer> multiples=new ArrayList<>();
        System.out.println("Input numbers that you want to multiply: ");


        while(true) {
            int multiplyDigit= scanner.nextInt();
            if(multiplyDigit==0){
                break;
            }
            multiples.add(multiplyDigit);
        }
        for(int i:multiples){
            System.out.println(i);
        }
        ArrayList<Integer> dividenumbers=new ArrayList<>();
        for(int i=0;i<number;i++){
            if(i%3==0 || i%5==0){
                dividenumbers.add(i);
            }
        }
        int total=0;
        for (int number1:dividenumbers){
            System.out.println(number1);
            total+=number1;
        }
        System.out.println(total);
    }
}
