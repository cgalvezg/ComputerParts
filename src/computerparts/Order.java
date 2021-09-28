
package computerparts;


public class Order {
    
    //attributes
    private final int idOrder;
    private Computer computers[];
    private static int OrderCount;
    private static final int MAX_COMPUTERS = 10;
    private int ComputerCount;
    
    //constructor
    public Order(){
        this.idOrder = ++Order.OrderCount;
        this.computers = new Computer[Order.MAX_COMPUTERS];
        
    }
    
    //method that adds a computer on an array
    public void addComputer(Computer computer){
        if (this.ComputerCount < Order.MAX_COMPUTERS){
            this.computers[this.ComputerCount++] = computer;
        }
        else{
            System.out.println("Too many computers");
        }
       
    }
    
    //method that show the computers in the array
    public void showOrder(){
        System.out.println("Order #:" + this.idOrder);
        System.out.println("Computers" + this.idOrder);
        
        for (int i = 0; i < this.ComputerCount; i++){
            System.out.println(this.computers[i]);
        }        
    
    }  
    
    
}