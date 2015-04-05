import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

	List<Box> boxes;
	List<Person> people;
	Random rand;
	int numpass = 0;
	boolean allpass = true;

	public Game() {
		boxes = new ArrayList<Box>();
		people = new ArrayList<Person>();
		rand = new Random();
		genNumbers();

		for (Person p : people) {
			p.search(boxes);
			if (p.success) {
				numpass++;
			} else {
				allpass = false;
			}
		}

	}

	boolean getResult() {
		return allpass;
	}

	void genNumbers() {
		for (int i = 0; i < 100; i++) {
			people.add(new Person(i));
		}
		for (Person p : people) {
			boxes.add(new Box(p.number));
		}
		randomize();

	}

	void randomize() {
		List<Box> temp = new ArrayList<Box>();
		int index = 0;
		while (!boxes.isEmpty()) {
			index = rand.nextInt(boxes.size());
			temp.add(boxes.get(index));
			boxes.remove(index);
		}
		boxes = temp;
	}
}
