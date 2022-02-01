import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list=new ArrayList<Person>();
Person one=new Person(19,"Saqib");
Person two=new Person(43,"Ramzan");
Person three=new Person(14,"Ramiz");
Person four =new Person(17,"Afzal");
Person five =new Person(25,"Dabeer");
Person six=new Person(21,"Basit");
Person seven =new Person(23,"Emraan");
list.add(one);
list.add(four);
list.add(two);
list.add(three);
list.add(five);
list.add(six);
list.add(seven);
 Collections.sort(list,new COMP());
 for(int i=0;i<list.size();i++) {
	 Person e=(Person) list.get(i);
	 System.out.println(e.getName());
 }

	}

}
