import java.util.ArrayList;
public class Restaurant{
  static ArrayList<Order> orders= new ArrayList<>();
  static ArrayList<Topping> toppings= new ArrayList<>();
  static void addOrder(Order order){
    orders.add(order);
  }
  static int orderCount(){
    return orders.size();
  }
  static double priciestOrder(){
    //Order priciest= null;
    double pricey=0;
    for(Order order1: orders){
    if(pricey<order1.OrdertotalPrice()){
      pricey=order1.OrdertotalPrice();
      //priciest= order1;
      }
      } 
    return pricey;
  }  
  static void addTopping(Topping topping){
    toppings.add(topping);
  }
  static Topping getTopping(String Topping){
    for(Topping topping: toppings){
      if(Topping==topping.name){
        return topping;
      }
    }
    return null;
  }
  static void printOrders(){
    String printing="";
    for(Order order: orders){
      printing +=String.format("%s%n\n", order.toString() );
    }
    System.out.println(printing);
     
  }
 
}
