package leetcodeproblem;

public class LongestCommonPrefix {
	 public static String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    return prefix;
		}

	public static void main(String[] args) {
     String fuckyou = longestCommonPrefix(new String[] { "flower", "flow", "flirt" });
		System.out.println(fuckyou);

		//String[] things = new String[] { "flower", "flow", "flow" };
		String perfix2 = "flower";
		String prefix3 = "flow";
		int indexOf = prefix3.indexOf(perfix2);
		System.out.println("index of :"+indexOf);
		String substring = perfix2.substring(0,3);
		System.out.println("substring at specified value:"+substring);
				
		
		/*for (int i = 1; i<things.length;i++) {
			while(things[i].indexOf(perfix2);)
		}*/
	

	}

} // oh god tell me how to do it .. how to do it
// how to do it how to do it this problem..
// try to give your best fo the  best version of yourselfl
// kanchha give your best of the best version of lyura

// dont talk about your other fucking stuff ..

// focus on  problem sovling 
// focusn on problem /
// focus on pr
