/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informationofpatient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class PatientList extends ArrayList<Patient>{

    public PatientList() {
    super();
    this.add(new Patient("Nguyễn Tùng Lâm", 20, "Nam", "Hoài Đức", "0982641131", 1, 1, LocalDate.parse("30/05/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    this.add(new Patient("Nguyễn Minh Dung", 15, "Nu", "Thanh Xuan", "0982647431", 3, 1, LocalDate.parse("30/05/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }
   public void bnkham(){
       int id = Inputter.InputerInt("Nhap thong tin benh nhan kham sang loc: ");
   
       
       ArrayList<KhamSangloc> k  = null;//list benh nhan da kham benh
        for (Patient o : this) {
            if(id==o.getID()){
                k.add((KhamSangloc) o);
            }
        }
       String check = Inputter.InputerString("TRUE/FALSE");
       int Huyet_Ap = Inputter.InputerInt("HuyetAP: ");
       for (KhamSangloc o : k) {
           if(id ==o.getID()){
               o.setHuyetAp(Huyet_Ap);
              if(check.equalsIgnoreCase("true")){
                  o.setHo(true);
                  o.setSot(true);
                  o.setSuy_Giam_MD(true);
                  o.setUngthu(true);
                  o.setViemGan(true);
                  o.setSd_khangSinh(true);
              }
              if(check.equalsIgnoreCase("false")){
                  o.setHo(false);
                   o.setSot(false);
                  o.setSuy_Giam_MD(false);
                  o.setUngthu(false);
                  o.setViemGan(false);
                  o.setSd_khangSinh(false);
              }
           }
       }
       for (KhamSangloc khamSangloc : k) {
           System.out.println(khamSangloc);
       }
   
   }
    
}

