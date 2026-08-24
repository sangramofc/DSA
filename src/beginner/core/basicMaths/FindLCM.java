package beginner.core.basicMaths;

public class FindLCM {
    public static int getHCF(int a, int b) {
        if (a == 0) return b;
        return getHCF(b % a, a); // Euclid Algorithm
    }
    public static int getLCM(int a,int b){
        return (a / getHCF(a,b)) * b ; // avoiding int overflow
    }
    static void main() {
        System.out.println(getLCM(2,8));
    }
}
