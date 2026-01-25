public class Swapno {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside method: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b);
        System.out.println("Outside method: a = " + a + ", b = " + b);
    }
}