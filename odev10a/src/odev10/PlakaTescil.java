package odev10;

public class PlakaTescil {
	
	public PlakaTescil() {
    }

    public PlakaTescil(int id, String plaka, String name, String soyIsim, String adres, String durum) {
        this.id = id;
        this.plaka = plaka;
        this.name = name;
        this.soyIsim = soyIsim;
        this.adres = adres;
        this.durum = durum;
    }

    int id;
    String plaka;
    String name;
    String soyIsim;
    String adres;
    String durum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}
	


