//extractAllDigits
class Demo
{
    public static void main(String args[])
    {
        int num=5382;
        while(num>0)
        {
            int rem=num%10;
            System.out.println(rem);
            num=num/10;
        }
        
    }
}

/* 
Output:
2
8
3
5
*/