package ch.gibb.algorithmen.ab411_05_collections;

public class HasPairWithSum {

    public static void main(String[] args) {
        // input
        int[] data = {1,2,4,4}; int sum = 8;
        boolean hasPair = hasPairWithSum(data, sum);
        System.out.println(hasPair);
    }

    /**
     * @param arr
     * @param sum
     * @return true if sum of two values equals given sum, else false
     */
    public static boolean hasPairWithSum(int[] arr, int sum) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int s = arr[start] + arr[end];
            if(s == sum) return true;
            if(s < sum) start++;
            else end--;
        }
        return false;
    }
}
