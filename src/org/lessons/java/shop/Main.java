package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
      Prodotto product = new Prodotto();

      System.err.println("Il prezzo del prodotto e': " + product.getPrice());
      System.err.println("Il prezzo del prodotto + IVA e': " + product.getPriceWithIva());
      System.err.println("Il nome del prodotto e': " + product.getName());
    }
}
