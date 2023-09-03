public class MulForExercise02 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1 ; i <= 9 ; i++){
            for (j = 1  ; j <= i ; j++){
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();//换行
        }
    }
}