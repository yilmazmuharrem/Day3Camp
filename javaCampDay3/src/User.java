public class User  extends BaseKodlama{
  private   String mevki;
   private int maas;

    public String getMevki() {
        return mevki;
    }

    public void setMevki(String mevki) {
        this.mevki = mevki;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public User(String firsName, String surName, String mevki, int maas){
        super(firsName,surName);
        this.mevki =mevki;
        this.maas =maas;
        System.out.println("USER BAŞARIYLA OLUŞTURULDU....");
    }
}
