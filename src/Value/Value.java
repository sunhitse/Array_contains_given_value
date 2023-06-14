package Value;

import java.util.Arrays;
 
class Value {
 
    private static void check(Integer[] arr, int toCheckValue)
    {
        
        boolean test
            = Arrays.asList(arr)
                  .contains(toCheckValue);
 
        System.out.println("Is " + toCheckValue
                           + " present in the array: " + test);
    }
 
    public static void main(String[] args)
    {
 
        Integer arr[] = { 10,20,30,40 };
 
        
        int toCheckValue = 50;
 
        
        System.out.println("Array: "
                           + Arrays.toString(arr));
 
        
        check(arr, toCheckValue);
    }
}
