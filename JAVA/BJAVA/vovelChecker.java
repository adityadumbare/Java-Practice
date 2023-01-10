import java.util.*;
class vovelChecker 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a char to check it is vovel or not ");
		char a=s.next().charAt(0);
		
		vovelChecker(a);
	}
	public static void vovelChecker(char y) 
	{

		/*switch (a)
		{
		case 'a':
			case 'o':
			case 'u':
			case 'i':
			case 'e':
		
						System.out.println(a+" Is a Vovel");
			
			break;
			default :
				System.out.println(a+" Is Consonant");
		}*/
		if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u') 
            System.out.println("It is a Vowel."); 
        else
            System.out.println("It is a Consonant."); 
	}

}
