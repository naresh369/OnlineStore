
public class Test {

		
		public static void main(String[] args) {
			
			Order order = new Order(4678, 4566, 3);
					 
			OrderService s = new OrderService();
			
			s.processOrder(order);
				}

		
	}


