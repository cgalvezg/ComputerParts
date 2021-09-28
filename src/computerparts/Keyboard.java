
package computerparts;


//inheritance
public class Keyboard extends InputDevice{
    
    //attributes
    private final int idKeyboard; 
    private static int KeyboardCount;
    
    
    public Keyboard(String inputType, String brand){        
        //call parent constructor
        super(inputType, brand);
        
        //increment a mouse when call constructor
        this.idKeyboard = ++Keyboard.KeyboardCount;
        
        
    }

    //tostring: print the object attributes
    @Override
    public String toString() {
        return "Keyboard{" + "idKeyboard=" + idKeyboard + ", " + super.toString() + '}';
    }

    
    
}
