package ex2;

public class Main {

    public static void numberToString(int num) {
        switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Error");
                break;
    }
    }

    public static void main(String[] args){
    numberToString(0);
    numberToString(1);
    numberToString(2);
    numberToString(3);
    numberToString(4);

    }
}
