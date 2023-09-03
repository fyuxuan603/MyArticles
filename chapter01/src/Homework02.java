import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        /*
		判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，
		其各个位上数字立方和等于其本身。
		例如： 153 = 1*1*1 + 3*3*3 + 5*5*5

		思路分析
		1. int n;
		2. 先得到 n的百位，十位 ，各位的数字, 使用 if 判断他们的立方和是否相等
		3. n的百位 = n / 100
		4. n的十位 = n % 100 / 10
		5. n的各位 = n % 10
		6. 判断即可
		 */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
        int n = myScanner.nextInt();
        if (n < 100 || n > 999 ){
            System.out.println("请输入三位数");
        } else {
            int a = n / 100;
            int b = n % 100 / 10;
            int c = n % 10;
            if (a*a*a+b*b*b+c*c*c == n){
                System.out.println(n + "是水仙花数");
            } else {
                System.out.println(n + "不是水仙花数");
            }

        }
    }
}