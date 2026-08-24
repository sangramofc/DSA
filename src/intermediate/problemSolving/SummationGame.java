package intermediate.problemSolving;

public class SummationGame {

    static  int getSum(int n){
        return n * (n + 1) / 2;
    }

    static void main() {
        System.out.println(getSum(10));
    }
}
