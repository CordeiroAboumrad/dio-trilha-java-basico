package challenges;

import java.util.ArrayList;

public class CanConvert {
	public static boolean canConvertString(String s, String t, int k) {
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] sChar = new char[s.length()];
		char[] tChar = new char[s.length()];
		ArrayList<Integer> totalDifference = new ArrayList<>();
		int difference, positionS, positionT;
		
        if(t.length() != s.length())
        	return false;
        
		for(int i = 0; i < s.length(); i++) {
        	positionS = new String(alphabet).indexOf(s.charAt(i));
        	positionT = new String(alphabet).indexOf(t.charAt(i));
        	
        	difference = 0;
        	if(positionS < positionT) {
        		difference = positionT - positionS;
        		while(totalDifference.contains(difference) && difference <= k) {
	        		difference += 26;
        		}
        		totalDifference.add(difference);
        	} else if(positionS > positionT) {
        		difference = alphabet.length - (positionS - positionT);
        		while(totalDifference.contains(difference) && difference <= k) {
        			difference += 26;
        		}
        		totalDifference.add(difference);
        	}
        	
        	
        	totalDifference.remove(Integer.valueOf(i));
        	if(totalDifference.isEmpty())
        		return true;
        }
        
//        System.out.println(totalDifference.size());
//        totalDifference.forEach(number -> System.out.println(number));
        for(int m = 0; m <= k; m++) {
        	totalDifference.remove(Integer.valueOf(m));
        	if(totalDifference.isEmpty())
        		return true;
        }
        
        return false;
    }
}
