package inheritance;
public class multiply {
    int multiply(int a, int b) {
        return  a * b;
    }
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
class main{
    public static void main(String[] args) {
        multiply obj = new multiply();
        System.out.println (obj.multiply (7,2));
        System.out.println(obj.multiply(1,2,9));
    }
}