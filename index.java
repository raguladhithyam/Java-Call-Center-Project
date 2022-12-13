import java.util.LinkedList; 
public class Main  
{ 
    public static void main(String[] args)  
    { 
        CallHandler ch = new CallHandler(); 
        ch.dispatchCall("Call1"); 
        ch.dispatchCall("Call2"); 
        ch.dispatchCall("Call3"); 
        ch.dispatchCall("Call4");
        ch.dispatchCall("Call5");
        ch.dispatchCall("Call6");
        ch.dispatchCall("Call7");
        ch.dispatchCall("Call8");
        ch.dispatchCall("Call9");
    } 
} 

class Fresher{  
  
    String name; 
    boolean isFree; 
      
    public Fresher(String name){ 
        this.name = name; 
        this.isFree = true; 
    } 
  
    public String getName() { 
        return name; 
    } 
  
    public boolean isFree() { 
        return isFree; 
    } 
  
    public void setFree(boolean isFree) { 
        this.isFree = isFree; 
    } 
} 


class TechnicalLead{ 
    String name; 
    boolean isFree; 
      
    public TechnicalLead(String name){ 
        this.name = name; 
        this.isFree = true; 
    } 
  
    public String getName() { 
        return name; 
    } 
  
    public boolean isFree() { 
        return isFree; 
    } 
  
    public void setFree(boolean isFree) { 
        this.isFree = isFree; 
    } 
} 


class ProductManager{ 
    String name; 
    boolean isFree; 
      
    public ProductManager(String name){ 
        this.name = name; 
        this.isFree = true; 
    } 
  
    public String getName() { 
        return name; 
    } 
  
    public boolean isFree() { 
        return isFree; 
    } 
  
    public void setFree(boolean isFree) { 
        this.isFree = isFree; 
    } 
} 


class CallHandler{ 
      
    private LinkedList<Fresher> freshers; 
    private TechnicalLead technicalLead; 
    private ProductManager productManager; 
      
    public CallHandler(){ 
          
        freshers = new LinkedList<Fresher>(); 
          
        // creating freshers, TLs, PMs 
        freshers.add(new Fresher("F1")); 
        freshers.add(new Fresher("F2")); 
        freshers.add(new Fresher("F3")); 
        freshers.add(new Fresher("F4")); 
        freshers.add(new Fresher("F5")); 
        freshers.add(new Fresher("F6"));  
        technicalLead = new TechnicalLead("TL"); 
        productManager = new ProductManager("PM"); 
    } 
      
    public void dispatchCall(String call){ 
          
        boolean isFresherFree = false; 
        for(Fresher fresher: freshers){ 
            if(fresher.isFree()){ 
                isFresherFree = true; 
                fresher.setFree(false); 
                  
                System.out.println("Call dispatched to fresher: "+ 
                                        fresher.getName()); 
                break; 
            } 
        } 
          
        if(!isFresherFree){ 
            if(technicalLead.isFree()){ 
                technicalLead.setFree(false); 
                  
                System.out.println("Call dispatched to Technical Lead: "+ 
                                        technicalLead.getName()); 
            } 
            else if(productManager.isFree()){ 
                    productManager.setFree(false); 
                      
                    System.out.println("Call dispatched to Product Manager: "+ 
                                            productManager.getName());  
            }
            else{
                System.out.println("All employees are busy. Please try afetr sometime");
            }
        } 
    } 
} 
  
