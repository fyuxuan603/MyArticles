public class lingxing {
    public static void main(String[] args) {
        int totalLevel = 5;
        for (int i = 1; i <= totalLevel; i++) {//i表示层数
            //在输出*之前还有空格输出（总层数-当前数）
            for (int k = 1; k <= totalLevel - i; k++) {
                System.out.print(" ");
            }
            //控制打印每层的*个数
            for (int j = 1; j <= 2 * i - 1; j++) {
                //当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else { //其他情况输出空格
                    System.out.print(" ");
                }
            }
            //每打印一行*，就换行
            System.out.println();
        }
        for (int i1 = 1; i1 <= totalLevel - 1; i1++) {
            for (int k1 = 1; k1 <= i1; k1++) {
                System.out.print(" ");
            }
            //控制打印每层的*个数
            for (int j1 = 1; j1 <= 2 *(totalLevel - 1 - i1 ) + 1; j1++) {
                //当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
                if (j1 == 1 || j1 == 2 *(totalLevel - 1 - i1 ) + 1) {
                    System.out.print("*");
                } else { //其他情况输出空格
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
