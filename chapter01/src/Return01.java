public class Return01 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3) {
                System.out.println("111"+i);
                return; //当return用在方法时，表示跳出方法，如果使用在main,表示退出程序
                //用return结果为：Hello World! Hello World! 111
                //用break结果为：Hello World! Hello World! 111 go on...
                //用continue结果为：Hello World! Hello World! 111 Hello World! Hello World! go on...
            }
            System.out.println("Hello World!");
        }
        System.out.println("go on..");
    }
}