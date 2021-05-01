public class BaseManager {
    public void girisYapıldı(){
        System.out.println("GİRİŞ BAŞARILI ....");
    }
    public void bilgileriGetir(BaseKodlama baseKodlama){
        System.out.println("ADI :"+baseKodlama.getFirsName()+
                "\nSOYADI :"+baseKodlama.getSurName());
    }
}
