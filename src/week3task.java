public class week3task {
    public static void main(String[]args){
        //Reverse a String

        String str1 = "dad";
        String reversed = "";

        for(int i = str1.length()-1 ; i>=0;i--){
            reversed+= str1.charAt(i);
        }
        System.out.println(reversed);
         if(str1.equalsIgnoreCase(reversed)){
             System.out.println("Is Palindrome");

        } else{
             System.out.println("Not a Palindrome");
         }

    }

}
