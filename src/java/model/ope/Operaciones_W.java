/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ope;

import model.pojos.Docentes;
import model.pojos.Estudiantes;
import model.pojos.Institucion;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;


/**
 *
 * @author HP
 */
public class Operaciones_W {
    
    public void IngresarDocente (Docentes d){
        SessionFactory sf=null;
        Session sesion=null;
        Transaction tx=null;
        try{
            sf=HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            tx=sesion.beginTransaction();
            sesion.save(d);
            tx.commit();
            sesion.close();
        }
        catch(Exception ex){
            tx.rollback();
            throw new RuntimeException ("No se puede guardar el dato del Docente");
        }
    }
    public String ConsultarDocente (String codDocente){
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Docentes d=(Docentes)sesion.get(Docentes.class, codDocente);
        sesion.close(); 
        if(d!=null){
            return "  El Codigo del Docente: " + "  " + d.getCodDocente()+ 
                    "  el Codigo del Estudiante: " + "  " + d.getCodEstudiante()+ 
                    "  el Nombre del Administrador: " + "  " + d.getAdministrador()+ 
                    "  el Nombre del Docente: " + "  " + d.getNombre()+ 
                    "  el Apellido del Docente: " + "  " + d.getApellido()+ 
                    "  la Cedula del docente: " + "  " + d.getCedula()+ 
                    "  el Nombre del director_a: " + "  " + d.getDirectorA()+ 
                    "  el Género del docente: " + "  " + d.getSexo()+ 
                    "  Y por Ultimo el Año Lectivo: " + "  " + d.getAnoLectivo();
        }
        else{
            return "El Codigo del Docente: " +codDocente   + "  " +   " No Existe!!";
        }
    }
    public List<Docentes> verCodigoDocentes(){
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Query query=sesion.createQuery("from Docentes");
        List<Docentes> lista=query.list();
        sesion.close();
        return lista;
    }  
    
    public void IngresarEstudiante (Estudiantes e){
        SessionFactory sf=null;
        Session sesion=null;
        Transaction tx=null;
        try{
            sf=HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            tx=sesion.beginTransaction();
            sesion.save(e);
            tx.commit();
            sesion.close();
        }
        catch(Exception ex){
            tx.rollback();
            throw new RuntimeException ("No se puede guardar el dato del Estudiante");
        }
        
    }
    
    public String ConsultarEstudiante (String codEstudiante){
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Estudiantes e=(Estudiantes)sesion.get(Estudiantes.class, codEstudiante);
        sesion.close(); 
        if(e!=null){
            return " El Codigo del Estudiante: " + "  " +e.getCodEstudiante()+ 
                   " la Cedula del Estudiante: " + "  " +e.getCedula()+  
                   " el Nombre del Estudiante: " + "  " +e.getNombre()+ 
                   " el Apellido del Estudiante: " + "  " +e.getApellido()+ 
                   " el Grado asignado para el Estudiante: " + "  " +e.getGrado()+ 
                   " el Género del Estudiante: " + "  " +e.getSexo()+ 
                   " el Paralelo asignado para el Estudiante: " + "  " +e.getParalelo()+ 
                   " La Fecha de Matricula asignada para el Estudiante: " + "  " +e.getFechaMatricula()+ 
                   " Y por Ultimo el Año Lectivo : " + "  " +e.getAnoLectivo();
        }
        else{
            return "El Codigo del Estudiante: "+codEstudiante   + "  " +   " No Existe!!";
        }
    }
    
    public List<Estudiantes> verCodigoEstudiantes(){
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Query query=sesion.createQuery("from Estudiantes");
        List<Estudiantes> lista=query.list();
        sesion.close();
        return lista;
    }  
    
    public void IngresarInstitucion (Institucion i){
        SessionFactory sf=null;
        Session sesion=null;
        Transaction tx=null;
        try{
            sf=HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            tx=sesion.beginTransaction();
            sesion.save(i);
            tx.commit();
            sesion.close();
        }
        catch(Exception ex){
            tx.rollback();
            throw new RuntimeException ("No se puede guardar el dato de la Institucion");
        }
        
    }
    
    public String ConsultarInstitucion (String Administrador){
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Institucion i=(Institucion)sesion.get(Institucion.class, Administrador);
        sesion.close(); 
        if(i!=null){
            return " El Nombre del Administrador_a de la Institución es: "   + "  " +   i.getAdministrador();
                   
        }
        else{
            return " El Nombre del Administrador_a de la Institución: " + " " +Administrador   + " " +   " No Existe!!";
        } 
    }
    
    public List<Institucion> verNombreInstitucion(){
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Query query=sesion.createQuery("from Institucion");
        List<Institucion> lista=query.list();
        sesion.close();
        return lista;
    }  
}
