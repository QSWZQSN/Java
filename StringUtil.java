import java.util.Scanner;
public class StringUtil {
    public static void main(String[] args){
        System.out.println("请输入一个字符串:");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        a = a.replaceAll(" ","");
        System.out.println("去除空格后为:"+a);
    }
}
