
package computerparts;

//inheritance
public class Mouse extends InputDevice{
    
    //attributes
    private final int idMouse; 
    private static int MouseCount;
    
    public Mouse(String inputType, String brand){
        
        //call parent constructor
        super(inputType, brand);
        
        //increment a mouse when call constructor
        this.idMouse = ++Mouse.MouseCount;
        
        
    }
    
    //tostring: print the object attributes
    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + ", " + super.toString() +'}';
    }    
    
    
    
}
