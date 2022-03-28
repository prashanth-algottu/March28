
// 1. Create an ArrayList of alphabets and get the first occurrence of alphabet P, get last occurrence
//of alphabet 'R',

package Day6;

import java.util.ArrayList;

import Day5.ArrayFirstAndLatOccurence;

public class GetFirstandLastOccorencePandR {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('s');
		al.add('p');
		al.add('d');
		al.add('f');
		al.add('r');
		System.out.println(al);
		System.out.println(al.indexOf('p'));
		System.out.println(al.lastIndexOf('r'));

	}

}
