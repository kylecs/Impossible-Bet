import java.util.List;


public class Person {
	int number;
	boolean success = false;
	int numtries = 0;
	public Person(int number){
		this.number = number;
	}
	
	public void search(List<Box> boxes){
		int cur = number;
		int temp;
		for(int i = 0; i < 50; i++){
			temp = cur;
			//System.out.println("Person: " + number + " : Iteration: " + i + " : Box: " + cur);
			//System.out.println(cur + " --> " + boxes.get(cur).number);
			if(boxes.get(cur).number == this.number){
				//System.out.println("Person: " + this.number + " : Iteration: " + i + " : Box: " + boxes.get(cur).number);
				success = true;
				numtries = i;
				return;
			}
			cur = boxes.get(temp).number;
			
		}
		
		
	}
}
