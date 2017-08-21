public class TicketMachine
{
//Creates a Ticket of the type entered either Student Child Regular or OAP
  public Ticket createTicket(String type)
  {
    Ticket t;
    switch (type) 
    {
      default : t = new Ticket();
      case "Student" : t = new Student();
      				break;
      case "OAP" : t = new OAP();
					break;
      case "Regular" : t = new Regular();
      				break;
      case "Child" : t = new Child();
      				break;
  	}
  	return t;
  }

  private int calcPrice(Ticket[] ticketsToBuy, boolean isWed){
	   int price = 0;
	   int discnt = 0;
	  //If it is a wednesday it will set discnt to 2
	   if(isWed){
		   discnt = 2;
	   }
	  //Loops through the set of Tickets to be bought
	   for(Ticket temp : ticketsToBuy){
		   //price updates with the Tickets price minus the discnt
		   price += temp.getPrice() - discnt;
       }
	   return price;
   }
   
   public Ticket[] purchaseTickets(Ticket[] ticketsToBuy, boolean isWed){
	   //Outputs the amount needed for purchase
	   System.out.println("The total cost of tickets for this movie is "+calcPrice(ticketsToBuy, isWed)+" GBP.");
	   return ticketsToBuy;
   }
  
}
