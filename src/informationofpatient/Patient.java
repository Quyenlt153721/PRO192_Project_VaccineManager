
package informationofpatient;

public class Patient extends Person{
    private int ID;//Id thẻ bảo hiểm y tế
    private boolean daTiemMui_1;
    private boolean daTiemMui_2;
    
    public Patient() {
        super();
    }

    public Patient( String name, int Age, String Sex, String Address, int Phone,int ID) {
        super(name, Age, Sex, Address, Phone);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isDaTiemMui_1() {
        return daTiemMui_1;
    }

    public void setDaTiemMui_1(boolean daTiemMui_1) {
        this.daTiemMui_1 = daTiemMui_1;
    }

    public boolean isDaTiemMui_2() {
        return daTiemMui_2;
    }

    public void setDaTiemMui_2(boolean daTiemMui_2) {
        this.daTiemMui_2 = daTiemMui_2;
    }

  

    @Override
    public String toString() {
        return "Patient{" + "ID=" + ID + ", daTiemMui_1=" + daTiemMui_1 + ", daTiemMui_2=" + daTiemMui_2 + '}';
    }

   
    
    
}
