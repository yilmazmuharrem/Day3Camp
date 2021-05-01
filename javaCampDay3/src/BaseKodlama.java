public class BaseKodlama {
   private String firsName;
   private String surName;

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public BaseKodlama(String firsName, String surName){
        this.surName  =surName;
        this.firsName =firsName;

    }
}
