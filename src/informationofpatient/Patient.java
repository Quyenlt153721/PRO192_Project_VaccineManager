
package informationofpatient;

public class Patient extends Person{
    private String ID;//Id thẻ bảo hiểm y tế
    private String Benhlynen;//thông tin bệnh lí nền
    private boolean daTiemMui_1;
    private boolean daTiemMui_2;
    
    public Patient() {
        super();
    }

    public Patient( String name, int Age, String Sex, String Address, String Phone,String ID) {
        super(name, Age, Sex, Address, Phone);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        return "Patient{" + "ID=" + ID + '}';
    }
    
    
}
