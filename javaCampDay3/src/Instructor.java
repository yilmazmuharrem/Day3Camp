public class Instructor extends BaseKodlama{
  private   String alan;
  private  String yaptigiKamp;
  private  int ogrenciSayisi;

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public String getYaptigiKamp() {
        return yaptigiKamp;
    }

    public void setYaptigiKamp(String yaptigiKamp) {
        this.yaptigiKamp = yaptigiKamp;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public Instructor (String firsName, String surName, String alan, String yaptigiKamp, int ogrenciSayisi ){
    super (firsName,surName);
    this.alan =alan;
    this.ogrenciSayisi =ogrenciSayisi;
    this.yaptigiKamp =yaptigiKamp;
    System.out.println("INSTRUCTOR BAŞARIYLA OLUŞTURULDU...");



}
}
