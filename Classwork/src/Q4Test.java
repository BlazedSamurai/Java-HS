/*
 * Q4Test.java
 * Q42021
 */
public class Q4Test
{
	static int lastIndex = 0;
	
	public static void printArray(String[] a)
	{
		for(int i=0; i<a.length; i++){
			String currentData = a[i];
			System.out.print(currentData + " ");
		}
		System.out.println(" ");
	}
	
	public static String[] cloneAscending(String[] a)
	{
		String[] ascending = new String[a.length];
		for (int i=0; i<a.length; i++){
			ascending[i] = a[i];
		}
		return ascending;
	}

	public static String[] cloneDescending(String[] a){
		String [] descending = new String[a.length];
		for (int i=0; i<a.length; i++){
			descending[i] = a[i];
		}
		return descending;
	}

	
	public static boolean isFull(String[] a)
	{
		int counter = 0;
		for(int i =0; i<a.length; i++){
			if(a[i] != null){
				counter++;
			}
		}
		if(counter == a.length){
			return true;
		}
		return false;
	}
	
	public static void bubbleSort(String[] a)
	{
		int length = a.length-1;
		Boolean Elements_swapped = true;
		while (Elements_swapped==true){
			int J = 0;
			Elements_swapped = false;
			while (J<=length-1){
				if((a[J].compareTo(a[J+1])) < 0){
					String temp = a[J];
					a[J] = a[J+1];
					a[J+1] = temp;
					Elements_swapped=true;
				}
				J+=1;
			}
			length-=1;
		}
	}
	
	public static void selectionSort(String[] a)
	{
			int smallest_position =0;
			while (smallest_position<=(a.length-1)){
				int i = smallest_position;
				String smallest_element = a[i];
				int j = i+1;
				while (j<a.length){
					if (a[j].compareTo(smallest_element)<1){
						i=j;
						smallest_element = a[j];
					}
					j=j+1;
				}
				a[i] = a[smallest_position];
				a[smallest_position] = smallest_element;
				smallest_position +=1;
			}
		
	}
	
	
	public static int search(String[] a, String data)
	{
		for(int i=0; i<a.length; i++){
			if(a[i].equals(data)){
				return i;
			}
		}
		return -1;
	}
	
	public static void remove(String[] a, int indexToRemove)
	{

			for(int i = indexToRemove; i < lastIndex-1; i++)
			{
				a[i] = a[i+1];
			}
			lastIndex--;
			printArray(a);

	}
	
	public static boolean isSortedAsc(String[] a)
	{
		String[] comparison = cloneAscending(a);
		selectionSort(comparison);
		int counter = 0;
		for (int i=0; i<a.length; i++){
			if(a[i].equals(comparison[i])){
				counter++;
			}
		}
		if (counter == a.length){
			return true;
		}
		return false;
	}

	public static boolean isSortedDesc(String[] a)
	{
		String[] comparison = cloneDescending(a);
		bubbleSort(comparison);
		int counter = 0;
		for (int i=0; i<a.length; i++){
			if(a[i].equals(comparison[i])){
				counter++;
			}
		}
		if (counter == a.length){
			return true;
		}
		return false;
	}
	
	public static int isSorted(String[] a)
	{
		if(isSortedDesc(a)==true){
			return -1;
		}else if(isSortedAsc(a) == true){
			return 1;
	}else{
			return 0;
		}
	}
	
	public static void removeDuplicates(String[] a)
	{
		int[] indices = new int[500];
		for (int i=0; i<a.length; i++){
			for (int j =i+1; j<a.length; j++){
				if(a[i] == a[j]){
				}
			}
		}
	}
	
	public static void insert(String[] a, String data, int index)
	{
		if( isFull(a) == true )
			System.out.println("Error - array full");
		else {
			lastIndex++;
			for(int i = lastIndex-1; i > index; i--)
			{	a[i] = a[i-1];
				printArray(a);
			}
			a[index] = data;
		}
		printArray(a);
	}
	
	public static void insert(String[] a, String element)
	{

	}
	
	public static void main (String[] args)
	{
		String[] original = { "Abe", "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Gale", "Anne" };
		String[] ascending  = cloneAscending(original);
		String[] descending = cloneDescending(original);
		selectionSort(ascending);
		bubbleSort(descending);
		printArray(original);
		printArray(ascending);
		printArray(descending);
		lastIndex = original.length;
		System.out.println();
		System.out.println("Looking for Lester [-1]: " + search(ascending, "Lester"));
		System.out.println("Looking for anne   [-1]: " + search(ascending, "anne"));
		System.out.println("Looking for Anne   [2] : " + search(ascending, "Anne"));
		System.out.println("\noriginal array sorted [0]: " + isSorted(original));
		System.out.println("ascending array sorted [1]: " + isSorted(ascending));
		System.out.println("descending array sorted [-1]: " + isSorted(descending));
		System.out.println("\nRemoving first element from descending array");
		lastIndex = descending.length;
		remove(descending, 0);
		printArray(descending);
		lastIndex = ascending.length;
		System.out.println("\nRemoving Chuck [4] element from ascending array");
		remove(ascending, 4);
		/*System.out.println("\nRemoving duplicates from the ascending array");
		removeDuplicates(ascending);
		printArray(ascending);
		System.out.println("\nRemoving duplicates from the original array? ");
		removeDuplicates(original);
		System.out.println();*/
		System.out.println("Inserting Ivo into descending");
		insert(descending, "Ivo");
		System.out.println("Inserting Ives into ascending");
		insert(ascending, "Ives");
		System.out.println("\nInserting James into ascending");
		insert(ascending, "James");
		printArray(ascending);
		System.out.println("Inserting Aaron into ascending");
		insert(ascending, "Aaron");
		printArray(ascending);
		System.out.println("Inserting Ernesto into ascending");
		insert(ascending, "Ernesto");
		printArray(ascending);
	}
}

