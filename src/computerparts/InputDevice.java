
package computerparts;


public class InputDevice {
    
    //atributes
    private String inputType;
    private String brand;
    
    
    //constructor
    public InputDevice (String inputType, String brand){
        this.inputType = inputType;
        this.brand = brand;
            
    }

    //getters and setters
    public String getInputType() {
        return this.inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    //tostring
    @Override
    public String toString() {
        return "InputDevice{" + "inputType=" + inputType + ", brand=" + brand + '}';
    }
    
    
    
    
    
    
    
}
