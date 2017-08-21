public class TicketMachine
{
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
	   if(isWed){
		   discnt = 2;
	   }
	   for(Ticket temp : ticketsToBuy){
		   price += temp.getPrice() - discnt;
       }
	   return price;
   }
   
   public Ticket[] purchaseTickets(Ticket[] ticketsToBuy, boolean isWed){
	   System.out.println("The total cost of tickets for this movie is "+calcPrice(ticketsToBuy, isWed)+" GBP.");
	   return ticketsToBuy;
   }
  
}
