import java.util.LinkedList;
import java.util.Scanner;

public class metodos {
    public LinkedList<ObjEmpleado> IngresarRegistro(LinkedList<ObjEmpleado> lista){
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        while (continuar) {
            ObjEmpleado o = new ObjEmpleado();
            System.out.println("ingrese su cedula");
            o.setCedula(sc.nextInt());
            System.out.println("ingrese su nombre");
            o.setNombre(sc.next());
            System.out.println("ingrese su apellido");
            o.setApellido(sc.next());
            System.out.println("ingrese su direccion");
            o.setDireccion(sc.next());
            System.out.println("ingrese su edad");
            o.setEdad(sc.nextInt());
            System.out.println("ingrese su genero. M:masculino F:femenino");
            o.setGenero(sc.next());
            System.out.println("ingrese su correo electronico");
            o.setCorreo(sc.next());
            lista.add(o);
            System.out.println("desea seguir ingresando datos 1) Si - 2) No");
            opt = sc.nextInt();

            if (opt == 2) {
                continuar = false;
            }
        }
        return lista;
    }

    public void MostrarLista(LinkedList<ObjEmpleado> lista){
        for (ObjEmpleado o : lista) {
            System.out.println("Cedula: " + o.getCedula() + "/n");
            System.out.println("Nombre: " + o.getNombre()+ "/n");
            System.out.println("Apellido: " + o.getApellido() + "/n");
            System.out.println("Direccion: " + o.getDireccion() + "/n");
            System.out.println("Edad: " + o.getEdad() + "/n");
            System.out.println("Genero: " + o.getGenero() + "/n");
            System.out.println("Correo Electronico: " + o.getCorreo() + "/n");
        }
    }

    public void exportar(LinkedList<ObjEmpleado> lista) {
        exportar Exp = new exportar();
        Exp.exportarArchivo(lista);
    }

    public LinkedList<ObjEmpleado> Importar() {
        importar i = new importar();
        LinkedList<ObjEmpleado> lista = i.ImportarArchivo();
        return lista;

    }
}
