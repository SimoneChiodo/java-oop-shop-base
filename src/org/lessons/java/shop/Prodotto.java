package org.lessons.java.shop;

// Import Random
import java.util.Random;

public class Prodotto {

  int code;
  String name;
  String description;
  float price;
  float iva;

  Prodotto(){
    // Create a new random
    Random random = new Random();

    // Assign randomly a productCode
    code = random.nextInt(999);
  }

  float getPrice(){
    return price;
  }

  float getPriceWithIva(){
    return price * (1 + iva / 100);
  }

  String getName(){
    return code + name;
  }

}
