package main.java.avramenko;

import java.util.Scanner;

public class View {

    public void printStartMessage(){
        System.out.println("Developer: Kateryna Avramenko\n");
    }

    public void chooseMessage(){
        System.out.println("Choose:\n1.Generate String.\n2.MyString");
    }

    public void printString(StringBuilder str, int i){
        switch(i){
            case 1: System.out.println("String:\n" + str);break;
            case 2: System.out.println("SubString:\n" + str);break;
        }
    }

    public int readNumber() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            while (!sc.hasNextInt()){
                System.out.println("Not a number. Please, choose 1 or 2.");
                sc.next();
            }
            n = sc.nextInt();
        }while (n<0);
        return n;
    }

    public void printResult(StringBuilder sentences) {
        System.out.println("Result: ");
        System.out.println(sentences);

    }

    public void printMessage (int n){
        switch(n){
            case 1: System.out.println("\nChoose 1 or 2:");break;
            case 2: System.out.println("\nEnter number of symbol:");break;
            default: break;
        }
    }
}
