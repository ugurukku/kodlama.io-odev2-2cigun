package product;

public class ClassesWithAttributes {

	
	public static void main(String[] args) {
		Product product= new Product(1,"Laptop", "Asus Laptop",5000,100);
		
		
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop"); ;
//		product.setPrice(5000);;
//		product.setStockAmount(100);;

		ProductManager manager = new ProductManager();
		manager.add(product);
		System.out.println(product.getKod());
	}

}
