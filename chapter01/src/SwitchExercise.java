import java.util.Scanner;
public class SwitchExercise {
    public static void main(String[] args) {
       /* 使用 switch 把小写类型的char型转为大写(键盘输入)。
       只转换 a->A, b->B, c, d, e. 其它的输出 "other"。*/
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入a-z");
        char c1 = myScanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
        /*对学生成绩大于60分的，输出"合格"。低于60分的，输出"不合格"。
        (注：输入的成绩不能大于100)*/
        //思路分析
        //1. 这道题，可以使用分支来完成， 但是要求使用switch
        //2. 这里我们需要进行一个转换, 编程思路 :
        //   如果成绩在 [60,100] , (int)(成绩/60) = 1
        //   如果成绩在 [0,60) , (int)(成绩/60) = 0
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("请输入分数");
        double score = myScanner2.nextDouble();
        if (score >= 0 && score <= 100) {
            switch ((int) (score / 60)) {
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("及格");
                    break;
                default:
                    System.out.println("输入有误");
            }
        } else {
            System.out.println("输入的成绩在0-100");
        }
        /*根据用于指定月份，
        打印该月份所属的季节。
        3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季 */
        Scanner myScanner3 = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner3.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}