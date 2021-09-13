public class HiFi {

    private boolean hallo = false;
    private boolean standbyLedIndicator = true;
    private String status;

    public String turnOn() {
        hallo = true;
        standbyLedIndicator = false;
        status = "Device is online and not running in standby";
        return status;
    }

    public String turnOff() {
        hallo = false;
        standbyLedIndicator = true;
        status = "Device is offline but standby is enabled";
        return status;
    }

    public void showStatus() {
        System.out.println(status);
    }
}
