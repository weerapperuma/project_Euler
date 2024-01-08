package lk.penguin;

import java.util.ArrayList;
import java.util.Scanner;

public class AppInitilaizer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input number: ");
        int number=scanner.nextInt();

        int number1=1;
        int number2=2;
        int total=0;
        ArrayList<Integer> fibonaciList=new ArrayList<>();
        fibonaciList.add(number1);
        fibonaciList.add(number2);


        while(true){
            int number3=number1+number2;
            if(number3>=number){
                break;
            }
            fibonaciList.add(number3);

            number1=number2;
            number2=number3;


        }
        for(int num:fibonaciList){
            total+=num;
        }
        System.out.println(total);
    }
}
