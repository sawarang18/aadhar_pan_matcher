package Ashwani_Project_Collection;

public class Aadhaar {

    private String aadharNumber;

    private String aadharName;

    private String fatherName;

    private String address;

    public Aadhaar(String aadharNumber, String aadharName, String fatherName, String address) {
        this.aadharNumber = aadharNumber;
        this.aadharName = aadharName;
        this.fatherName = fatherName;
        this.address = address;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getAadharName() {
        return aadharName;
    }

    public void setAadharName(String aadharName) {
        this.aadharName = aadharName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Aadhaar{" +
                "aadharNumber='" + aadharNumber + '\'' +
                ", aadharName='" + aadharName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
