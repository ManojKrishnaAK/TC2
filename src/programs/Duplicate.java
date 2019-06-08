package programs;

	import java.util.*;
	
	public class Duplicate {	
			public static int[] removeDup(int []list) {
			
				Set<Integer> dup = new HashSet<Integer>();
				
				for(int i=0;i<list.length;i++) {
					if(dup.add(list[i]));
					System.out.println(list[i]);
					
				}
				return list;	
			}
			public static void main(String[] args) {
				int[] list= {1,1,2,2,3};
				removeDup(list);
				
			}
		}

