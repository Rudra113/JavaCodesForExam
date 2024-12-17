class Demo {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = b++;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
        int i = (20 > 10) ? 20 : 10;
        System.out.println(i);
        // int j;
        for (int j = 1; j <= 5; j++) {
            System.out.println("" + j);
        }
        System.out.println("" + j);
    }
}