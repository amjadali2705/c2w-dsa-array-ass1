import java.util.Arrays;

class PrefixSum {

    static int[] getPrefixSum(int[] A) {
        for(int i=1; i<A.length; i++) 
            A[i] = A[i-1] + A[i];

        return A;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(getPrefixSum(A)));
    }
}