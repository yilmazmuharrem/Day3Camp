public class UserManager  extends  BaseManager{







    public void bilgileriGetir(User user) {
            System.out.println("USER ADI :"+user.getFirsName()+
                    "\nUSER SOYADI :"+user.getSurName()+
                    "\nUSER MEVKİ :"+user.getMevki());
        }


    public void sistemeOdevEkle(User user){
        System.out.println(user.getFirsName()+" SİSTEME ÖDEV EKLENDİ");
    }
    public void emailGonder(){
        System.out.println("EMAİL GÖNDERİLDİ ...");
    }
}

