public class TeenNumberChecker {
    public static boolean hasTeen  (int n1, int n2, int n3){
        if ((n1 >= 13 && n1 <= 19) || (n2 >= 13 && n2 <= 19) || (n3 >= 13 && n3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int number) {
        if (number >= 13 && number <=19) {
            return true;
        } else {
            return false;
        }
    }
}
