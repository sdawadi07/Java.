public class week3 {

    public static void checkEven(int number){

        if(number % 2==0){
            System.out.println(number + " is even.");
        }
        else{
            System.out.println(number + " is odd.");
        }
    }
    public static void main(String[]args){
        //calling methods
checkEven(8);
checkEven(7);

    }
}
