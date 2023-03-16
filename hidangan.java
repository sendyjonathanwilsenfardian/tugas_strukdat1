package latihan2;

public class hidangan {
    protected String namahidangan;

    public String getNamahidangan(){
        return namahidangan;
    }

    public void setNamahidangan(String namahidangan) {
        this.namahidangan = namahidangan;
    }

    public String disantap(){
        return "Makanan dihidangkan";
    }
}
