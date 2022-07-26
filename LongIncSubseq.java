package longestincreasingsubsequences;

public class LongIncSubseq {

			 public static void main(String[] args){

			 int[] Numbers = {1,14,7,32,67,44,91};
			 printLongIncSubseq(Numbers);
			 }
				public static void  printLongIncSubseq(int[] Numbers){
				String[] Path = new String[Numbers.length];
				int[] Size = new int[Numbers.length];

			for(int i=0; i<Numbers.length; i++){
				Size[i] = 1;
				Path[i] = Numbers[i] + " " ;
			}
			int MaxLen = 1; 

			for(int i=1; i<Numbers.length; i++){ 
				for(int j=0; j<Numbers.length; j++){

			if(Numbers[i]>Numbers[j] && Size[i] < Size[j] + 1){;
				Size[i] = Size[j] + 1;
				Path[i] = Path[j] + Numbers[i] + " "; 
				if(MaxLen < Size[i])
					MaxLen = Size[i];
				}
			   }
			}
			
			  for(int i=1; i<Numbers.length; i++){
			    if(Size[i] == MaxLen)
				System.out.println("The Longest Increasing Subsequences is " + Path[i]);
			  }
			 }
}

