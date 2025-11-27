import java.util.Scanner;

public class A1113327_0421_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入電子郵件地址: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("這個電子郵件地址是正確的。");
        } else {
            System.out.println("這個電子郵件地址是錯誤的。");
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}";
        return email.matches(regex);
    }
}
