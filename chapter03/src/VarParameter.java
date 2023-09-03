public class VarParameter {
    public static void main(String[] args) {
        fyxMethod m =new fyxMethod();
        System.out.println(m.sum(1, 5, 100)); //106
        System.out.println(m.sum(1,19)); //20
    }
}
class fyxMethod{
    //1. int... 表示接受的是可变参数，类型是int ,即可以接收多个int(0-多)
    //2. 使用可变参数时，可以当做数组来使用 即 nums 可以当做数组
    //3. 遍历 nums 求和即可
    public int sum(int... nums) {
        //System.out.println("接收的参数个数=" + nums.length);
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}