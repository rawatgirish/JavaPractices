package GoldManSachs;

import java.util.HashMap;
import java.util.Map;

/**
 * @author girish.rawat
 * 
 *   //s = 9, 10, 12, 9, 18, 19, 20
  //f = 11, 11, 13, 18, 20, 21, 21
  // minofS = 9
  // maxofF = 21
  // pairs : [9,11],[10,11],[12,13],[9,18],[18,20],[19,21],[20-21]
  // 
  // 
  /*
  9-21{
  11-9 > 18-9 {
  count++;
  meetingEnd = 11;
  }
  if(loop >= 11) {
  
  }
  }
  */
  
public class MaximumMeetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  private int getMaxMeetig(int[] s, int[] f) {
		  int minofS = 0;
		  int maxofF = 0;
		  Map<Integer,Integer> meetingsMap = new HashMap<>();
		  for(int i =0;i<s.length;i++) {
		    if(s[i] < minofS) {
		      minofS = s[i];
		    }
		    if(f[i] > maxofF) {
		      maxofF = f[i];
		    }
		    if(meetingsMap.containsKey(i)){
		    }
		    if(meetingsMap.get(i) > f[i]) {
		     meetingsMap.put(s[i],f[i]); 
		    }
		    
		  }
		  
		  
		  
		  
		  int meetingEnd;
		  int meetingAttended;
		  for(int j= minofS; j<=maxofF; j++) {
		    
		    if(meetingsMap.containsKey(j)) {
		      if((meetingsMap.get(j)-j) > meetingsMap.get(j))
		      meetingEnd = meetingsMap.get(j);
		    }
		    
		  }
		  
		  return 0;

		}

}
