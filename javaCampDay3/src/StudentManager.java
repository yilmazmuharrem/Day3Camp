
public class StudentManager extends  BaseManager{




    public void ogrenciBilgileriGetir(Student student){
        System.out.println("OGRENCİ ADI :"+student.getFirsName()+
                "\nOGRENCI SOYADI :"+student.getSurName()+
                "\nOGRENCI EMAİL"+student.getEmail());
    }

    public void kursAra(String kursAdı){
        System.out.println(kursAdı+ " KURS ARANIYO");
    }


    public void kursaKayıtOl(String kayıtOlunacakKursAdı){
        System.out.println(kayıtOlunacakKursAdı+" KURSA KAYIT OLUNDU");
    }
}
