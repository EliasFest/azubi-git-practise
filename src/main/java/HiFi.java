public class HiFi {

    private boolean isTurnedOn = false;
    private boolean standbyLedIndicator = true;
    private String status;

    public String turnOn() {
        isTurnedOn = true;
        standbyLedIndicator = false;
        status = "Device is online and not running in standby";
        return status;
    }

    public String turnOff() {
        isTurnedOn = false;
        standbyLedIndicator = true;
        status = "Device is offline but standby is enabled";
        return status;
    }

    public void showStatus() {
        System.out.println(status);
    }
}
