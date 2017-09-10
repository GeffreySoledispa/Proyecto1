/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.webservices;

import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.ope.Operaciones_W;
import model.pojos.Docentes;
import model.pojos.Estudiantes;
import model.pojos.Institucion;

/**
 *
 * @author HP
 */
@WebService(serviceName = "Services_W_S")
public class Services_W_S {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarDocente")
    public String IngresarDocente(@WebParam(name = "codDocente") String codDocente, @WebParam(name = "codEstudiante") 
           String codEstudiante, @WebParam(name = "administrador") String administrador, @WebParam(name = "nombre") 
           String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "cedula") 
            int cedula, @WebParam(name = "director_A") String director_A, @WebParam(name = "sexo") 
           String sexo, @WebParam(name = "anoLectivo") int anoLectivo) {
        Docentes d=new Docentes(codDocente,codEstudiante,administrador,nombre,apellido,
                                cedula,director_A,sexo,anoLectivo);
        Operaciones_W operaciones_W=new Operaciones_W();
        operaciones_W.IngresarDocente(d);
        return "Docente de la Institución Ingresado/a Correctamente!!"; 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarDocente")
    public String BuscarDocente(@WebParam(name = "codDocente") String codDocente) {
        Operaciones_W operaciones_W=new Operaciones_W();
        return operaciones_W.ConsultarDocente(codDocente);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultarDocentes")
    public List<Docentes> ConsultarDocentes() {
        Operaciones_W operaciones_W=new Operaciones_W();
        List<Docentes> listaDocentes= operaciones_W.verCodigoDocentes();
        return listaDocentes;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarEstudiante")
    public String BuscarEstudiante(@WebParam(name = "codEstudiante") String codEstudiante) {
        Operaciones_W operaciones_W=new Operaciones_W();
        return operaciones_W.ConsultarEstudiante(codEstudiante);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultarEstudiantes")
    public List<Estudiantes> ConsultarEstudiantes() {
        Operaciones_W operaciones_W=new Operaciones_W();
        List<Estudiantes> listaEstudiantes= operaciones_W.verCodigoEstudiantes();
        return listaEstudiantes;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarInstitucion")
    public String IngresarInstitucion(@WebParam(name = "administrador") String administrador, @WebParam(name = "contrasena") int contrasena) {
        Institucion i=new Institucion(administrador,contrasena);
        Operaciones_W operaciones_W=new Operaciones_W();
        operaciones_W.IngresarInstitucion(i);
        return "Administrador/a de la Institución Ingresado/a Correctamente!!";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarInstitucion")
    public String BuscarInstitucion(@WebParam(name = "administrador") String administrador) {
        Operaciones_W operaciones_W=new Operaciones_W();
        return operaciones_W.ConsultarInstitucion(administrador);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultarEnInstitucion")
    public List<Institucion> verNombreInstitucion() {
        Operaciones_W operaciones_W=new Operaciones_W(); 
        List<Institucion> listaInstitucion= operaciones_W.verNombreInstitucion();
        return listaInstitucion;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarEstudiante")
    public String IngresarEstudiante(@WebParam(name = "codEstudiante") String codEstudiante, @WebParam(name = "cedula") int cedula, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "grado") int grado, @WebParam(name = "sexo") String sexo, @WebParam(name = "paralelo") String paralelo, @WebParam(name = "FechaMatricula") String FechaMatricula, @WebParam(name = "anoLectivo") int anoLectivo) {
        Estudiantes e=new Estudiantes(codEstudiante,cedula,nombre,apellido,grado,sexo,paralelo,FechaMatricula,anoLectivo);
        Operaciones_W operaciones_W=new Operaciones_W();
        operaciones_W.IngresarEstudiante(e);
        return "Estudiante de la Institución Ingresado/a Correctamente!!";
    }
    
    
     
    
    



}
