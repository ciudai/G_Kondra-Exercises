
public class PD2_3{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        System.out.println("a\t\ta^2\t\ta^3\t\ta^4");
        System.out.println("----------------------------------------");

        for (int number : numbers) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n",
                    number,
                    (int) Math.pow(number, 2),
                    (int) Math.pow(number, 3),
                    (int) Math.pow(number, 4)
            );
        }
    }
}