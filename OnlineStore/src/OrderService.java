

	public class OrderService {
		
		ProductDBStore productDBStore = new ProductDBStore();
		Product product;
		
		public void processOrder(Order order) {
			
			int pid;
			int orderQ;
		    int updatedQ;
			pid = order.getProductId();
			System.out.println("pid is:"+pid);
			
			orderQ = order.getQuantity();
			System.out.println("Quantity ordered is:"+orderQ);
			
			for(int i=0;i<productDBStore.A.length;i++) {
				
				Product product= productDBStore.A[i];
				
				if(product.getId()==pid) {
					if(orderQ<=product.getQuantity()) {
						System.out.println("productname:"+product.getName()+"   \n"+
						                   "product-Id:"+product.getId()+"      \n"+
						                   "Price:"+product.getPrice()+"        \n"+
						                   "Quantity:"+order.getQuantity());
						
						System.out.println("Order is processed");

						updatedQ=product.getQuantity()-order.getQuantity();    // 50-3=47
						System.out.println("updated Quantity:"+updatedQ); 
											
					}else
						System.err.println("Out of Stock");
				}
			}
		}

			

		
		
		
		
		
	}

	
	
	
	
	
