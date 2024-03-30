package myOwnPracticeDays;

public class CarDriverInfo {
    public static void main(String[] args) {

        String carModel,driverName,licenseNum,color;
        short speed;
        boolean isAutomatic;
        char licenseClass;
        carModel = "Dodge Challenger";
        color = "Cinnamon";
        driverName = "Mila Stuhlmiller";
        licenseClass = 'a';
        licenseNum = "ABG12345H";
        isAutomatic = true;
        speed = 135;



        String fullDetailsMyFavCar = "Driver name: " + driverName + "\nMy car model is: " + carModel +
                "\nColor: " + color + "\nIs Automatic: " + isAutomatic + "\nLicense Class: " + licenseClass + "\nLicense Number: "
                + licenseNum + "\nSpeed: " + speed + "mph";
        System.out.println(fullDetailsMyFavCar);


    }
}
