class PrefixSum {

    public static Integer[] sum(Integer[] orgArr) {
        Integer[] finalArr = new Integer[orgArr.length];
        Integer sum = 0;

        PrefixSum.printArray(orgArr);

        for(int i =0; i < orgArr.length; i++) {
            finalArr[i] = sum + orgArr[i];
            sum +=orgArr[i];
        }

        return finalArr;
    }

    public static void printArray(Integer[] arr) {
        for (int i = 0 ; i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static Integer ltor(int l, int  r, Integer[] sum) {
        Integer total = sum[r] - sum[l-1];
        return total;
    }
}

Integer[] orgArr = new Integer[]{3,2,1,5,4};
Integer[] sum = PrefixSum.sum(orgArr);
Integer total = PrefixSum.ltor(1,3,sum);
    sum;
    total;







