package ine.examen;

/**
 *
 * @author asus
 */
public class Usuario {

    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Calle;
    private String NCasa;
    private String CodigoP;
    private String Colonia;
    private String Ciudad;
    private String Estado;

    public Usuario(String Nombre, String ApellidoP, String ApellidoM, String Calle, String NCasa, String CodigoP, String Colonia, String Ciudad, String Estado) {
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Calle = Calle;
        this.NCasa = NCasa;
        this.CodigoP = CodigoP;
        this.Colonia = Colonia;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }


    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getNCasa() {
        return NCasa;
    }

    public void setNCasa(String NCasa) {
        this.NCasa = NCasa;
    }

    public String getCodigoP() {
        return CodigoP;
    }

    public void setCodigoP(String CodigoP) {
        this.CodigoP = CodigoP;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    

}