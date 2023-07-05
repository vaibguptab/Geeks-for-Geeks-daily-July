package Geeks4Geeks;

import java.util.ArrayList;

public class July_04 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 , 4};
        System.out.println(countsubarray(arr , arr.length ,10 ));
    }

    static int countsubarray(int array[], int n, int k)
    {
        int count = 0;
        int i, j, mul;
        for (i = 0; i < n; i++) {
            if (array[i] < k)
                count++;

            mul = array[i];

            for (j = i + 1; j < n; j++) {
                mul = mul * array[j];
                if (mul < k)
                    count++;
                else
                    break;
            }
        }

        return count;
    }

}
