import java.util.Scanner;

public class TelephoneNumber {
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in); 
		System.out.println("Please enter a telephone number using letters : ");
		
		String num = scnr.nextLine();
		num = num.toUpperCase();
		
		num = num.replaceAll("\\s", "");
		
		char z = 'Z';
		char y = 'Y';
		char x = 'X';
		char w = 'W';
		char v = 'V';
		char u = 'U';
		char t = 'T';
		char s = 'S';
		char r = 'R';
		char q = 'Q';
		char p = 'P';
		char o = 'O';
		char n = 'N';
		char m = 'M';
		char l = 'L';
		char k = 'K';
		char j = 'J';
		char i = 'I';
		char h = 'H';
		char g = 'G';
		char f = 'F';
		char e = 'E';
		char d = 'D';
		char c = 'C';
		char b = 'B';
		char a = 'A';
		String num1 = null;
		String num2 = null;
		String num3 = null;
		String num4 = null;
		String num5 = null;
		String num6 = null;
		String num7 = null;
		
		int index = 1;
		int index1 = 0;
		for (int index2 = 0; index2 <= 6; index2++) {
		char result = num.charAt(index1);
		
		if (result == z || result == y || result == x || result == w) {
			switch(index) {
				case 1:
					num1 = "9";
					break;
				case 2:
					num2 = "9";
					break;
				case 3:
					num3 = "9";
					break;
				case 4:
					num4 = "9";
					break;
				case 5:
					num5 = "9";
					break;
				case 6:
					num6 = "9";
					break;
				case 7:
					num7 = "9";
					break;
				default:
					break;
			}
		}
		else if (result == v || result == u || result == t) {
			switch(index) {
				case 1:
					num1 = "8";
					break;
				case 2:
					num2 = "8";
					break;
				case 3:
					num3 = "8";
					break;
				case 4:
					num4 = "8";
					break;
				case 5:
					num5 = "8";
					break;
				case 6:
					num6 = "8";
					break;
				case 7:
					num7 = "8";
					break;
				default:
					break;
		}
		}
		else if (result == s || result == r || result == q || result == p) {
			switch(index) {
				case 1:
					num1 = "7";
					break;
				case 2:
					num2 = "7";
					break;
				case 3:
					num3 = "7";
					break;
				case 4:
					num4 = "7";
					break;
				case 5:
					num5 = "7";
					break;
				case 6:
					num6 = "7";
					break;
				case 7:
					num7 = "7";
					break;
				default:
					break;
		}
		}
		else if (result == o || result == n || result == m) {
			switch(index) {
				case 1:
					num1 = "6";
					break;
				case 2:
					num2 = "6";
					break;
				case 3:
					num3 = "6";
					break;
				case 4:
					num4 = "6";
					break;
				case 5:
					num5 = "6";
					break;
				case 6:
					num6 = "6";
					break;
				case 7:
					num7 = "6";
					break;
				default:
					break;
		}
		}
		else if (result == l || result == k || result == j) {
			switch(index) {
				case 1:
					num1 = "5";
					break;
				case 2:
					num2 = "5";
					break;
				case 3:
					num3 = "5";
					break;
				case 4:
					num4 = "5";
					break;
				case 5:
					num5 = "5";
					break;
				case 6:
					num6 = "5";
					break;
				case 7:
					num7 = "5";
					break;
				default:
					break;
		}
		}
		else if (result == g || result == h || result == i) {
			switch(index) {
				case 1:
					num1 = "4";
					break;
				case 2:
					num2 = "4";
					break;
				case 3:
					num3 = "4";
					break;
				case 4:
					num4 = "4";
					break;
				case 5:
					num5 = "4";
					break;
				case 6:
					num6 = "4";
					break;
				case 7:
					num7 = "4";
					break;
				default:
					break;
		}
		}
		else if (result == f || result == e || result == d) {
			switch(index) {
				case 1:
					num1 = "3";
					break;
				case 2:
					num2 = "3";
					break;
				case 3:
					num3 = "3";
					break;
				case 4:
					num4 = "3";
					break;
				case 5:
					num5 = "3";
					break;
				case 6:
					num6 = "3";
					break;
				case 7:
					num7 = "3";
					break;
				default:
					break;
		}
		}
		else if (result == a || result == b || result == c) {
			switch(index) {
				case 1:
					num1 = "2";
					break;
				case 2:
					num2 = "2";
					break;
				case 3:
					num3 = "2";
					break;
				case 4:
					num4 = "2";
					break;
				case 5:
					num5 = "2";
					break;
				case 6:
					num6 = "2";
					break;
				case 7:
					num7 = "2";
					break;
				default:
					break;
		
		}
	
		}
		index1 += 1;
		index += 1;
		}
	System.out.println(num1 + num2 + num3 + "-" + num4 + num5 + num6 + num7);
	}
}