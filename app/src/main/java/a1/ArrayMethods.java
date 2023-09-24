package a1;

/**
 * A series of methods to do basic mathematical calculations 
 */
public class ArrayMethods {

    /**
     * Calculates the sum of the numbers in a given array 
     * @param arr array of type Float containing the values
     * @return the sum of the array 
     */
    public static float WholeSum(float[] arr){
        float total = 0f;
         if (arr.length == 0){
            total = 0f;
            return total;
        }
        else{
            for (int i = 0; i < arr.length; i++){ //should we use iterator
            total += arr[i];
        }
            return total;
        }
    }

    /**
     * Calculates the sum of the values within an array bounded by a given maximum and minimum index  
     * @param arr array of type Float containing the values
     * @param lo the lowest bounding index
     * @param hi the highest bounding index
     * @return the sum of the values in the bounded array
     */
    public static float sum(float[] arr, int lo, int hi){
        float total = 0f;
        if (arr.length == 0){
            total = 0f;
            return total;
        }
        else{
            for (int index = lo; index < (hi); index++){
            total +=arr[index];
        }
            return total;
        }
        
    }

    /**
     * Calculates the sum of an index assuming that the lowest bound is 0 and the highest bound is the lenght of the array
     * @param arr array of type Float containing the values
     * @return the sum of the array 
     */
    public static float sum(float[] arr){
        float total = 0f;
        if (arr.length == 0){
            total = 0f;
            return total;
        }

        else{
            for (int index = 0; index < (arr.length); index++){
                total +=arr[index];
            }
            return total;
        }
    }

    /**
     * Calculates the mean of the values  within an array bounded by a given maximum and minimum index  
     * @param arr array of type Float containing the values
     * @param lo the lowest bounding index
     * @param hi the highest bounding index
     * @return the mean of the values in the bounded array 
     */
    public static float mean(float[] arr, int lo, int hi){
        float total = 0f;
        if (arr.length == 0){
            total = 0f;
            return total;
        }

        else{
            for (int index = lo; index < hi; index++){
                total += arr[index];
            }
            return (total/(hi-lo));
        }

    } 

    /**
     * Calculates the mean of an array 
     * @param arr array of type Float containing the values 
     * @return the mean of the array 
     */
    public static float mean(float[] arr){
        float total = 0f;
        if (arr.length == 0){
            total = 0f;
            return total;
        }

        else{
            for (int index = 0; index < arr.length; index++){
                total += arr[index];
            }
            return (total/(arr.length));
        }

    } 


    /**
     * Returns the lowest value of an array bounded by a given maximum and minimum index  
     * @param arr array of type Float containing the values 
     * @param lo lowest bounding index
     * @param hi highest bounding index
     * @return lowest value of the bounded array 
     */
    public static Float min(float[] arr, int lo, int hi){
        float minNum = arr[lo];
        if (arr.length == 0){
            minNum = Float.NaN;
            return minNum;
        }
        else if (lo == 0 & hi == 0){
              minNum = Float.NaN;
                return minNum;
        }
        else{
            for (int index = lo; index < (hi); index++){
                if(minNum > arr[index]){
                    minNum = arr[index];
                    return minNum;
                }
            }
        }
        return minNum;
    }

    /**
     * Returns the lowest value of an array 
     * @param arr array of type Float containing the values
     * @return lowest value of the array 
     */
    public static Float min(float[] arr){

        if (arr.length == 0){
            float minNum = Float.NaN;
            return minNum;
        }
        else{
            float minNum = arr[0];
            for (int index = 0; index < (arr.length); index++){
                if(minNum > arr[index]){
                    minNum = arr[index];
                    return minNum;
                }
            }
            return minNum;
        }
    }

    /**
     * Returns the highest value of an array bounded by a given maximum and minimum index  
     * @param arr array of type Float containing the values
     * @param lo lowest bounding index 
     * @param hi highest bounding index
     * @return the highest value of the bounded array 
     */
    public static Float max(float[] arr, int lo, int hi){
        float maxNum = arr[lo];
        if (arr.length == 0){
            maxNum = Float.NaN;
            return maxNum;
        }
        else if (lo == 0 & hi == 0){
              maxNum = Float.NaN;
                return maxNum;
        }
        else{
            for (int index = lo; index < (hi); index++){
                if(maxNum < arr[index]){
                    maxNum = arr[index];
                    return maxNum;
                }
            }
        }
        return maxNum;
    }

    /**
     * Returns the highest value of an array
     * @param arr array of type Float containing the values 
     * @return the highest value of the array 
     */
    public static Float max(float[] arr){
        if (arr.length == 0){
            float maxNum = Float.NaN;
            return maxNum;
        }
        else{
            float maxNum = arr[0];
            for (int index = 0; index < (arr.length); index++){
                if(maxNum < arr[index]){
                    maxNum = arr[index];
                    return maxNum;
                }
            }
            return maxNum;
        }
    }


}

