public class HiFi {

    private boolean isHalloTurned = false;
    private boolean standbyLedIndicator = true;
    private String status;

    public String turnOn() {
        isHalloTurned = true;
        standbyLedIndicator = false;
        status = "Device is online and not running in standby";
        System.out.println("test");
        return status;
    }

    public String turnOff() {
        isHalloTurned = false;
        standbyLedIndicator = true;
        status = "Device is offline but standby is enabled";
        return status;
    }

    public void showStatus() {
        System.out.println(status);
    }
}
