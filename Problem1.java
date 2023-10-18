class MaxMinSum {
    
    static int getMaxMinSum(int[] arr) {

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }

        return max+min;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-2, 1, -4, 5, 3};
        System.out.println(getMaxMinSum(arr));
    }
}