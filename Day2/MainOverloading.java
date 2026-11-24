class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class MainOverloading {
    public static void main(String[] args) {
        Calculator Cal = new Calculator();
        Cal.add(1, 2);
    }
}