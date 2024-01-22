package org.masteukodeu.scenarios;

public class Price {


    public static void main(String[] args) {
        int[] seller = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] buyer = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int price = 1;

        for (int i = 0; i < 10; i++) {
            int amountProduced = seller[price - 1];
            int amountRequired = buyer[price - 1];


            System.out.println("price = " + price);
            System.out.println("amountProduced = " + amountProduced);
            System.out.println("amountRequired = " + amountRequired);

            int missingProducts = amountRequired - amountProduced;

            if (missingProducts > 0) {
                price++;
            }
            if (missingProducts < 0) {
                price--;
            }

            System.out.println("missing: " + missingProducts);
            System.out.println("new price = " + price);
            System.out.println();
        }


    }
}
