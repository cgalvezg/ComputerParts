
package computerparts;



public class Computer {
    
    //attributes    
    private final int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int ComputerCount;
    
    //private constructor
    private Computer(){
        this.idComputer = ++Computer.ComputerCount;
    }
    
    //public constructor
    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse){
        this();
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;    
    
    }

    //getters and setters
    public int getIdComputer() {
        return idComputer;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    //tostring: print the object attributes
    @Override
    public String toString() {
        return "Computer{" + "idComputer=" + idComputer + ", name=" + name + ", monitor=" + monitor + ", keyboard=" + keyboard + ", mouse=" + mouse + '}';
    }
    
    
    
    
    
}
