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
                long total_quant = 9 * exponent;

                System.out.println("Total quantity of 10-digit numbers = 9*10 to the power of 9 = " + total_quant);

                /* Compute the quantity of 10-digit numbers, which have different digits
                       factorial 9! to be computed
                */

                int diff_quant = 1;
                int i = 1;
                while (i <= 9) {
                    diff_quant *= i;
                    i++;
                }
                System.out.println("The quantity of 10-digit numbers, which have different digits = 9*9! = " + 9 * diff_quant);

            /* compute the quantity of 10-digit numbers, which have at least 2 identical digits
                to solve the task - from the total quantity of 10-digit numbers we should deduct
                the quantity of 10-digit numbers, which have different digits
             */
                
                long identic_quant = total_quant - 9 * diff_quant;
                System.out.println("The quantity of 10-digit numbers, which have at least 2 identical digits = " + identic_quant);

            }
}
