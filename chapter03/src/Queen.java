public class Queen {
    public static void main(String[] args) {
        Q q = new Q();
        q.put(0);
        System.out.println("解法：" + q.count);
    }
}
class Q{
    int max = 8;//一共有max个皇后
    int[] arr = new  int[max];//数组arr用来保存皇后位置
    int count = 0;//统计解法个数

    public void print(){
        count++;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=================");
    }

    public boolean judge(int n){
        for (int i = 0; i < n; i++){
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])){
                return false;//在同一列或者同一斜线上时返回false
            }
        }
        return true;
    }
    public void put(int n){//放置皇后
        if (n == max){
            print();
            return;
        }
        //依次放入皇后并判断
        for (int i = 0; i < max ; i++){
            //先把当前皇后放到该行的第一列
            arr[n] = i;
            //判断放置第n个皇后到第i列时是否冲突
            if (judge(n)){
                put(n + 1);
            }
        }
    }
}

