public class Homework07 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2("tom","黄色",2);
        dog2.show();

    }
}
//设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。
// 并创建对象，进行测试
class Dog2{
    String name;
    String color;
    int age;
    public Dog2(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println("=====信息=====");
        System.out.println(this.name + "\t" +this.color + "\t" + this.age + "\t");
    }
}