package Calculator.Views;

import java.util.Scanner;

public class ConsoleView {
    private Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }

    public String getValueStr(String title) {
        System.out.println(title);
        return in.next();
    }

    public void print(String title) {
        System.out.println(title);
    }

    
    public void printInt(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public int getValueInt(String title) {
        System.out.printf("%s\n", title);
        return in.nextInt();
    }

    
    public void printDouble(double data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public double getValueDouble(String title) {
        System.out.printf("%s\n", title);
        return in.nextDouble();
    }

    
    public void print(double data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
