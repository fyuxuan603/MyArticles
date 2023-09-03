public class VarParameterExercise {
    public static void main(String[] args) {
        fMethod fm = new fMethod();
        System.out.println(fm.showScore("milan",90,80.0));
        System.out.println(fm.showScore("terry" , 90.1, 80.0,10,30.5,70 ));

    }
}
class fMethod{
    /*
	有三个方法，分别实现返回姓名和两门课成绩(总分)，
	返回姓名和三门课成绩(总分)，返回姓名和五门课成绩（总分）。
	封装成一个可变参数的方法
	 */

    //分析1. 方法名 showScore  2. 形参(String ,double... ) 3. 返回String
    public String showScore(String name, double...scores){
        double totalScore = 0.0;
        for (int i = 0; i < scores.length; i++){
            totalScore += scores[i];
        }
        return name + " 有 " +scores.length + "门课的成绩总分为=" + totalScore;
    }
}