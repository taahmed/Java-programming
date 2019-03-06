package ch08;

	public class MainProduct {

		public static void main(String[] args) {

		GenericProducts myProduct1 = new GenericProducts("Tea",4.00,"Green Tea with coffee", 1);

		GenericProducts myProduct2 = new GenericProducts("Cofee",6.00,"Black American with milk ", 2);


		System.out.println("Product Name: " + myProduct1.getProduct() + "\nPrice: " + myProduct1.getPriceFormatted() +
		"\nDescription: " + myProduct1.getDescription() + "\nCount Number: " + myProduct1.getProductCount());

		System.out.println();
		System.out.println("Product Name: " + myProduct2.getProduct() + "\nPrice: " + myProduct2.getPriceFormatted() +
		"\nDescription: " + myProduct2.getDescription() + "\nCount Number: " + myProduct2.getProductCount());

		myProduct1.toString();
		myProduct2.toString();
		}
		}

		