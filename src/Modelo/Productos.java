
package Modelo;

public class Productos {
    private int id;
    private String codigo;
    private String nombre;
    private int stock;
    private double precio;
    private int duracion;
    private byte[] foto;
    private String beneficios;
    private String enpromo;
    private double preciopromo;
    private String iniciofin;
    
    public Productos(){ 
    }
    public Productos(String beneficios, String enpromo, double preciopromo, String iniciofin) {
        this.beneficios = beneficios;
        this.enpromo = enpromo;
        this.preciopromo = preciopromo;
        this.iniciofin = iniciofin;
    }
    
    public Productos(int id, String codigo, String nombre, int proveedor, String proveedorPro, int stock, double precio, int duracion, byte[] foto,String beneficios, String enpromo, double preciopromo, String iniciofin) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.duracion = duracion;
        this.foto = foto; 
        this.beneficios = beneficios;
        this.enpromo = enpromo;
        this.preciopromo = preciopromo;
        this.iniciofin = iniciofin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getEnpromo() {
        return enpromo;
    }

    public void setEnpromo(String enpromo) {
        this.enpromo = enpromo;
    }

    public double getPreciopromo() {
        return preciopromo;
    }

    public void setPreciopromo(double preciopromo) {
        this.preciopromo = preciopromo;
    }

    public String getIniciofin() {
        return iniciofin;
    }

    public void setIniciofin(String iniciofin) {
        this.iniciofin = iniciofin;
    }
}