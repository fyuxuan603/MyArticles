public class Homework05 {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(3);
        System.out.println("面积=" + circle.area());
        System.out.println("周长=" + circle.len());

    }
}
//定义一个圆类Circle, 定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
class Circle1{
    double radius;
    public Circle1(double radius) {
        this.radius = radius;
    }
    public double len(){
        return 2 * Math.PI * radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}