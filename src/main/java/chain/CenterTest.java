package chain;

import java.util.Scanner;

public class CenterTest {
    public static void main(String[] args) {
        Center center = new Center();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String value = scanner.nextLine();
            center.emergency(value);
        }
    }
}
