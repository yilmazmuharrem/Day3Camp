public class Student extends BaseKodlama {
     private   int yas;
     private int yaptigiOdevler;
     private String email;

    public Student(String firsName,String surName,int yas,int yaptigiOdevler,String email){
    super(firsName,surName);
    this.yaptigiOdevler =yaptigiOdevler;
    this.yas =yas;
    this.email =email;
        System.out.println("STUDENT BAŞARIYLA OLUŞTURULDU ... ");
}

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getYaptigiOdevler() {
        return yaptigiOdevler;
    }

    public void setYaptigiOdevler(int yaptigiOdevler) {
        this.yaptigiOdevler = yaptigiOdevler;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
