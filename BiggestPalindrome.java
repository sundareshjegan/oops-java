/* 
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Biggest Palindrome in an Array
*/
import java.util.*;
class Series
{
    int i,limit,rem,reverse=0;
    private int arr[],arr2[];
    void getInput()
    {
        Scanner scan = new Scanner(System.in);
        limit = scan.nextInt();
        arr = new int[limit];
        arr2 = new int[limit];
        for(i=0;i<limit;i++)
        {
            arr[i] = scan.nextInt();
        }
    }
    void reverseDigit()
    {
        for(i=0;i<limit;i++)
        {
            int number = arr[i];
            int temp = arr[i];
            while(number!=0)
            {
                rem = number%10;
                reverse = (reverse*10)+rem;
                number/=10;
            }
            if(temp==reverse)
            {
                arr2[i] = temp;
            }
                
        }
        System.out.println(Arrays.toString(arr2));
    }
}
public class BiggestPalindrome
{
    public static void main(String a[])
    {
        Series s = new Series();
        s.getInput();
        s.reverseDigit();
    }
}





