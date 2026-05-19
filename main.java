import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        metodos m = new metodos();
        LinkedList<ObjEmpleado> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opt = 0;
        while (continuar) {
            System.out.println("escoja la opcion que requiere");
            System.out.println("1: Ingresar Registro");
            System.out.println("2: Mostrar Registros");
            System.out.println("3: Exportar Archivo");
            System.out.println("4: Importar Archivo");
            System.out.println("pulse cualquier numero para salir ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    lista = m.IngresarRegistro(lista);
                    break;
                case 2:
                    m.MostrarLista(lista);
                    break;
                case 3:
                    m.exportar(lista);
                    break;
                case 4:
                    lista = m.Importar();

                    break;

                default:
                    continuar = false;
                    break;
            }

        }
    }
}
