public class UcgenHesaplama {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        int c = 5;
        int u =( a + b + c) / 2;
        int alan = (u * (u - a) * u * (u - b) * u * (u - c) ^ 1 / 2);
        System.out.println("a:" +a);
        System.out.println("b:" +b);
        System.out.println("c:" +c);
        System.out.println("alan:" +alan);
    }
}