package main.java.avramenko;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        View view = new View();
        view.printStartMessage();
        view.chooseMessage();
        int capacity = 1000;
        StringBuilder str = Model.chooseString(capacity, view);
        view.printString(str, 1 );
        view.chooseMessage();
        capacity = 100;
        StringBuilder subStr = Model.chooseString(capacity, view);
        view.printString(subStr, 2);
        view.printMessage(2);
        int number = view.readNumber();
        StringBuilder result = Model.modifyString(number, str, subStr);
        view.printResult(result);
    }

    public StringBuilder createString(int capacity){
        StringBuilder string1 = new StringBuilder();
        if (capacity == 1000) {
            string1.append("Java is a general-purpose computer-programming language.\n" +
                    "It is intended to let application developers \"write once, run anywhere\" (WORA).\n" +
                    "WORA means that compiled Java code can run on all platforms that support\n" +
                    "Java without the need for recompilation" +
                    "Java applications are typically compiled\nto bytecode that can run on any Java virtual machine.");
        }
        else string1.append("JAVA");
        return string1;
    }

    public StringBuilder readString(){
        Scanner sc = new Scanner(System.in);
        StringBuilder string2 = new StringBuilder(1000);
        string2.append(sc.nextLine());
        return string2;
    }
}
