public class problem2 {
    public static void main(String[] args) {
        SmartDevice bulb = new SmartDevice("Phillips", true);

        Hub<SmartDevice> myHub = new Hub<>();
        myHub.storeDevice(bulb);

        myHub.statusReport();
    }
}

class SmartDevice {
    private String brand;
    private boolean isPowerOn;

    public SmartDevice(String brand, boolean isPowerOn) {
        this.brand = brand;
        this.isPowerOn = isPowerOn;
    }

    @Override
    public String toString() {
        return "Device [Brand: " + brand + ", Power: " + (isPowerOn ? "ON" : "OFF") + "]";
    }
}

class Hub<T> {
    private T item;

    public void storeDevice(T item) {
        this.item = item;
    }

    public T getDevice() {
        return item;
    }

    public void statusReport() {
        if (item != null) {
            System.out.println("Reporting: " + item.toString());
        } else {
            System.out.println("No device connected to hub.");
        }
    }
}