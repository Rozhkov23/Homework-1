public class Task2 {
    public static void main(String[] args) {
        System.out.println("задание 2");
        int n = 123;
        int x = n / 100; // 8 сотни
        int y = n % 10;  // 2 десятые
        int z = n / 10;  // 12
        int zS = z % 10;  // 2
        int r = x + y + zS; //6
        System.out.println(r);

    }
}
