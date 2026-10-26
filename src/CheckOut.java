import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        boolean more = false;
        do
        {
            double price = SafeInput.getRangedDouble(in, "Enter item price", 0.50, 10.00);
            total += price;
            more = SafeInput.getYNConfirm(in, "Another item?");
        } while (more);

        System.out.printf("\nTotal cost: $%.2f\n", total);
    }
}