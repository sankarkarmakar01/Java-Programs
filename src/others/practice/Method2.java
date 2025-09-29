package others.practice;

public class Method2 {
    public int Add(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        Method2 m = new Method2();
        int ans = m.Add(20,5);
        System.out.println(ans);
    }
}