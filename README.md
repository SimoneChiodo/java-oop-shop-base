# Esercizio Java OOP: Classe Prodotto

## Descrizione

Nel progetto `java-oop-shop`, all’interno del package `org.lessons.java.shop`, si deve creare una classe chiamata **Prodotto** per gestire i prodotti di uno shop.

### Caratteristiche della classe Prodotto

- **Attributi:**
  - `codice` (numero intero, generato casualmente all'istanza, accessibile solo in lettura)
  - `nome` (leggibile e modificabile)
  - `descrizione` (leggibile e modificabile)
  - `prezzo` (leggibile e modificabile)
  - `iva` (leggibile e modificabile)

- **Costruttori:**
  - Devono esserci almeno due costruttori diversi (ad esempio uno con tutti i parametri e uno con solo alcuni)

- **Metodi:**
  - Metodo per ottenere il prezzo base (senza IVA)
  - Metodo per ottenere il prezzo comprensivo di IVA
  - Metodo per ottenere il nome esteso, ovvero concatenazione di `codice` e `nome`

- **Accesso:**
  - `codice` è solo in lettura (getter senza setter)
  - Gli altri attributi hanno getter e setter

### Classe Main

- Nel package stesso, creare una classe **Main** con il metodo `main` dove si crea almeno un oggetto Prodotto e si testano tutti i metodi sopra descritti.

---

Questo esercizio mette in pratica i concetti di incapsulamento, costruttori multipli, e metodi di utilità in Java orientato agli oggetti.
