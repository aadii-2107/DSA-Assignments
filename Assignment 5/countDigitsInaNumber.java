//countDigitsInaNumber
class Demo
{
    public static void main(String args[])
    {
        int num=54321;
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}

//output : 5