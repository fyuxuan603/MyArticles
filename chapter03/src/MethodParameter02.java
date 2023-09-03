public class MethodParameter02 {
    public static void main(String[] args) {
        C c = new C();
        int[] arr = {1, 2, 3};
        c.test100(arr);
        System.out.println(" main的 arr数组 ");
        //遍历数组
        for(int i = 0; i < arr.length; i++) {
         	System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //测试
        person2 p = new person2();
        p.name = "jack";
        p.age = 10;
        c.test200(p);
        //测试题, 如果 test200 执行的是 p = null ,下面的结果是 10
        //测试题, 如果 test200 执行的是 p = new Person();..., 下面输出的是10
        System.out.println("main 的p.age=" + p.age);
    }
}
class person2 {
    String name;
    int age;
}
class C {
    public void test200(person2 p) {
        p.age = 10000; //修改对象属性
        //思考
        p = new person2();
        p.name = "tom";
        p.age = 99;
        //思考
        //p = null;
    }

    //C类中编写一个方法test100，
    //可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化
    public void test100(int[] arr) {
        arr[0] = 200;//修改元素
        //遍历数组
        System.out.println(" test100的 arr数组 ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}