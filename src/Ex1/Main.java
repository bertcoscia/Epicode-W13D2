package Ex1;

public class Main {

    public static boolean stringaPariDispari(String str) {
        if(str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        boolean result1 = stringaPariDispari("ciao come va");
        System.out.println(result1);
        boolean result2 = annoBisestile(1600);
        System.out.println(result2);
    }
}
