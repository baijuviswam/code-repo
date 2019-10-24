import java.util.Arrays;
import java.util.Stack;

/** Reverse words in a sentence **/

public class ReverseWords{
	public static void main(String[] args) {
		String sentence = "a big fat fox jump over the moon";
		ReverseWords rw = new ReverseWords();
		String [] words = sentence.split("\\s");
		System.out.println(rw.reverseStringWithStack(words));
		System.out.println(rw.reverseWords(words));
		System.out.println(rw.reverseWithTwoPointer(words));
	}
	public String reverseStringWithStack(String [] words){
		Stack<String> stack = new Stack<String>();
		int count =0;
		for(String w : words){
			stack.push(w);
			++count;
		}
		String [] arr = new String[count];
		String response="";
		while(!stack.isEmpty()){
			response+= stack.pop()+" ";
		}
		return response.trim();
	}

	public String reverseWords(String [] words){
		int n = words.length-1;
		StringBuilder sb = new StringBuilder();
		while (n>=0){
			sb.append(words[n]);
			sb.append(" ");
			--n;
		}
		return sb.toString();
	}

	public String reverseWithTwoPointer(String[] words){
		int i = 0;
		int j = words.length-1;
		while(i<=j){
			//swap
			String temp = words[i];
			words[i] = words [j];
			words[j] = temp;
			++i;
		    --j;
		}
		return String.join(" ",words);
	}

}