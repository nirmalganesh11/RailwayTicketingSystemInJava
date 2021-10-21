package Fullclassespackage;

public class Allclassdetailsinformation {
	

	public  String computetrains(String from,String dest, boolean sup ) {
		
		
		String []superfast = new String [4];
		superfast [0]= "11234/sup1/Chennai/Visakapatnam";
		superfast[1]="12567/sup2/Chennai/Hyderabad";
		superfast[2]="18965/sup3/Chennai/Vijayawada";
		String express[]=new String[7];
		express[0]="exp1/Guntur/Visakapatnam/Ongole";
		express[1]="exp2/Chennai/Chittor/Nellore";
		express[2]="exp3/Nellore/Kurnool/Guntur";
		express[3]="exp4/Warrangal/Hyderabad/Vijayawada";
		
	    express[4]="exp5/Visakapatnam/Vijayawada/Guntur";
	     
	    express[5]="exp6/Chennai/Kurnool/Ongole";
	    
	    express[6]="exp7/Kurnool/Ongole/Hyderabad";
	    
		System.out.println(from+dest);
	    if(sup) {
	    	for(int i=0;i<3;i++) {
	    		int flag=0;
	    		String ar[] =superfast[i].split("/");
	    		for(String w:ar) {
	    			
	    			if(w.equalsIgnoreCase(from)) {
	    				flag++;
	    			}
	    			if(w.equalsIgnoreCase(dest)) {
    				  flag++;
    				}
	    		}
	    		if(flag==2) {
	    			return superfast[i];
	    			
	    		}
	    		else {
	    		 flag=0;
	    		}
	    		
	    		
	    	}
	    }
	    else {
	    	
	    	for(int i=0;i<7;i++) {
	    		int flag=0;
	    		String ar[] =express[i].split("/");
	    		for(String w:ar) {
	    			
	    			if(w.equalsIgnoreCase(from)) {
	    				
	    				flag++;
	    			}
	    			if(w.equalsIgnoreCase(dest)) {
	    				
    				  flag++;
    				}
	    		}
	    		if(flag==2) {
	    			return express[i];
	    			
	    		}
	    		else {
	    		 flag=0;
	    		}
	    		System.out.println(flag);
	    		
	    		
	    	}
	    	
	    }
	   
	    return"";
		
	}
	
}
