package green_kart_page;

public class Vegetable {

		private String name;
		private double price;
		private int quantity;
		
		
		public Vegetable(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setPrice(double p) {
			this.price = p;
		}
		
		public void setQuantity(int q) {
			this.quantity = q;
		}
		
		public String getName() {
			return this.name;
		}
		
		public double getPrice() {
			return this.price;
		}
		
		public int getQuantity() {
			return this.quantity;
		}
}
