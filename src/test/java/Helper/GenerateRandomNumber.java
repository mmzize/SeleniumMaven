package Helper;
import java.util.Random;
public class GenerateRandomNumber {



    public String randomNumb()
    {
        int num1, num2;
        int set2, set3; //sequence 2 and 3 of the phone number
        Random generator = new Random();
        //Area code number; Will not print 8 or 9
        num1 = 0; //add 1 so there is no 0 to begin
        num2 = generator.nextInt(8) + 1; //randomize to 8 becuase 0 counts as a number in the generator
        set2 = generator.nextInt(999) + 100;
        set3 = generator.nextInt(999) + 1000;
        String phoneNumber = num1 + "" + num2 + "" + num1 + " " + set2 + " " + set3;
        return phoneNumber;
    }


}
