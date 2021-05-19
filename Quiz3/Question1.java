package Quiz3;

import java.util.*;

/*
 * Write a randUpdate method that takes a HashMap<Integer, Integer>,
 * 
 *  randomly chooses an entry, 
 * and changes the value randomly to some other integer that is chosen randomly. 
 * You have to make 
 * sure after this procedure, only one value changes, but the size of the HashMap and all keys 
 * remain the same. 

Only provide the contents of the randUpdate method.
 */

public class Question1 {

    public static void main(String[] args){

        HashMap<Integer, Integer> myHash = new HashMap<Integer, Integer>();

        myHash.put(234,42);
        myHash.put(31,231);
        myHash.put(35,4);
        myHash.put(22,634);
        myHash.put(12,2);

        randUpdate(myHash);

    }


    public static void randUpdate(HashMap<Integer, Integer> hash){  // Keyset: 234 31 35 22 12
                                                                    // Valset: 42  231 4 634 2

        System.out.println("First Hash: \n" + hash);

        Random random = new Random();
        int randomKeyIndex = random.nextInt(hash.keySet().size());
        
        int[] keys = new int[hash.keySet().size()];
        int i = 0;
        
        for(int x :hash.keySet() ) {
        	keys[i] = x;
        	i++;
        }
        
        hash.replace(keys[randomKeyIndex], random.nextInt(10000));
        
        System.out.println("Final Hash: \n" + hash);

    }
}
