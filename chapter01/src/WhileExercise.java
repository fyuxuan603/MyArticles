public class WhileExercise {
    public static void main(String[] args) {
        // 打印1—100之间所有能被3整除的数
        // 化繁为简, 先死后活
        int i = 1;
        int endNum = 100;
        while (i <= endNum) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("=================================");
        // 打印40—200之间所有的偶数
        // 化繁为简, 先死后活
        int j = 40;
        int end = 200;
        int k = 2;
        while (j <= end){
            if (j % k == 0){
                System.out.println(j);
            }
            j++;
        }
    }
}