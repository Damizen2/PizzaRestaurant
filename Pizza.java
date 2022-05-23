import java.util.ArrayList;
public abstract class Pizza{
  protected ArrayList<Topping> toppingsPizza= new ArrayList<>();
  
  public void addTopping(Topping topping){
    toppingsPizza.add(topping);
  }
  abstract double basePrice();

  private double toppingsPrice(){
    double sum=0;
    for(Topping top: toppingsPizza){
      sum+= top.price;
         }
    return sum;
    }
    
  
  public double totalPrice(){
   return basePrice() + toppingsPrice();
  }
}
