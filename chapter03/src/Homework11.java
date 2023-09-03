public class Homework11 {
    public static void main(String[] args) {

    }
}
/*
创建一个Employee类，
属性有(名字，性别，年龄，职位，薪水)， 提供3个构造方法，可以初始化
(1) (名字，性别，年龄，职位，薪水),
(2) (名字，性别，年龄) (3) (职位，薪水), 要求充分复用构造器
 */
class Employee{
    String name;
    char gender;
    int age;
    String job;
    double sal;
    //因为要求可以复用构造器，因此先写属性少的构造器
    //职位，薪水
    public Employee(String job, double sal){
        this.job = job;
        this.sal = sal;
    }
    //名字，性别，年龄
    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //名字，性别，年龄，职位，薪水
    public Employee(String job, double sal, String name, char gender, int age) {
        this(name, gender, age);//使用到 前面的 构造器
        this.job = job;
        this.sal = sal;
        //this(job,sal);//错误，因为在构造器中访问另外一个构造器, 必须放在第一条语句
    }

}