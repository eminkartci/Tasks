

/*
 * Provide a class named die, that has to use a Random object as shown below and has two methods: 

 * one that returns the outcome for a die roll, 
 * and one that returns the last time each value appears 
 * among a given number of rolls in a HashMap. I should be able to do the following: 

Random random = new Random();
Die die = new Die(random);
int outcome = die.roll(); // outcome becomes 1,2,3,4,5, or 6.
HashMap<Integer, Integer> lasts = die.lastTime(10) 
// suppose random outcomes are 3, 4, 1, 3, 4, 2, 4, 4, 3, 1. 
// Then lasts HashMap would be <key:1,value:10>, <key:2,value:6>, <key:3,value:9>, <key:4,value:8>. 
Only provide the contents of the die class.
 */

public class Question2 {

    public static void main(String[] args) {
		
		
		Random random = new Random();
		Die die = new Die(random);
		int outcome = die.roll(); // outcome becomes 1,2,3,4,5, or 6.
		HashMap<Integer, Integer> lasts = die.lastTime(10);
		System.out.println(lasts);
		
		// suppose random outcomes are 3, 4, 1, 3, 4, 2, 4, 4, 3, 1. 
		// Then lasts HashMap would be <key:1,value:10>, <key:2,value:6>, <key:3,value:9>, <key:4,value:8>. 
		//Only provide the contents of the die class.
	}
	


    
}

class Die{

    Random random ;
    int lastIndex = 0;
    
    public Die(Random random) {
    	this.random = random;
    }

    public int roll(){

        return random.nextInt(6) + 1;

    }

    public HashMap<Integer, Integer> lastTime(int count){

        lastIndex = 0;
        int result = 0;

        HashMap<Integer, Integer> lastValues = new HashMap<Integer, Integer>();
        
        for( int i = 0 ; i < count ; i++){

        	result  = roll();
        	if(lastValues.keySet().contains(result)){
                lastValues.replace(result,lastIndex);
            }else{
                lastValues.put(result,lastIndex);
            }
            lastIndex++;

        }

        

        return lastValues;

    }


}

