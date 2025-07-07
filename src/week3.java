public class week3 {

    public static void checkEven(int number){

        if(number % 2==0){
            System.out.println(number + " is even.");
        }
        else{
            System.out.println(number + " is odd.");
        }
    }

    public static int findFactorial(int num){
        int result = 1;
        for(int i = 1; i<=num; i++){
            result *=i;

        }
        System.out.println("The factorial of " + num + " is " + result + ".");

        return result;





    }
    public static void main(String[]args){
        //calling methods
checkEven(8);
checkEven(7);


//Returning the values
        findFactorial(5);
        findFactorial(3);
        findFactorial(10);
    }

}
