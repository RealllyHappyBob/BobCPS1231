package Practice;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args){
        //1.Create a scanner object
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int pos=0;
        int neg=0;
        int total=0;
        int amo=0;

        //2.while
        while (true){
            int num= input.nextInt();
            if (num==0)
                break;

            else{
                amo++;
                total+=num;
                if(num>0)
                   pos++;
                else
                   neg++;

            }
        }
        double ave=total/amo;
        //3.show the result
        if(amo!=0){
            System.out.println("The number of positives is "+pos+
                            "\nThe number of negatives is "+neg+
                             "\nThe total is "+total+
                             "\nThe average is "+ave);
        }
        else
            System.out.println("No numbers entered except 0");


    }
}
