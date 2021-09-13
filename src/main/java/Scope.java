public class Scope {
    public static void main(String[] args) {
        //Create a class with the name HiFi
        //Create a field with name isTurnedOn which default value is false and scope is private
        //Create a field with name standbyLedIndicator which default value is true and scope is private
        //Write a public called turnOn function to turn on the hifi device. This function should set isTurnedOn to true and standbyIndicator to false
        //Write a public called turnOff function to turn off the hifi device. This function should set isTurnedOn to false and standbyIndicator to true
        //Overwrite the toString() function and return the current status of the hifi device.
        //When Hifi is turned on return: "Device is online and not running in standby"
        //When Hifi is turned off return: "Device is offline but standby is enabled"

        System.out.println("Start of the program");
        HiFi hifi = new HiFi();
        hifi.turnOn();//This should work
        hifi.turnOff(); //This should work
        System.out.println(hifi.toString()); //This should work
        hifi.showStatus();
        System.out.println("End of the programm")
    }
}
