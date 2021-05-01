public class InstructorManager  extends  BaseManager{

    public void ogrenciAdediGetir(Instructor instructor){
        System.out.println(instructor.getOgrenciSayisi()+" Adet Ögrenci Vardır");

    }

    public void egitmenAlanı(Instructor instructor){
    System.out.println(instructor.getAlan());
}
}
