package model;

public class instagram {
    public String Iconlike;
    public int Iconcoment;
    public String Icondirectmessage;
    public String Jumlahlikes;
    public String Kolomkomentar;

    public instagram(){

    }
    public instagram(String Iconlike,int Ic,String icondirectmessage,String jmlhlikes,String klmkomntr){
        this.Iconlike = Iconlike;
        this.Iconcoment = Ic;
        this.Icondirectmessage = icondirectmessage;
        this.Jumlahlikes = jmlhlikes;
        this.Kolomkomentar = klmkomntr;
    }
    public String getIconlike(){
        return this.Iconlike;
    }
    public void setIconlike(String Iconlike){
        this.Iconlike = Iconlike;
    }
    public int getIconcoment(){
        return this.Iconcoment;
    }
    public void setIconcoment(int Iconcoment){
        this.Iconcoment=Iconcoment;
    }
    public String getIcondirectmessage(){
        return this.Icondirectmessage;
    }
    public void setIcondirectmessage(String Icondirectmessage){
        this.Icondirectmessage=Icondirectmessage;
    }
    public String getJumlahlikes(){
        return  this.Jumlahlikes;
    }
    public void setJumlahlikes(String Jumlahlikes){
        this.Jumlahlikes=Jumlahlikes;
    }
    public String getKolomkomentar(){
        return this.Kolomkomentar;
    }
    public void setKolomkomentar(String Kolomkomentar){
        this.Kolomkomentar=Kolomkomentar
    }
}

// jawaban no 1 : Matrix merupakan sekumpulan informasi yang setiap individu elemenny diacu dengan menggunakan dua buh index,
//hubunganya yaitu memiliki tipe elemen matrix dapat berupa tipe dasar seperti integer,real,boolean,char dan string atau tipe terstruktur seperti record.