package Ashwani_Project_Collection;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String,Aadhaar> aadharMap = new HashMap<>();
    static {
        aadharMap.put("1123456789", new Aadhaar("1123456789",
                "Shreyash", "Arvind", "Mumbai"));
        aadharMap.put("1123456790", new Aadhaar("1123456790",
                "Shravani", "Arvind", "Mumbai"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadharMap.get(aadhaarNumber);
    }


}


