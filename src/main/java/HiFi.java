public class HiFi {

    private boolean testing = false;
    private boolean standbyLedIndicator = true;
    private String status;

    public String turnedOn() {

        testing = true;
        standbyLedIndicator = false;
        status = "Device is online and not running in standby";
        System.out.println("test");
        return status;

    }

    public String turnOff() {
        testing = false;
        standbyLedIndicator = true;
        status = "Device is offline but standby is enabled";
        return status;
    }

    public void showStatus() {
        System.out.println(status);
    }

}
