package org.lessons.java.shop;

// Import Random
import java.util.Random;

// NOTE: 
// - BigDecimal type is better for currency variables

public class Prodotto {

  // Attributes ---------------
  private int code;
  private String name = "empty";
  private String description = "empty";
  private float price;
  private float iva;


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

  // Getter & Setter
  int getCode(){
    return code;
  }

  void setCode(int code){
    if(code >= 0)
      this.code = code;
  }
  
  String getName(){
    return name;
  }

  void setName(String name){
    this.name = name;
  }
  
  String getDescription(){
    return description;
  }

  void setDescription(String description){
    this.description = description;
  }
  
  float getPrice(){
    return price;
  }

  void setPrice(float price){
    if(price >= 0)
      this.price = price;
  }
  
  float getIva(){
    return iva;
  }

  void setIva(float iva){
    if(iva >= 0)
      this.iva = iva;
  }

  // Formatted Getter
  void getProdotto(){
    System.out.printf("Code: %d \nNome: %s \nDescrizione: %s \nPrezzo: %f \nIVA: %f", code, name, description, price, iva);
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

  String getFormattedName(){
    return code + "-" + name;
  }

}
