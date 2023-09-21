package Entities;

public class ImportedProduct extends Product{
	private Double customsFee;
	
//getters e setters	
	public Double getCustomsFee() {
		return customsFee;
	}



	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
//métodos
	
	
	@Override
	public void priceTag() {
		System.out.println("Tipo: Importado");
		System.out.println("Nome: "+ getName());
		System.out.println("Valor: R$" + getPrice());
		System.out.println("Imposto: R$" + getCustomsFee());
		total();
	}
	
	public void total() {
		Double a = getPrice();
		Double b = getCustomsFee();
		Double res = a+b;
		System.out.println("Valor total: R$" + res);
	}
	
	//Contrutores

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	
}
