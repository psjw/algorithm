package pccp.ch02;

import java.util.Arrays;

public class ArrayMainV0 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        arr[0] = 1;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        arr[arr.length - 1] = 5;
        System.out.println(Arrays.toString(arr));

        String[] strs = new String[5];
        System.out.println(Arrays.toString(strs));
        boolean[] bools = new boolean[5];
        System.out.println(Arrays.toString(bools));

    }
}
