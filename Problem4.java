class TimeEquality {

    static int getTotTime(int[] A) {

        int max = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++) {
            if(max < A[i])
                max = A[i];
        }

        int totTime = 0;
        for(int i=0; i<A.length; i++) 
            totTime += (max-A[i]);
            
        return totTime;
    }

    public static void main(String[] args) {
        int[] A = new int[] {2, 4, 1, 3, 2};
        System.out.println(getTotTime(A));
    }
}