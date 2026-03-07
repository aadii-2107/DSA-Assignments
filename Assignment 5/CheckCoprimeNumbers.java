
//CheckCoprimeNumbers
class Demo
{
    public static void main(String args[])
    {
        int a=8;
        int b=15;
        int max=1;
        for(int i=1;i<Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                max=i;
            }
        }
	if(max==1)
	{
          System.out.println("Coprime");
	}else{
	  System.out.println("Not Coprime");
	}
    }
}