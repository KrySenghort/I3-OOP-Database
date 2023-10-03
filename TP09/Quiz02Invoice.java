// Create a class called invoice that a hardware store might use to represent an invoice for an item sold at a store. 
// An invoice should include four pieces informations as instance variable such as : 
// [1] number(string), [2] description(string), [3] quatity(type int), [4] unit price(double). 
// Your class should have a constructor to initialize the four instance variables. 
// Provide a set() and get() method for each instance variables. 
// In addition, provide a method named getInvoiceAmount to calculate invoice amount. 
// Return amount as double value. If quantity<0 then amount = 0 and if UnitPrice<0 then amount = 0.         
public class Quiz02Invoice {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double Unitprice;

  public Quiz02Invoice(String pNum, String Pdes, int qty, double price) {
    if (pNum != null)
      pNum = partNumber;
    else
      partNumber = "0";
    if(partDescription!=null)
      pNum = partNumber;
    else
      partDescription = "0";
    if(qty>0)
      qty = quantity;
    else
      quantity = 0;
    if(price>0)
      price = Unitprice;
    else
      Unitprice = 0;
  public String getPartNum(){
    return partNumber;
  }


  }

}
