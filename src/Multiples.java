public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i < 1000) {

            if (doFizzBuzz(i)) {// Find out which numbers divide i.
                count += 1;
            }
            i++;
        }
        System.out.println(count);
    }

    public static boolean doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        // Print our appropriate result.
        return divisibleBy3 || divisibleBy5;
    }
}
