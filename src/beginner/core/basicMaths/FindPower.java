package beginner.core.basicMaths;

public class FindPower {
    public static int findPower(int n,int m){
        int p = n;
        for (int i = 1; i < m; i++) {
            n = n * p;
        }
        return n;
    }

    public static void main() {
        System.out.println(findPower(2,3));
    }
}
