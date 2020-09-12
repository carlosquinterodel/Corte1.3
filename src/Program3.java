
public class Program3 {

	public static void main(String[] args) {
		int array [] = {3, 8, 3};
		boolean resp = palindromo(array, 0, array.length-1);
		System.out.println("El array dado es palindromo: "+resp);
	}
	
	public static boolean palindromo (int array[], int posIni, int posfin) {
		if (array.length/2 == posIni) {
			return true;
		}else {
			if(array[posIni] != array[posfin]) {
				return false;
			}else {
				return palindromo (array, posIni+1, posfin-1);
			}
		}
	}

}
