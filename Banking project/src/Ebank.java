import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Ebank {
    public static ResourceBundle labels;

    //Hàm set ngôn ngữ
    public static void setLocale(Locale locale){

            labels = ResourceBundle.getBundle("Resources/messages", locale);

    }

    public static void checkAccountNumber (){
        String accountNumber;
        do{
        System.out.print(labels.getString("Acc")+": ");
        Scanner input= new Scanner(System.in);
        accountNumber= input.next();
            if (!isValidAccount(accountNumber)) {
                System.out.println(labels.getString("AccError"));
            }else
                break;
        }while(!isValidAccount(accountNumber));

    }

    //Hàm ktra yêu cầu tk với regex
    private static boolean isValidAccount(String str)
    {

        String regex = "\\d{10}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null)
        {
            return false;
        }

        // Find match between given string
        // and regular expression
        // uaing Pattern.matcher()

        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }


    public static void checkPassWord (){
        do{
            System.out.print(labels.getString("Pass")+": ");
            Scanner input= new Scanner(System.in);
            String s= input.next();
            if (!isValidPassWord(s)){
                System.out.println(labels.getString("PassError"));
            }else
                break;
        }while(true);

    }

    //Hàm ktra password với yêu cầu
    private static boolean isValidPassWord(String str)
    {

        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,31}$";


        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null)
        {
            return false;
        }

        // Find match between given string
        // and regular expression
        // uaing Pattern.matcher()

        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }

    //Hàm tạo captcha
    private static String GenCapTCha(){
        char []data = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6',
                '7', '8', '9' };
        Random r= new Random();
        String str="";

        //Captcha có độ dài là 7, random trong khoảng 0-62,rồi mod 62 để lấy element tương ứng trong []data
        for (int i=0; i<7; i++) {
            str += data[r.nextInt(62)%62];
        }
        return str;
    }


    //Hàm user nhập captcha để so sanh với captcha hiện ra
    public static void checkCaptcha()
    {
        String captchaInput;
        String captchaGenerate;
        do{
            captchaGenerate= GenCapTCha();
        System.out.println("Captcha: " + captchaGenerate);

        System.out.print(labels.getString("Cap")+ ": ");
        Scanner input= new Scanner(System.in);
        captchaInput= input.nextLine();

        if (!captchaInput.equals(captchaGenerate)) {
            System.out.println(labels.getString("CapError"));
        } else {
            System.out.println(labels.getString("Login"));
            break;
        }
        }while(true);

    }


    //Hàm tổng hợp
    public static void LogIn() {
        checkAccountNumber ();
        checkPassWord ();
        checkCaptcha();
    }


}
