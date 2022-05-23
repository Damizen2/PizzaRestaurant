import java.util.ArrayList;
public class Order{
  private ArrayList<Pizza> pizzas= new ArrayList<>();
  static final double tax= 0.0053;
  public void addPizza(Pizza pizza){
    pizzas.add(pizza);
  }
  public double taxValue(){
     return tax;

    }
    
  
  public double OrdertotalPrice(){
    double sumPrice=0;
    for(Pizza pitza: pizzas){
      sumPrice=sumPrice + pitza.totalPrice() ;}
    return sumPrice+ (sumPrice*tax);
  }
  public String toString(){
    String description= "";
    for (Pizza pizza : pizzas) {
      description += String.format("%s%n with tax of %g totals to %f\n", pizza.toString(),tax,pizza.totalPrice()+(pizza.totalPrice()*tax));
    }
    return description ;
  }
}
