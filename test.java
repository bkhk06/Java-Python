import java.util.*;
class Rock{
	Rock(int i){
		System.out.print("Rock " +i+" ");
	}
}
public class test
{
	public static void main(String[] args)
	{
		System.out.println("Hello:");
		System.out.println(new Date());
		
		//check if it is low case character:
		for (char c=0;c<128;c++)
			if(Character.isLowerCase(c))
				System.out.println("value:  "+(int)c+" character "+c);
		
		//For-each method demo:
		Random rand=new Random(47);
		float f[]=new float[10];
		for(int i=0;i<10;i++)
			f[i]=rand.nextFloat();
	    for(float x:f)
	    	System.out.println("x: "+x);
	    
	    //class initialization demo:
	    for(int i=0;i<10;i++)
	    	new Rock(i);
	 
			
				
	}
}
