import java.util.Arrays;

class ProdArray {

    static int[] getProdArray(int[] A) {
        int prod = 1;
        for(int i=0; i<A.length; i++)
            prod *= A[i];

        for(int i=0; i<A.length; i++) 
            A[i] = prod/A[i];

        return A;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(getProdArray(A)));
    }
}