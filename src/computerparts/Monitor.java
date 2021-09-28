
package computerparts;

public class Monitor {
    
    private final int idMonitor;
    private String brand;
    private double size;
    private static int MonitorCount;
    
    private Monitor(){
        this.idMonitor = ++Monitor.MonitorCount;
    }
    
    public Monitor (String brand, double size){
        this(); //call void private constructor
        this.brand = brand;
        this.size = size;
        
    }
    
    public int getidMonitor(){
        return this.idMonitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static int getMonitorCount() {
        return MonitorCount;
    }

    public static void setMonitorCount(int MonitorCount) {
        Monitor.MonitorCount = MonitorCount;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", brand=" + brand + ", size=" + size + '}';
    }
    
    
    
    
    
}
