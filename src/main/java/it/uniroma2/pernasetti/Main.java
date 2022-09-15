package it.uniroma2.pernasetti;

public class Main {

    public static void main(String[] args) {

        int number = 0;
        if (args.length == 1) {
            try
            {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex)
            {
                System.exit(1);
            }
        }
        if (number%2 != 0) System.exit(2);
    }
}