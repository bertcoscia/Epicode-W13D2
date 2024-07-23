package ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void ex() {
        String string= "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type a string");
            String inputDo = scanner.nextLine();
            string = inputDo;
            String[] arr = inputDo.split("");
            String result = String.join(",", arr);
            System.out.println(result);
        } while (!string.equals(":q"));
    }

    public static void main(String[] args){
    ex();
    }
}
