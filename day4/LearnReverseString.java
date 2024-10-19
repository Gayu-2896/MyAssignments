package week1.day4;


public class LearnReverseString {

	public static void main(String[] args) {
		
		String name = new String("Gayathri");
		
		char[] chararray = name.toCharArray();
				System.out.println(chararray);
		for (int i = chararray.length-1;i>=0;i-- )
		{
			System.out.print(chararray[i]);
		}

		
	}
}
	
