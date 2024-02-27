package utilities;



import java.text.DecimalFormat;

public class ReusableMethods {

    public static String getOnlyDigits(String str)
    {
        String result = "";

        // Traverse the String from start to end
        for (int i = 0; i < str.length(); i++) {

            // Check if the specified character is not digit
            // then add this character into result variable
            if (Character.isDigit(str.charAt(i))) {
                result = result + str.charAt(i);
            }
        }

        // Return result
        return result;
    }
    public static double  countOfProducts(String str){

        int countOfProducts= Integer.parseInt(ReusableMethods.getOnlyDigits(str));
        return countOfProducts;}

    public static double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#,##");
        return Double.valueOf(twoDForm.format(d));
    }
    public static int  countOfProductsAsInteger(String str){

        int countOfProducts= Integer.parseInt(ReusableMethods.getOnlyDigits(str));
        return countOfProducts;}



}
