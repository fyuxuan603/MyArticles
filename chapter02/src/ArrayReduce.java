import java.util.Scanner;
public class ArrayReduce {
    public static void main(String[] args) {
        /*有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，
        提示用户是否继续缩减，每次缩减最后那个元素。当只剩下最后一个元素，
        提示，不能再缩减。*/
        //初始化数组
        int[] arr = {1,2,3,4,5};
        Scanner myscanner = new Scanner(System.in);
        do {
            int[] arrNew = new int[arr.length - 1];
            //遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
            for(int i = 0; i < arr.length - 1; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            if(arr.length == 1) {
                System.out.println("已经是最后一位，无法继续缩减");
                break;
            }
            System.out.println("是否继续缩减 y/n");
            char key = myscanner.next().charAt(0);
            if ( key == 'n'){
                break;
            }
        }while (true);
        System.out.println("退出了缩减。。");
    }
}
