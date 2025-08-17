package mathPrograms;

public class LCM {
    public static void main(String[] args) {
        int a = 36, b = 60;

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("LCM is: " + lcm);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
