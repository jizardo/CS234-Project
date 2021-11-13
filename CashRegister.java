class Main {
	public static void main(String[] args) {
		CashRegister register1 = new CashRegister();
		register1.getTotal();
	}
	class CashRegister
	{
		private int itemCount;
		private double totalPrice;
		
		/**
		Constructs a cash register with cleared item count and total.
		*/
		public CashRegister()
		{
			itemCount = 0;
			totalPrice = 0;
		}
		
		/**
		Adds an item to this cash register 
		at param price the price of this item
		*/
		public void addItem(double price)
		{
			itemCount++;
			totalPrice = totalPrice + price;
		}
		
		/**Gets the price of all items in the current sale.
		Returns the total amount
		*/
		public double getTotal()
		{
			return totalPrice;
		}
		
		/**Gets the number of items in the current sale
		@returns the item count
		*/
		public int getCount()
		{
			return itemCount;
		}
		
		/**Clears the item count and the total
		*/
		public void clear()
		{
			itemCount = 0;
			totalPrice = 0;
		}
	}
}