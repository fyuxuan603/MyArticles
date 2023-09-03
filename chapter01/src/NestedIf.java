/*参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。
        并且根据性别提示进入男子组或女子组。, 输入成绩和性别，进行判断和输出信息。*/
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        //思路分析
        //1. 创建Scanner对象，接收用户输入
        //2. 接收 成绩保存到 double score
        //3. 使用 if-else 判断 如果初赛成绩大于8.0进入决赛，否则提示淘汰
        //4. 如果进入到 决赛，再接收 char gender, 使用 if-else 输出信息
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩");
        double score = myScanner.nextDouble();
        if (score > 8.0){
            System.out.println("请输入性别");
            char gender = myScanner.next().charAt(0);
            if (gender == '男'){
                System.out.println("进入男子组");
            } else if (gender == '女'){
                System.out.println("进入女子组");
            } else {
                System.out.println("输入性别有误，不能参加决赛~");
            }
        } else {
            System.out.println("sorry，你被淘汰了~");
        }
    }
}