import java.util.Scanner;
public class Ticket {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner.nextInt();
        if (month >=1 && month <= 12){
            if(month >= 4 && month <= 10) {
                System.out.println("请输入年龄");
                int age = myScanner.nextInt();
                if (age > 0) {
                    if (age < 18) {
                        System.out.println("￥30");
                    } else if (age >= 18 && age <= 60) {
                        System.out.println("￥60");
                    } else {
                        System.out.println("￥20");
                    }
                } else {
                    System.out.println("请输入正确的年龄");
                }
            } else {
                System.out.println("请输入年龄");
                int age = myScanner.nextInt();
                if (age >= 18 && age <= 60){
                    System.out.println("￥40");
                } else {
                    System.out.println("￥20");
                }
            }
        } else {
            System.out.println("月份错误，请输入1-12");
        }
    }
}