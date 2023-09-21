package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import Entities.Product;
import Entities.ImportedProduct;
import Entities.UsedProduct;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        char type;
        List<Product> list = new ArrayList<>();

        System.out.println("Digite o número de produtos");
        n = sc.nextInt();
        sc.nextLine(); // Consume newline left by previous nextInt()

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do Produto #" + (i + 1) + ":");
            System.out.println("Qual o tipo do produto? Comum, usado ou importado? digite (c/u/i):");
            type = sc.next().charAt(0);
            sc.nextLine(); // Consume newline left by previous next()
            System.out.println("Nome do produto:");
            String name = sc.nextLine();
            System.out.println("Preço do produto:");
            Double price = sc.nextDouble();

            if (type == 'c') {
                Product produto = new Product(name, price);
                list.add(produto);
            } else if (type == 'i') {
                System.out.println("Imposto:");
                Double customFee = sc.nextDouble();
                Product produto = new ImportedProduct(name, price, customFee);
                list.add(produto);
            } else if (type == 'u') {
                System.out.println("Data de fabricacao (dd/MM/yyyy):");
                String dataString = sc.next(); // Ler a data corretamente
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date manufactureDate = dateFormat.parse(dataString);
                Product produto = new UsedProduct(name, price, manufactureDate);
                list.add(produto);
            }
        }

        System.out.println("\nEtiquetas de Preço:");
        for (Product produto : list) {
            produto.priceTag();
            System.out.println("-----------------------------------------------");
        }

        sc.close();
    }
}
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


