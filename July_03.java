package Geeks4Geeks;

public class July_03 {
    public static void main(String[] args) {
        int[] arr = {34,8,10,3,2,80,30,33,1};
        System.out.println(maxindex(arr));
    }

    private static int maxindex(int[] arr) {
        int max = -1 , min = -1 , maxsum=0;
        for (int i = 0;i< arr.length;i++){

            for (int j = i ; j <arr.length;j++){
                if (arr[i]<=arr[j]){
                    maxsum = Math.max(maxsum , j - i);
                }
            }
        }
        return maxsum;
    }
}
