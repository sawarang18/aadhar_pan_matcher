package Ashwani_Project_Collection;

import java.util.HashMap;
import java.util.Map;

public class PanService {

    private static Map<String,Pan> panMap = new HashMap<>();
    static{
        panMap.put("ABCPA234567",new Pan("ABCPA234567",
                "1123456789","HDFC","Stock,ELS,FD"));
        panMap.put("ABCPA234568",new Pan("ABCPA234568",
                "1123456790","SBI","Stock,FD"));
    }

    public Pan getPanByAadharNumber(String aadhaarNumber){
        for(Pan pan : panMap.values()){
            if(pan.getAadharNumber().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }

}
