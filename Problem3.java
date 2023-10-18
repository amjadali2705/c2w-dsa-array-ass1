import java.util.Arrays;

class RangeSumQuery {

    static int[] getSum(int[] A, int[][] B) {
        int[] psArray = new int[A.length];
        psArray[0] = A[0];
        for(int i=1; i<A.length; i++) 
            psArray[i] = psArray[i-1] + A[i];

        int[] sum = new int[B.length];
        for(int q=0; q<B.length; q++) {
            int l = B[q][0];
            int r = B[q][1];

            if(l == 0)
                sum[q] = psArray[r];
            else
                sum[q] = psArray[r] - psArray[l-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 3, 4, 5};
        int[][] B = new int[][] {{0, 3}, {1, 2}};
        System.out.println(Arrays.toString(getSum(A, B)));
    }
}