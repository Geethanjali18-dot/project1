package collectionspractice;

import java.util.Comparator;

public class ComImpl implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%10>o2%10)//last digit
			//if(o1%100>o2%100)//last 2 digits
			return 1;
		return -1;
	}
	

}
