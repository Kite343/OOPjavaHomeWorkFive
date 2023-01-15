package Views;

import java.util.Scanner;

public class ConsoleView {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }

    public String getValueStr(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }

    
    public void print(String data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public double getValueDouble(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    
    public void print(double data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
