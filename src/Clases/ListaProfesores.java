package Clases;

import javax.swing.JOptionPane;

public class ListaProfesores {

    Profesores x = new Profesores();
    Profesores listaDatos[];
    int tam;

    public ListaProfesores(int tam) {
        generar(tam);
    }

    public Profesores[] getListDatos() {
        return listaDatos;
    }

    public int getTam() {
        return tam;
    }

    public void generar(int tam) {
        if (tam <= 0) {
            generar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de profesores")));
        } else {
            this.tam = tam;
            listaDatos = new Profesores[tam];
        }
    }

    public void busqueda_avanzada(int dato) {
        try {

            for (int i = 0; i < tam; i++) {
                if (dato == obtenerProfesores(i).getId()) {
                    JOptionPane.showMessageDialog(null, "se encontró al profesores");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró al profesores");
                }
            }
        } catch (Exception e) {
        }
    }

   
    

    public void obtenerprofesores(int pos, Profesores datos) {
        if (pos < 0 || pos >= tam) {
            JOptionPane.showMessageDialog(null, "No se puede agregar. Fuera de índice.");
        } else {
            listaDatos[pos] = datos;
        }
    }

    public Profesores obtenerProfesores(int pos) {
        return this.listaDatos[pos];
    }

    public Profesores[] obtenerPorNota() {
        Profesores nuevo[] = new Profesores[tam];
        int contador = 0;
        for (int i = 0; i < tam; i++) {

            nuevo[contador] = listaDatos[i];
            contador++;
        }

        return nuevo;
    }

}
