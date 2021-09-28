
package computerparts;


public class Test {
    
    public static void main(String[] args) {
        
        //creating objects
        Monitor monitorHP = new Monitor("HP", 13);
        Keyboard keyboardHP = new Keyboard("bluetooth", "HP");
        Mouse mouseHP = new Mouse("bluetooth", "HP");        
        Computer computerHP = new Computer("ComputerHP", monitorHP, keyboardHP, mouseHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Keyboard keyboardGamer = new Keyboard("bluetooth", "Gamer");
        Mouse mouseGamer = new Mouse("bluetooth", "Gamer");
        Computer computerGamer = new Computer("ComputerGamer", monitorGamer, keyboardHP, mouseGamer);
        
        
        Order order1 = new Order();
        
        //adding a computer
        order1.addComputer(computerHP);
        order1.addComputer(computerGamer);
        
        //show array of computers
        order1.showOrder();
        
    }
    
}
