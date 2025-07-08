import java.util.Locale;

public class Thursdayweek3 {
    public static void main(String[] args){
//Concatenation
        String a = "Hello,";
        String b = "My na is Swastika.";

        String all = a + b;

        System.out.println(all);

        //Friday

        String name = "Swastika";
        int length = name.length();
        char c = name.charAt(5);
        System.out.println(length);
        System.out.println(c);
        String name2 = "swastika";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));


//Ascii value
        //compare to will check case as well
        String str1 ="car";
        String str2 = "remote";
        System.out.println('c' + 0);
        System.out.println('r' + 0);
        int i = str1.compareTo(str2);
        System.out.println(i);

//Substring is a part of String

        String na = "Swastika Dawadi";
         String substring = na.substring(8);
        System.out.println(substring);
        System.out.println(na.toLowerCase(Locale.ROOT));
        String replace = na.replace("Swastika", "Nora");
        System.out.println(replace);

        System.out.println(na.contains("as"));
        System.out.println(na.startsWith("S"));
        System.out.println(na.endsWith("i"));


        String str = "";
        System.out.println(str.isEmpty());

        int j = na.indexOf("a");
        System.out.println(j);
    }
}
