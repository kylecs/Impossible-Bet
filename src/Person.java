import java.util.List;

public class Person {
	int number;
	boolean success = false;
	int numtries = 0;

	public Person(int number) {
		this.number = number;
	}

	public void search(List<Box> boxes) {
		int cur = number;
		int temp;
		for (int i = 0; i < 50; i++) {
			temp = cur;

			if (boxes.get(cur).number == this.number) {
				success = true;
				numtries = i;
				return;
			}
			cur = boxes.get(temp).number;

		}

	}
}
