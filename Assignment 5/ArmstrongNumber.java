//ArmstrongNumber
class Demo
{
    public static void main(String args[])
    {
        int num=153;
        int temp1=num;
        int count=0; 
        while(temp1>0)
        {
            count++;
            temp1=temp1/10;
        }
        int temp2=num;
        int sum=0;
        while(temp2>0)
        {
            int rem=temp2%10;
            int rem2=1;
            for(int i=0;i<count;i++)
            {
                rem2=rem2*rem;
            }
            sum=sum+rem2;
            temp2=temp2/10;
        }
        if(sum==num)
        {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}

//output:Armstrong Number