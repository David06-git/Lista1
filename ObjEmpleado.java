public class ObjEmpleado {
    String Nombre;
    int Cedula;
    String Apellido;
    String Direccion;
    int Edad;
    String Genero;
    String Correo;

    public ObjEmpleado() {
    }

    public ObjEmpleado(String Apellido, int Cedula, String Correo, String Direccion, int Edad, String Genero, String Nombre) {
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }


}
