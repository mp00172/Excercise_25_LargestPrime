public class LargestPrime {

    public static boolean isPrimeNumber (int num) {
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int getLargestPrime (int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = (number - 1); i >= 2; i--) {
            if (isPrimeNumber(i) && number % i == 0) {
                return i;
            }
        }
        return -1;
    }
}