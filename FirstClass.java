public class FirstClass<res> {
    public static void main(String[] args) {

        //exponentiation
        int number1 = 9;
        long exp10pow9 = (long) Math.pow(10,
                9);
        long Quantity10DigitNumbers = 9 * exp10pow9;

        System.out.println("The quantity of 10-digit numbers = 9*10 to the power of 9 = " + Quantity10DigitNumbers);

        //calculation of the factorial of number 9

        int factorial9 = 1;
        int i = 1;
        while (i <= 9) {
            factorial9 *= i;
            i++;
        }
        System.out.println("The quantity of 10-digit numbers, which have different numerals = 9*9! = " + 9 * factorial9);

        //calculation of the quantity of 10-digit numbers, which have at least 2 identical numerals
        long Quantity10DigitNumber2ident = Quantity10DigitNumbers - 9 * factorial9;
        System.out.println("The quantity of 10-digit numbers, which have at least 2 identical numerals = " + Quantity10DigitNumber2ident);

    }

}