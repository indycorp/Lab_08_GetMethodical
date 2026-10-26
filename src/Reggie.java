import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNum = SafeInput.getRegExString(in, "Enter UC M number", "^(M|m)\\d{5}$");
        String choice = SafeInput.getRegExString(in, "Menu: Open, Save, View, Quit", "^[OoSsVvQq]$");

        System.out.println("\nSSN: " + ssn);
        System.out.println("M number: " + mNum);
        System.out.println("Choice: " + choice);
    }
}