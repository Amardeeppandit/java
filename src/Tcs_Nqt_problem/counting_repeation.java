package Tcs_Nqt_problem;

import java.util.HashMap;
import java.util.Map;

public class counting_repeation {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 5, 4, 3, 5, 3, 4, 5};
        Return_count(arr);

    }
    public static void Return_count(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer , Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
