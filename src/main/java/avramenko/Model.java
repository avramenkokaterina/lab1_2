package main.java.avramenko;

public class Model {

    public static StringBuilder chooseString(int capacity, View view){
        Controller controller = new Controller();
        int choice;
        do {
            choice = view.readNumber();
        }while ((choice==1) && (choice ==2));
        StringBuilder str = new StringBuilder();
        switch(choice){
        case 1:
            str.delete(0,str.length());
            str.append(controller.createString(capacity));
            break;
        case 2:
            str.delete(0,str.length());
            str.append(controller.readString());
            break;
        default: break;
        }
        return str;
    }

    public static StringBuilder modifyString(int number, StringBuilder str, StringBuilder subStr){
        StringBuilder insertStr = new StringBuilder();
        int startPoint = 0;
        String[] sentences = str.toString().split("[.!?]");
        for (String string: sentences){
            insertStr.append(string + ".");
            insertStr.insert(number+startPoint, subStr);
            startPoint+=string.length()+subStr.length()+1;
        }
        return insertStr;
    }
}
