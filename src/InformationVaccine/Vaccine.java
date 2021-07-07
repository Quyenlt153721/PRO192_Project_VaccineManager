
package InformationVaccine;

import java.time.LocalDate;

public class Vaccine {
    protected String Loai_Vaccine;
    protected LocalDate Ngay_Nhan;
    protected int So_luong;
    protected String so_lo;
    protected LocalDate HSD;

    public Vaccine() {
    }

    public Vaccine(String Loai_Vaccine, LocalDate Ngay_Nhan, int So_luong, String so_lo, LocalDate HSD) {
        this.Loai_Vaccine = Loai_Vaccine;
        this.Ngay_Nhan = Ngay_Nhan;
        this.So_luong = So_luong;
        this.so_lo = so_lo;
        this.HSD = HSD;
    }

    public String getLoai_Vaccine() {
        return Loai_Vaccine;
    }

    public void setLoai_Vaccine(String Loai_Vaccine) {
        this.Loai_Vaccine = Loai_Vaccine;
    }

    public LocalDate getNgay_Nhan() {
        return Ngay_Nhan;
    }

    public void setNgay_Nhan(LocalDate Ngay_Nhan) {
        this.Ngay_Nhan = Ngay_Nhan;
    }

    public int getSo_luong() {
        return So_luong;
    }

    public void setSo_luong(int So_luong) {
        this.So_luong = So_luong;
    }

    public String getSo_lo() {
        return so_lo;
    }

    public void setSo_lo(String so_lo) {
        this.so_lo = so_lo;
    }

    public LocalDate getHSD() {
        return HSD;
    }

    public void setHSD(LocalDate HSD) {
        this.HSD = HSD;
    }
    
}
