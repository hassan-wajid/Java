import java.util.*;
public class COMP implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getName().charAt(0)==o2.getName().charAt(0)) {
			return 0;
		}else if(o1.getName().charAt(0)>o2.getName().charAt(0)) {
			return 1;
		}
		else return -1;
		
	}

}
