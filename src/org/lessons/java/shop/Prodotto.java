package org.lessons.java.shop;

// Import Random
import java.util.Random;

public class Prodotto {

  // Attributes ---------------
  int code;
  String name;
  String description;
  float price;
  float iva;


  // Methods ------------------
  Prodotto(){
    // Create a new random
    Random random = new Random();

    // Assign randomly a productCode
    code = random.nextInt(999);
  }

  Prodotto(String name, String description, float price, float iva){
    // Create a new random
    Random random = new Random();

    // Assign randomly a productCode
    code = random.nextInt(999);

    // Initialize other attributes
    this.name = name;
    this.description = description;
    this.price = price;
    this.iva = iva;
  }

  void getProdotto(){
    System.out.printf("Code: %d \nNome: %s \nDescrizione: %s \nPrezzo: %f \nIVA: %f", code, name, description, price, iva);
  }

  float getPrice(){
    return price;
  }

  String getFormattedPrice(){
    return String.format("%.2f euro", price);
  }

  float getPriceWithIva(){
    return price * (1 + iva / 100);
  }

  String getFormattedPriceWithIva(){
    return String.format("%.2f euro", price * (1 + iva / 100));
  }

  String getName(){
    return code + "-" + name;
  }

}
