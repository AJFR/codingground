public class main
{
  // arguments are passed using the text field below this editor
  // arguments are in the form of [day of the week] [Ticket Type] [Ticket Type] [...] entered as Strings i.e. "Wednesday" "Student" "OAP" ...
  public static void main(String[] args) throws Exception
  {
    String isWedString = args[0];
    boolean isWed;
    //Ensures isWedString is a day of the week
    if(isWedString.equals("Monday")|isWedString.equals("Tuesday")|isWedString.equals("Wednesday")|isWedString.equals("Thursday")|isWedString.equals("Friday")|isWedString.equals("Saturday")|isWedString.equals("Sunday")){
        //Sets isWed to true if the day is Wednesday else false
        if(isWedString.equals("Wednesday")){
            isWed = true;
        }
        else{
            isWed = false;
        }
    }
    else{
        throw new Exception("Please enter a valid day of the week.");
    }
    Ticket temp;
    Ticket[] tArray = new Ticket[args.length -1];
    TicketMachine tm = new TicketMachine();
    //Loops through the ticket types given in the args
    for(int tCnt = 1; tCnt < args.length; tCnt++){
        if (!isValidType(args[tCnt])){
            throw new Exception("Please enter Child, Regular, Student or OAP in the arguments following the first one.");
        }
        temp = tm.createTicket(args[tCnt]);
        tArray[tCnt-1] = temp;
    }
    //Purchase the given tickets and shows the price
    tm.purchaseTickets(tArray, isWed);
  }
  private static boolean isValidType(String tType){
      return ((tType.equals("Child"))|(tType.equals("Student"))|(tType.equals("Regular"))|(tType.equals("OAP")));
  }
  
}
