public class Array_Challenge_1 {
    public static void main(String args[]){
        int[] ArrayOfInts = { 9,8,7,6,5,4,3,2,1 };
        int[] ArrayOfIntsCopy = ArrayCopier(ArrayOfInts);
        System.out.print("Copy of ArrayOfInts: ");
        ArrayCounter(ArrayOfIntsCopy);
        int[] ArrayOfIntsReversed = ArrayReverser(ArrayOfInts);
        System.out.print("Reversed ArrayOfInts: ");
        ArrayCounter(ArrayOfIntsReversed);
        int[] ArrayOfIntsFirstAndLast = FirstAndLast(ArrayOfInts);
        System.out.print("First and last elements of ArrayOfInts: ");
        ArrayCounter(ArrayOfIntsFirstAndLast);
        int Sum = SumOfArray(ArrayOfInts);
        System.out.println("Sum of numbers in ArrayOfInts: " + Sum);
        int OddCount = OddCounter(ArrayOfInts);
        System.out.println("Number of odd numbers in ArrayOfInts: " + OddCount);
        boolean IdenticalCheck = IdenticalChecker(ArrayOfInts,ArrayOfIntsReversed);
        System.out.println("ArrayOfInts and ArrayOfIntsReversed check for identical elements and order: " + IdenticalCheck);
        int val1 = 1;
        int ValCheck = Numberchecker(ArrayOfInts, val1);
        System.out.println("Number of instances of val1 in ArrayOfInts: " + ValCheck);
        int SecondLarge = SecondLargest(ArrayOfInts)[1];
        System.out.println("Second largest value in ArrayOfInts: " + SecondLarge);
        int RemovalInt = 7;
        int[] PackedArray = ArrayPacker(ArrayOfInts, RemovalInt);
        System.out.print("Packed Array when " + RemovalInt + " is removed:");
        ArrayCounter(PackedArray);
    }
    static void ArrayCounter(int[] array) {
        for(int i =0; i<array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.print("|" + "\n");
    }
    static int[] ArrayCopier(int[] array) {
        int[] CopiedArray = new int[array.length];
        for(int i = 0; i<array.length; i++){
            CopiedArray[i] = array[i];
        }
        return CopiedArray;
    }
    static int[] ArrayReverser(int[] array) {
        int[] ReversedArray = new int[array.length];
        for(int i=array.length-1; i>=0; i--) {
            ReversedArray[array.length-i-1] = array[i];
        }
        return ReversedArray;
    }
    static int[] FirstAndLast(int[] array) {
        int[] FirstAndLastOfArray = new int[2];
        FirstAndLastOfArray[0] = array[0];
        FirstAndLastOfArray[1] = array[array.length-1];
        return FirstAndLastOfArray;
    }
    static int SumOfArray(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
    return sum;
    }
    static int OddCounter(int[] array) {
        int OddCount = 0;
        for(int i = 0; i<array.length; i++) {
            if(array[i] % 2 == 1) {
                OddCount+=1;
            }
        }
        return OddCount;
    }
    static boolean IdenticalChecker(int[] array1, int[] array2) {
        boolean TrueStatus = true;
        if(array1.length!=array2.length){
            TrueStatus=false;
            return TrueStatus;
        }
        for(int i=0; i<array1.length; i++) {
            if(array1[i]!=array2[i]){
                TrueStatus=false;
                return TrueStatus;
            }
        }
        return TrueStatus;
    }
    static int Numberchecker(int[] array, int val1){
        int Valcheck = 0;
        for(int i=0; i<array.length; i++){
            if(val1==array[i]){
                Valcheck++;
            }
        }
        return Valcheck;
    }
    static int[] SecondLargest(int[] array){
        int[] ArraySorter = new int[array.length];
        for(int i=0; i<array.length;i++){
            for(int j = 0; j<ArraySorter.length; j++){
                if(array[i] > ArraySorter[j]){
                    ArraySorter[array.length-1] = ArraySorter[array.length-2];
                    for(int h= array.length-2; h>=j; h--){
                        ArraySorter[h+1]=ArraySorter[h];
                    }
                    ArraySorter[j] = array[i];
                    break;
                }
            }
        }
        return ArraySorter;
    }
    static int[] ArrayPacker(int[] array, int removedElement){
        for(int i = 0; i< array.length; i++){
            if(array[i] == removedElement){
                for(int j=i; j< array.length-1; j++){
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
                break;
            }
        }
        return array;
    }
}
