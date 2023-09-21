package Entities;

public class Product {
    private String name;
    private Double price;
 
 //getters e setters   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
//contrutores
    
    public Product() {

    }

    public Product(String name, Double price) {
        super();
        this.name = name;
        this.price = price;
    }

 //métodos

    public void priceTag() {
        System.out.println("Tipo: Comum");
        System.out.println("Nome: " + name);
        System.out.println("Valor: R$ " + price);
    }
}
