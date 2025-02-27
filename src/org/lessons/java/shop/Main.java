package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
      // // Create a new istance
      // Prodotto product = new Prodotto();

      // // Print the results
      // System.err.println("Il prezzo del prodotto e': " + product.getPrice());
      // System.err.println("Il prezzo del prodotto + IVA e': " + product.getPriceWithIva());
      // System.err.println("Il nome del prodotto e': " + product.getName());

      
      // Create a new istance
      Prodotto product = new Prodotto("Shampoo", "Just a normal shampoo", 4.99f, 22);

      // Print the results
      System.err.println("Il prezzo del prodotto e': " + product.getFormattedPrice());
      System.err.println("Il prezzo del prodotto + IVA e': " + product.getFormattedPriceWithIva());
      System.err.println("Il nome del prodotto e': " + product.getName());
    }
}
