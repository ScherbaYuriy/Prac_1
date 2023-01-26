
public class Main {
    public int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.getFactorial(5));
    }
}
