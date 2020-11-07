package com.company;

//Combinatorics Task 1
//
// compute the quantity of 10-digit numbers, which have at least 2 identical digits
//

        public class CombinatoricsOne {
            public static void main(String[] args) {

                //Сompute the total quantity of 10-digit numbers

                long exponent = (long) Math.pow(10,
                        9);
                long totalQuant = 9 * exponent;

                System.out.println("Total quantity of 10-digit numbers = 9*10 to the power of 9 = " + totalQuant);

                /* Compute the quantity of 10-digit numbers, which have different digits
                       factorial 9! to be computed
                */

                int diffQuant = 1;
                int i = 1;
                while (i <= 9) {
                    diffQuant *= i;
                    i++;
                }
                System.out.println("The quantity of 10-digit numbers, which have different digits = 9*9! = " + 9 * diffQuant);

            /* compute the quantity of 10-digit numbers, which have at least 2 identical digits
                to solve the task - from the total quantity of 10-digit numbers we should deduct
                the quantity of 10-digit numbers, which have different digits
             */
                
                long identicQuant = totalQuant - 9 * diffQuant;
                System.out.println("The quantity of 10-digit numbers, which have at least 2 identical digits = " + identicQuant);

            }
}
