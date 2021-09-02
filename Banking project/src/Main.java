import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Locale localeEn = new Locale("En");
        Locale localeVi = new Locale("Vi");
        boolean isContinue=false;
        int choose;

        Scanner scan = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.println("Chọn : ");
            if (scan.hasNextInt()) {
                choose = scan.nextInt();
                scan.nextLine();
                switch (choose) {
                    case 1:
                        try {
                            Ebank.setLocale(localeEn);
                            isContinue=true;
                        } catch (Exception e) {
                            System.out.println("You don't have the language package yet. Exit");
                            isContinue=false;
                        }

                        break;

                    case 2:
                        try{
                            Ebank.setLocale(localeVi);
                            isContinue=true;
                        } catch (Exception e) {
                            System.out.println("Bạn chưa có chức năng ngôn ngữ. Exit");
                            isContinue=false;
                        }

                        break;

                    case 3:
                        //Thoát
                        System.out.println("Goodbye!!!");
                        break;
                    default:
                        System.out.println("Nhap sai!!!!. Exit");
                        break;
                }
                if (isContinue==false){
                    break;
                }
                if (choose == 1 || choose == 2) {
                    Ebank.LogIn();
                }
                if (choose >=3) {
                    break;
                }
            }else{
                System.out.println("You have to enter number.Enter again.");
                scan.nextLine();
            }
        }
    }


    public static void showMenu() {
        System.out.println("1. English");
        System.out.println("2. Vietnamese");
        System.out.println("3. Exit");


    }
}
