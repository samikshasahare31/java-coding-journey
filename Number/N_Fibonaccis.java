
class N_Fibonaccis {

    public static void main(String[] args) {
        int num = 15;
        int a = 0, b = 1;
        int c;
        System.out.print(a + " , " + b + " , ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " , ");
        }

    }
}
