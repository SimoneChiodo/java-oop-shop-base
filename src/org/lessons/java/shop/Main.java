package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
      // // Create a new istance
      // Prodotto product = new Prodotto();

      // // Print the results
      // System.out.println("\nIl prezzo del prodotto e': " + product.getFormattedPrice());
      // System.out.println("Il prezzo del prodotto + IVA e': " + product.getPriceWithIva());
      // System.out.println("Il nome del prodotto e': " + product.getName());

      
      // Create a new istance
      Prodotto product = new Prodotto("Shampoo", "Just a normal shampoo", 4.99f, 22);

      // Print the results
      System.out.println("\nIl prezzo del prodotto e': " + product.getFormattedPrice());
      System.out.println("Il prezzo del prodotto + IVA e': " + product.getFormattedPriceWithIva());
      System.out.println("Il nome del prodotto e': " + product.getName());
      System.out.println("---------");
      product.getProdotto();
    }
}
