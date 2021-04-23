/* Sorting algorithms formative assessment
 *
 * Student Name: Balaji Adithya Narayanan
 *
 * April/2021
 *
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 *
 * Also check https://visualgo.net/en/sorting
 */
public class SorterClass
{
    public static void printArray(int[] array)
    {
        for( int e: array )
        {	System.out.print( e + " " );
        }
        System.out.println();
    }

    public static int[] clone(int[] array) // returns a copy of array
    {
        if(array.length == 0) return null;
        int[] copy = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        return copy;
    }

    static void bubble(int[] a)
    {
        int length = a.length-1;
        Boolean Elements_swapped = true;
        while (Elements_swapped==true){
            int J = 0;
            Elements_swapped = false;
            while (J<=length-1){
                if(a[J] > a[J+1]){
                    int temp = a[J];
                    a[J] = a[J+1];
                    a[J+1] = temp;
                    Elements_swapped=true;
                }
                J+=1;
            }
            length-=1;
        }
    }

    public static void selection(int[] a)
    {
        int smallest_position =0;
        while (smallest_position<=(a.length-1)){
            int i = smallest_position;
            int smallest_element = a[i];
            int j = i+1;
            while (j<a.length){
                if (a[j] < smallest_element){
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

    // a couple of ways to visualise the insertion sort:
    // https://youtu.be/OGzPmgsI-pQ
    // https://youtu.be/JU767SDMDvA
    public static void insertion(int[] a)
    {
        int i = 1;
        while (i<a.length){
            int j=i;
            while (j>0 && a[j-1] > a[j]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j = j-1;
            }
            i +=1;
        }
    }

    // No need to modify the main method.
    public static void main(String[] args)
    {
        int[] original = { 7,9,6,8,1,3,5,2,4 };
        int[] array = clone(original);
        System.out.println("Original array");
        printArray(original);

        System.out.println("\nBubble sort");
        bubble( array );
        printArray(array);
        System.out.println();

        System.out.println("\nSelection sort");
        array = clone(original);
        selection( array );
        printArray(array);

        System.out.println("\nInsertion sort");
        array = clone(original);
        insertion( array );
        printArray(array);

    }
}
