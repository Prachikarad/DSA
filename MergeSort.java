import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int index = left; index <= right; index++) {
            arr[index] = temp[index];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
