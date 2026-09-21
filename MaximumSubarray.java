public class MaximumSubarray {

    public static int maxSubarraySum(int[] numbers) {
        int bestEndingHere = numbers[0];
        int bestOverall = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            bestEndingHere = Math.max(numbers[i], bestEndingHere + numbers[i]);
            bestOverall = Math.max(bestOverall, bestEndingHere);
        }

        return bestOverall;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubarraySum(numbers));
    }
}