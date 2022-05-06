import javax.swing.*;
import java.util.ArrayList;

public class Curso {
    String nombreCurso;

    ArrayList<Alumno> alumnos  = new ArrayList<>();

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }

    public void agregarAlumnoCurso(){
        String nombreAux = JOptionPane.showInputDialog("Ingrese nombre del wachin");

        Alumno aux = new Alumno(nombreAux);
        alumnos.add(aux);
    }

    public void mostrarAlumnosDelCurso(){
        for(int i = 0; i <= alumnos.size(); i++){
            System.out.println(alumnos.get(i));
        }
    }
}
