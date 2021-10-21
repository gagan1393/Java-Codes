package Practice;

public class IsNumber {

    public static void main(String[] args) {

        isValidPhoneNumber("9999999999");
        isValidPhoneNumber("999999999989");
        isValidPhoneNumber("999999999");
        isValidPhoneNumber("999999999");
        isValidPhoneNumber("9999999995ABC");
        isValidPhoneNumber("99999#$%^ABC");
    }

    public static void isCorrectNumber(String number) {
        number.matches("^(~?\\d+\\.)?-?\\d+$");
    }

    public static boolean isNumber(String number){
        try{
            Long.parseLong(number);
            System.out.println("The Phone Number You Enter is Valid :" + number);
        } catch (NumberFormatException e){
            System.out.println("The Phone Number You Enter is Not Valid :" + number);
            return false;
        }
        return true;
    }

    public static boolean isValidPhoneNumber(String number) {
        if (number.length() == 10 && isNumber(number)) {
            System.out.println("The Phone Number You Enter is Valid :" + number);
            return true;
        }
        System.out.println("The Phone Number You Enter is Not Valid :" + number);
        return false;
    }
}

