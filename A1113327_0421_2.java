import java.util.Scanner;

public class A1113327_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入日期 (YYYY/MM/DD 或 MM/DD/YYYY)：");
        String input = scanner.nextLine();

        int year = 0, month = 0, day = 0;
        int start = 0, end = 0;
        
        if (input.indexOf("/") != -1) { 
            end = input.indexOf("/");
            year = Integer.parseInt(input.substring(start, end));
            start = end + 1;
            end = input.indexOf("/", start);
            month = Integer.parseInt(input.substring(start, end));
            start = end + 1;
            day = Integer.parseInt(input.substring(start));
        } else { 
            end = input.indexOf("/");
            month = Integer.parseInt(input.substring(start, end));
            start = end + 1;
            end = input.indexOf("/", start);
            day = Integer.parseInt(input.substring(start, end));
            start = end + 1;
            year = Integer.parseInt(input.substring(start));
        }

        System.out.println("輸入的日期為：" + input);
        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day);
    }
}
