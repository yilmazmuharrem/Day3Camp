import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
    User user =new User("MEHMET","YILMAZ","CHAT MODEROTERÜ",5000);
    UserManager userManager =new UserManager();
    Instructor instructor =new Instructor("ENGİN","DEMİROG","YAZILIM GELİŞTİRİCİSİ","JAVA REACT KAMPI",3000);
    InstructorManager instructorManager =new InstructorManager();
    Student student =new Student("MUHARREM","YILMAZ",19,3,"muharremyilmaz656@gmail.com");
    StudentManager studentManager =new StudentManager();


        System.out.println("***** USER *********");
         userManager.bilgileriGetir(user);
         userManager.emailGonder();
         userManager.sistemeOdevEkle(user);
         System.out.println();


         System.out.println("****** INSTRUCTOR *******");

         instructorManager.egitmenAlanı(instructor);
         instructorManager.bilgileriGetir(instructor);
         instructorManager.ogrenciAdediGetir(instructor);
         System.out.println();

         System.out.println("****** STUDENT ******");
         studentManager.kursaKayıtOl("java");
         studentManager.kursAra("java");
         studentManager.ogrenciBilgileriGetir(student);










    }
}
