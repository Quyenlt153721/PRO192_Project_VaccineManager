/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informationofpatient;

/**
 *
 * @author DELL
 */
public class KhamSangloc extends Patient{
    private boolean ho;
    private boolean sot;
    private int huyetAp;
    private boolean Suy_Giam_MD;
    private boolean ungthu;
    private boolean ViemGan;
    private boolean sd_khangSinh;

    public KhamSangloc() {
        super();
    }

    public KhamSangloc(String name, int Age, String Sex, String Address, int Phone, int ID,boolean ho, boolean sot, int huyetAp, boolean Suy_Giam_MD, boolean ungthu, boolean ViemGan, boolean sd_khangSinh) {
        super(name, Age, Sex, Address, Phone, ID);
        this.ho = ho;
        this.sot = sot;
        this.huyetAp = huyetAp;
        this.Suy_Giam_MD = Suy_Giam_MD;
        this.ungthu = ungthu;
        this.ViemGan = ViemGan;
        this.sd_khangSinh = sd_khangSinh;
    }

    public boolean isHo() {
        return ho;
    }

    public void setHo(boolean ho) {
        this.ho = ho;
    }

    public boolean isSot() {
        return sot;
    }

    public void setSot(boolean sot) {
        this.sot = sot;
    }

    public int getHuyetAp() {
        return huyetAp;
    }

    public void setHuyetAp(int huyetAp) {
        this.huyetAp = huyetAp;
    }

    public boolean isSuy_Giam_MD() {
        return Suy_Giam_MD;
    }

    public void setSuy_Giam_MD(boolean Suy_Giam_MD) {
        this.Suy_Giam_MD = Suy_Giam_MD;
    }

    public boolean isUngthu() {
        return ungthu;
    }

    public void setUngthu(boolean ungthu) {
        this.ungthu = ungthu;
    }

    public boolean isViemGan() {
        return ViemGan;
    }

    public void setViemGan(boolean ViemGan) {
        this.ViemGan = ViemGan;
    }

    public boolean isSd_khangSinh() {
        return sd_khangSinh;
    }

    public void setSd_khangSinh(boolean sd_khangSinh) {
        this.sd_khangSinh = sd_khangSinh;
    }

    @Override
    public String toString() {
        return name + ", " + Age + ", " + Sex + ", " + Address + ", " + PhoneNumber+"ID=" + super.getID() + ", daTiemMui_1=" + super.isDaTiemMui_1() + ", daTiemMui_2=" + super.isDaTiemMui_2()+"ho=" + ho + ", sot=" + sot + ", huyetAp=" + huyetAp + ", Suy_Giam_MD=" + Suy_Giam_MD + ", ungthu=" + ungthu + ", ViemGan=" + ViemGan + ", sd_khangSinh=" + sd_khangSinh ;
    }
        
}
