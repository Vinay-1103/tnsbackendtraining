package me.vinay.tns.arrays;

public class SortingArray {
        public static void main(String[] args) {
            int[] arr = {10, 91, 54, 20, 30, 20, 54, 40, 50};
            int n = arr.length;

            // Bubble Sort
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            // Print sorted array
            System.out.print("Sorted Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


