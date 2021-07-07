
package informationofpatient;

import java.time.LocalDate;

public class Patient extends Person{
    private int ID;//Id thẻ bảo hiểm y tế
    private int soLantiem;
    private LocalDate ngayTiemGanNhat;
    
    public Patient() {
        super();
    }

    public Patient( String name, int Age, String Sex, String Address, String Phone,int ID, int soLantiem, LocalDate ngayTiemGanNhat) {
        super(name, Age, Sex, Address, Phone);
        this.ID = ID;
        this.soLantiem = soLantiem;
        this.ngayTiemGanNhat = ngayTiemGanNhat;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSoLantiem() {
        return soLantiem;
    }

    public void setSoLantiem(int soLantiem) {
        this.soLantiem = soLantiem;
    }

    public LocalDate getNgayTiemGanNhat() {
        return ngayTiemGanNhat;
    }

    public void setNgayTiemGanNhat(LocalDate ngayTiemGanNhat) {
        this.ngayTiemGanNhat = ngayTiemGanNhat;
    }

    @Override
    public String toString() {
        return name + ", " + Age + ", " + Sex + ", " + Address + ", " + PhoneNumber+ " ," + ID + ", " + soLantiem + ", " + ngayTiemGanNhat ;
    }


   
    
    
}
