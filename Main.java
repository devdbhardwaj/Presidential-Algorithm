import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		int elements;
		int theelement = 0;
		elements = input.nextInt();
		
		ArrayList<Integer> candidates = new ArrayList<Integer>();
		
		for(int index = 0; index < elements; index++){
			theelement += 1;
			candidates.add(theelement);
		}
		
		candidates = remove(candidates,1,1);
	}
	
	public static ArrayList<Integer> remove(ArrayList<Integer> candidates, int theindex, int thecounter){
		int counter = thecounter;
		
		for(int index = theindex; index < candidates.size(); index++){
			counter += 1;
		
			if(counter == 3){
				
				if(index == 0){
					candidates.remove(1);
					System.out.print(index + " " + counter + " ");
					for(int element = 0; element<candidates.size();element++){
						System.out.print(candidates.get(element));
					}
					System.out.println();
					return candidates;
				}
				candidates.remove(index);
				System.out.print(index + " " + counter + " ");
				for(int element = 0; element<candidates.size();element++){
					System.out.print(candidates.get(element));
				}
				System.out.println();
				counter = 1;
			}		
		}
		if(candidates.size() != 1){
			remove(candidates, 0, counter);
		}
	
		return candidates;
	}
}

