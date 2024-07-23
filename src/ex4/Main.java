package ex4;

import java.util.Scanner;

public class Main {

public static void countdown() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insert a number");
    int input = Integer.parseInt(scanner.nextLine());
    for(int i = input; i >  0; i--) {
        input--;
        System.out.println(input);
    }
}

    public static void main(String[] args){
    countdown();
    }
}
