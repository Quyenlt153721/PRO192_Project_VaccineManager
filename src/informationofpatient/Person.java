
package informationofpatient;

public class Person {
    protected  String name;
    protected int Age;
    protected String Sex;
    protected String Address;
    protected int PhoneNumber;
   

    public Person() {
    }

    public Person(String name, int Age, String Sex, String Address, int Phone) {
        this.name = name;
        this.Age = Age;
        this.Sex = Sex;
        this.Address = Address;
        this.PhoneNumber = Phone;
      
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

    public int getPhone() {
        return PhoneNumber;
    }

    public void setPhone(int Phone) {
        this.PhoneNumber = Phone;
    }

 
    @Override
    public String toString() {
        return  name + ", " + Age + ", " + Sex + ", " + Address + ", " + PhoneNumber ;
    }
    
}
