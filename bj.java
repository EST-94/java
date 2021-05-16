import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj { //14003 //
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	StringTokenizer st = new StringTokenizer(br.readLine());
	ArrayList<Integer> distinctarr = new ArrayList<Integer>();

	System.out.println("ur arrnum");
	int arrnum = Integer.parseInt(br.readLine());
	int arr [] = new int [arrnum];
	System.out.println("arr done");
	
//	for (int i = 0; i < arr.length; i++) {
//		int innernum = Integer.parseInt(br.readLine());
//		arr[i] = innernum;
//	}
	String innernum = br.readLine();
	
	for (int i = 0; i < arr.length; i++) {
		String [] split = innernum.split(" ");
		arr[i] = Integer.parseInt(split[i]);
	}
	
	Arrays.sort(arr);
	
	for (int a = 0; a < arr.length; a++) { 
		if(!distinctarr.contains(arr[a])) {
			distinctarr.add(arr[a]);
		}
	}
	int diffs [] = new int [distinctarr.size()-1];
	
	for (int b = 0; b < diffs.length; b++) {
		int adddiffs = 0;
		adddiffs = distinctarr.get(b+1) - distinctarr.get(b);
		diffs[b] = adddiffs;
	}
	
	int maxdiff = diffs[0];
	int maxloc = 0;
	
	for (int c = 0; c < diffs.length; c++) {
		if(diffs[c] >= maxdiff) {
			maxdiff = diffs[c];
			maxloc = c + 2;
		}
	}
	System.out.println(maxloc);
	System.out.println(distinctarr);
}
}
