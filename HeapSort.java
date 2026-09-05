import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] numbers) {
        for (int root = numbers.length / 2 - 1; root >= 0; root--) {
            siftDown(numbers, root, numbers.length);
        }

        for (int end = numbers.length - 1; end > 0; end--) {
            swap(numbers, 0, end);
            siftDown(numbers, 0, end);
        }
    }

    private static void siftDown(int[] numbers, int root, int size) {
        while (2 * root + 1 < size) {
            int child = 2 * root + 1;
            int largerChild = child;

            if (child + 1 < size && numbers[child + 1] > numbers[child]) {
                largerChild = child + 1;
            }

            if (numbers[root] >= numbers[largerChild]) {
                return;
            }

            swap(numbers, root, largerChild);
            root = largerChild;
        }
    }

    private static void swap(int[] numbers, int first, int second) {
        int temporary = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temporary;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6, 7};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
