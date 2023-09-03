public class BubbleSort {
    public static void main(String[] args) {
        /*
			数组 [24,69,80,57,13]
			第1轮排序: 目标把最大数放在最后
			第1次比较[24,69,80,57,13]
			第2次比较[24,69,80,57,13]
			第3次比较[24,69,57,80,13]
			第4次比较[24,69,57,13,80]
		 */
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("\n==第" + (i + 1) + "轮==");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }
    }
}
