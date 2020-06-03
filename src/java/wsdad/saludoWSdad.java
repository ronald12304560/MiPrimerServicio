/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsdad;

import alumno.Alumno;
import alumno.AlumnoImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

/**
 *
 * @author ADVANCE
 */
@WebService(serviceName = "saludoWSdad")
public class saludoWSdad {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "getEgresados")
    public ArrayList<Alumno> getEgresados()throws Exception{
        alumno.AlumnoImpl am= new AlumnoImpl();
        return am.listaEgresados("20");
    }
    
}

