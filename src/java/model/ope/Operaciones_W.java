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
            return " El Numero de CodDocente: "  +d.getCodDocente()+ 
                    " el CodEstudiante: "  +d.getCodEstudiante()+ 
                    " cuyo nombre de Administrador es: "  +d.getAdministrador()+ 
                    " el nombre del docente: "  +d.getNombre()+ 
                    " el apellido del docente: "  +d.getApellido()+ 
                    " la cedula del docente: "  +d.getCedula()+ 
                    " el nombre del director_a: "  +d.getDirectorA()+ 
                    " el género del docente: "  +d.getSexo()+ 
                    " Y por ultimo el año lectivo: "  +d.getAnoLectivo();
        }
        else{
            return "El numero de CodDocente: "+codDocente+ "No existe";
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
            return " El Numero de CodEstudiante es :   "  +e.getCodEstudiante()+ 
                   " la cedula del Estudiante es :   "  +e.getCedula()+  
                   " el nombre del Estudiante es :   "  +e.getNombre()+ 
                   " el apellido del Estudiante es :   "  +e.getApellido()+ 
                   " el grado asignado para el Estudiante es :   "  +e.getGrado()+ 
                   " el género del Estudiante es :   "  +e.getSexo()+ 
                   " el paralelo asignado para el Estudiante es :   "  +e.getParalelo()+ 
                   " La fecha de matricula asignada para el Estudiante :   "  +e.getFechaMatricula()+ 
                   " Y por ultimo el año lectivo :   "  +e.getAnoLectivo();
        }
        else{
            return "El numero de CodEstudiante: "+codEstudiante+ "No existe";
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
            return " El Nombre del Administrador_a de la Institución es   :   "  +i.getAdministrador();
                   
        }
        else{
            return " El Nombre del Administrador_a de la Institución :   "  +Administrador+ "No existe";
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
