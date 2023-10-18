class Leaders {

    static void printLeaders(int[] A) {
        int rightMax = A[A.length-1];
        System.out.print(rightMax+" ");

        for(int i=A.length-2; i>=0; i--) {
            if(rightMax <= A[i]) {
                rightMax = A[i];
                System.out.print(rightMax+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[] {16, 17, 4, 3, 5, 2};
        printLeaders(A);
    }
}