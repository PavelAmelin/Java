package java_seminar_6;

public class notebook_data {
    private String name_brand;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public notebook_data(String name_brand, int ram, int hdd, String os, String color) {
        this.name_brand = name_brand;
        this.ram = ram;
        this.hdd =  hdd;
        this.os = os;
        this.color = color;
    }
    public String get_name_brand() {
        return name_brand;
    }
    public int get_ram() {
        return ram;
    }
    public int get_hdd() {
        return hdd;
    }
    public String get_os() {
        return os;
    }
    public String get_color() {
        return color;
    }
}
