public class VarScopeDetail {
    public static void main(String[] args) {
        person1 p1 = new person1();
        /*
		属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。
		局部变量，生命周期较短，伴随着它的代码块的执行而创建，
		伴随着代码块的结束而销毁。即在一次方法调用过程中
		 */
        //当执行say方法时,say方法的局部变量比如name,会创建,
        //当say执行完毕后,name局部变量就销毁,但是属性(全局变量)仍然可以使用.
        //p1.say();
        T1 t1 = new T1();
        t1.test();
        t1.test2(p1);

    }
}
class T1 {

    //全局变量/属性：可以被本类使用，或其他类使用（通过对象调用)
    public void test() {
        person1 p1 = new person1();
        System.out.println(p1.name);//jack
    }

    public void test2(person1 p) {
        System.out.println(p.name);//jack
    }
}
class person1 {
        //细节: 属性可以加修饰符(public protected private..)
        //      局部变量不能加修饰符
        public int age = 20;
        String name = "jack";
        public void say() {
            //细节 属性和局部变量可以重名，访问时遵循就近原则
            //String name = "king";
            System.out.println("say() name=" + name);
        }
    public void hi() {
        String address = "北京";
        //String address = "上海";//错误,重复定义变量
        String name = "fyx";//可以
    }
}

