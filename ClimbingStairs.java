import java.util.Scanner;

class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1, second = 2, result = 0;
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        scanner.close();

        ClimbingStairs solution = new ClimbingStairs();
        System.out.println(solution.climbStairs(n));
    }
}
