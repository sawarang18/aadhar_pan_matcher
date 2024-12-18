package Ashwani_Project_Collection;

import java.util.Scanner;

public class PanAaadhaarMatcherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();
        System.out.println("Enter the number of your Aadhaar");
        String aadhaarNumber = sc.nextLine();

        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadharNumber(aadhaarNumber);
        if(aadhaar!=null && pan!=null){
            System.out.println("Aadhar Details :" + aadhaar);
            System.out.println("Pan Details :" + pan);
        }
        else{
            System.out.println("No Match Found");
        }

    }
}
