
public class FindSubStringStartAndEnd {

	//find subString in order with start index as vowel and end as conso 
	//and print 1st and last substring of that valid list
	public static void findSubString(String x){
		char[] arr = x.toCharArray();
		char[] vowel = {'a','e','i','o','u'};
		char[] conso = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		boolean vowelFind = false;
		int a=0;
		int b=0;
		int c=0;
		int bestStart = 0;
		int bestEnd = 0;
		int i= 0;
		int shortest = Integer.MAX_VALUE;
		for(i=0;i<arr.length;i++){
			for(int j=0;j<vowel.length;j++){
				if(arr[i]==vowel[j]){
					if(!vowelFind){
						a=i;b=i;
						vowelFind = true;
					}
				}
			}
			
			for(int k=0;k<conso.length;k++){
				if(arr[i]==conso[k]){
					if(vowelFind){
						c=i;
						vowelFind = false;
						if(c-a<shortest){
							bestStart = a;
							bestEnd = c;
							shortest = c-a;
						}
					}
				}
			}
		}
		
		System.out.println("1st string:"+x.substring(bestStart, bestEnd+1));
		System.out.println("1st string:"+x.substring(c-1, i));
		
	}
	
	public static void main(String[] args) {
		findSubString("abc");
	}
	
}
