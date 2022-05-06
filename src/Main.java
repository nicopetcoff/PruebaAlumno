import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();


        String nombreCurso = JOptionPane.showInputDialog("Ingrese nombre curso");

        Curso cursito = new Curso(nombreCurso);

        cursos.add(cursito);

        cursito.agregarAlumnoCurso();
        cursito.agregarAlumnoCurso();
        cursito.agregarAlumnoCurso();

        cursito.mostrarAlumnosDelCurso();


    }
}