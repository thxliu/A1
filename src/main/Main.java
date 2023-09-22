package src.main;


import java.util.ArrayList;
import java.util.List;

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

    public float sum(float[] arr, int lo, int hi){
        float total = 0f;
        if (arr.length == 0){
            total = 0f;
            return total;
        }
        else{
            for (int index = lo; index < (hi-1); index++){
            total +=arr[index];
        }
            return total;
        }
        
    }

    public float mean(float[] arr, int lo, int hi){
        float total = 0f;
        if (arr.length == 0){
            total = 0f;
            return total;
        }
        else{
            for (int index = lo; index < (hi-1); index++){
            total +=arr[index];
        }
        total = total/arr.length;
        return total;
        }
       
    } 

    public Float min(float[] arr, int lo, int hi){
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
            for (int index = lo; index < (hi-1); index++){
                if(minNum > arr[index]){
                    minNum = arr[index];
                    return minNum;
                }
            }
        }
        return minNum;
    }

    public Float max(float[] arr, int lo, int hi){
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
            for (int index = lo; index < (hi-1); index++){
                if(maxNum < arr[index]){
                    maxNum = arr[index];
                    return maxNum;
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        
    }


}

