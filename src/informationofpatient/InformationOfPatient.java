package informationofpatient;
public class InformationOfPatient {
    
    
    public static void main(String[] args) {
       PatientList p = new  PatientList() ;
        for (Patient patient : p) {
            System.out.println(p);
        }
      p.bnkham();
        
    }
    
}
