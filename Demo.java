import java.util.Arrays;


public class Demo {

	public static void main(String[] args) {
		
		String x1 = "Hello How are You How are You How are You".replace("How", "");
		System.out.println(x1);
		
		String x = "annweertnmnaaesdabhkkkkkktttlllghfdkjghfdgktherthcbkjvbkghro";
		char y[]= x.toCharArray();
		Arrays.sort(y);
		StringBuffer z = new StringBuffer(new String(y));
		String temp = "";
		System.out.println("Z is "+z);
		int highestCount = 0;
		int i = -1;
		char a ='#';
		char highestchar = '#';
		while(i<z.length()-1){
			a = z.charAt(i+1);
			int noOfCount = z.toString().lastIndexOf(a) - z.toString().indexOf(a) + 1;
			temp = temp+a;
			i = z.toString().lastIndexOf(a);
			if(highestCount==0){
				highestCount = noOfCount;
			}
			else
			if(noOfCount>highestCount)	
			{
				highestCount = noOfCount;
				highestchar = a;
			}
			
		}
		System.out.println("Remove Dupicate "+temp);
		System.out.println("A is "+highestchar+" And Highest Count "+highestCount);

	}

}
