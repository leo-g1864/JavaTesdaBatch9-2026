public class Task8 {

    public static int sumOfSums(int... numbers) {
        int cumulativeSum = 0;

        for (int number : numbers) {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            cumulativeSum += sum;

            System.out.println("Parameter " + number + ": sum = " + sum
                    + ", cumulative sum = " + cumulativeSum);
        }

        return cumulativeSum;
    }

    public static void main(String[] args) {
        int total = sumOfSums(4, 5, 10);

        System.out.println("Total sum: " + total);
    }
}