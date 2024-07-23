package Ex1;

public class Main {

    public static boolean stringaPariDispari(String str) {
        if(str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        boolean result1 = stringaPariDispari("ciao come va");
        System.out.println(result1);
    }
}
