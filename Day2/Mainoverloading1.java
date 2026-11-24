class printer {
    void print(String text) {
        System.out.println("Text:" + text);

    }

    void print(int number) {
        System.out.println("Integer:" + number);

    }

    void print(double decimal) {
        System.out.println("Decimal:" + decimal);

    }

}

class MainOverloading1 {
    public static void main(String[] args) {
        printer p = new printer();
        p.print("Sai");
        p.print(4.7);
        p.print(67);
    }

}