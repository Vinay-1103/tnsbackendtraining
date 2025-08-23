package me.vinay.tns.arrays;

//package me.vinay.arrays;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
public class ReverseArray {
//    /*static long[] reversearray(int[] nums, int start, int end) {
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//        return null;
//    }*/
//
//   /* public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        int n = arr.length;
////        System.out.println(Arrays.toString(reversearray(arr,0,n-1)));
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//    }*/
//
//   /* public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
////        int length = arr.length;
//        int large=0;
//        for (int i = 0;i< arr.length;i++){
//            if (large<arr[i]){
//                large=arr[i];
//            }
//        }
//        System.out.println(large);
//    }*/
//
//
//    /*public static void main(String[] args) {
//        int[] arr = {10, 84,20,64, 30, 40, 50};
//        int min=arr[0],max=arr[0];
//        for (int num:arr){
//            if(num>max){
//                max=num;
//            }
//            if (num<min){
//                min=num;
//            }
//        }
//
//        System.out.println("minimum "+min);
//        System.out.println("maximum "+max);
//
//    }*/
//
////    duplicates
    public static void main(String[] args) {
        int[] arr = {10, 91, 54, 20, 30, 20, 54, 40, 50, 50,50};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int i, j, temp;
//        for (i = 0; i < arr.length; i++) {
//            for (j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        int last=arr.length;
//        if (arr[last]==arr[last-1]){
//            last--;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(last);
//        System.out.println(arr[last-2]);
//
        /*int count =1;
        int i;
        for (i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[i+1]) {
                    count++;
                    System.out.println(arr[i] + " ");
                }
        }
        if(count>=1){
            System.out.println(arr[i]);
        }*/
//
//    }
        /*public static void main(String[] args) {
            int[] arr = {10, 91, 54, 20, 30, 20, 54, 40, 91,50};

            Arrays.sort(arr); // sort ascending
            System.out.println("Sorted array: " + Arrays.toString(arr));

            int n = arr.length;
            int largest = arr[n-1];  // last element
            int secondLargest = -1;

            // loop from second last element backward to skip duplicates
            for (int i = n-2; i >= 0; i--) {
                if (arr[i] != largest) {
                    secondLargest = arr[i];
                    break;
                }
            }

            if (secondLargest == -1) {
                System.out.println("No second largest element (all elements same).");
            } else {
                System.out.println("Second largest element: " + secondLargest);
            }
        }*/

//                int[] arr = {10, 20, 30, 20, 40, 10, 50, 10, 30};

                boolean[] visited = new boolean[arr.length]; // to mark checked elements

                System.out.println("Duplicate elements are:");
                for (int i = 0; i < arr.length; i++) {
                    if (visited[i]) continue;  // skip if already checked

                    int count = 1;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            visited[j] = true;  // mark as duplicate
                            count++;
                        }
                    }
                    if (count > 1) {
                        System.out.println(arr[i] + " → " + count + " times");
                    }
                }
            }
        }



//

//
//
//
