import java.util.ArrayList;
import java.util.List;


public class Analysis {
	static int NUM_TEST_SET = 10000;
	static int NUM_SET = 1000;
	public static void main(String[] args){
		List<Float> results = new ArrayList<Float>();
		for(int i = 0; i < NUM_SET; i++){
			results.add(runset(i));
		}
		
		float highest = 0;
		float lowest = 100;
		float average = 0;
		float maxdev = 0;
		float sum = 0;
		for(Float f: results){
			sum += f;
		}
		average = sum / NUM_SET;
		for(Float f: results){
			if(f > highest){
				highest = f;
			}
			if(f < lowest){
				lowest = f;
			}
		}
		float devup = highest - average;
		float devdown = Math.abs(lowest - average);
		maxdev = Math.max(devup, devdown);
		
		System.out.println("FINISHED");
		System.out.println("Avg: " + average +"%" + "  Highest: " + highest +"%" + "  Lowest: " + lowest +"%" + "  Maximum deviation: " + maxdev + "%");
		
		
	}
	static float runset(int id){
		int numpass = 0;
		int numfail = 0;
		
		
		
		
		
		Game temp;
		for(int i = 0; i < NUM_TEST_SET; i++){
			temp = new Game();
			if(temp.getResult()){
				numpass++;
			}else{
				numfail++;
			}
		}
		
		
		float percent = ((float )numpass / (float) NUM_TEST_SET) * 100;
		System.out.println("Finished set " + id + "  :  Success:  " + percent + "%" );
		return percent;
		
	}
}
