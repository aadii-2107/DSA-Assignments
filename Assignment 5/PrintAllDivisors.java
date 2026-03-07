//PrintAllDivisors

class Demo
{
    public static void main(String args[])
    {
        int num=12;
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
	    {
              System.out.println(i);
              System.out.println(num/i);
	    }
        }
    }
}

/*
method 2

class Demo
{
    public static void main(String args[])
    {
        int num=12;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            System.out.println(i);
            
        }
    }
}

*/