class LinearSearch {

    static int getOccurences(int[] A, int B) {
        int count = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] == B)
                count++;
        }
        return count;
    }

     public static void main(String[] args) {
        int[] A = new int[] {1, 2, 2};
        int B = 2;
        System.out.println(getOccurences(A, B));
     }
}