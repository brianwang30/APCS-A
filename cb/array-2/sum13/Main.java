// https://codingbat.com/prob/p127384

public class Main {
    public static void main(String[] args) {
        System.out.println(sum13(new int[] {1, 2, 2, 1})); // 6
        System.out.println(sum13(new int[] {1, 1})); // 2
        System.out.println(sum13(new int[] {1, 2, 2, 1, 13})); // 6
    }

    /**
     * Return the sum of the numbers in the array, returning 0 for an empty
     * array. Except the number 13 is very unlucky, so it does not count and
     * numbers that come immediately after a 13 also do not count.
     */
    public static int sum13(int[] nums) {
        boolean nextUnlucky = false;
        int sum = 0;

        for (int num : nums) {
            if (num == 13) {
                nextUnlucky = true;
            } else if (nextUnlucky == true) {
                nextUnlucky = false;
            } else {
                sum += num;
            }
        }

        return sum;
    }
}
