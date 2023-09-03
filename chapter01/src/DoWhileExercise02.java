import java.util.Scanner;
public class DoWhileExercise02 {
    public static void main(String[] args) {
        //如果李三不还钱，则老马将一直使出五连鞭，直到李三说还钱为止
        //[System.out.println("老马问：还钱吗？y/n")]
        //化繁为简
        //(1) 不停的问还钱吗?
        //(2) 使用char answer 接收回答, 定义一个Scanner对象
        //(3) 在do-while 的while 判断如果是 y 就不在循环
        Scanner myscanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("老马使出五连鞭~");
            System.out.println("老马问：还钱吗？y/n");
            answer = myscanner.next().charAt(0);
            System.out.println("他的回答是" + answer);
        }while(answer != 'y');
        System.out.println("李三还钱了");
    }
}