
public class Insertion {
int []arr;
int length;

public Insertion() {
	arr=new int[1];
	length=0;
}

	public void insert(int a) { 
		
         arr[length]=a;
       //  System.out.println(arr[length]);
        
         int[] temp=new int[arr.length];
         
         for(int i=0;i<arr.length;i++) {
        	 temp[i]=arr[i];
         }
         //System.out.println(temp[length]);
         length++;
         arr=new int[length+1];
         for(int i=0;i<arr.length-1;i++) {
        	 arr[i]=temp[i];
         }
         
        
    }  
	private static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    } 
	public void getSorted() {
		insertionSort(arr);
		
		//return arr;
		
	}
	public void display() {
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}
