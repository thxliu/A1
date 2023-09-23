package a1;
//import java.util.ArrayList;
//import java.util.List;

public class Main {
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

