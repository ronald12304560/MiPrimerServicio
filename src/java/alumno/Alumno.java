/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.io.Serializable;
/**
 *
 * @author ADVANCE
 */
public class Alumno implements Serializable {
    private String o_alumno_id;
    private String o_alumno_codigo;
    private String o_alumno_nombres;
    private String o_alumno_apellido_paterno;
    private String o_alumno_apellido_materno;
    private String o_alumno_direccion;
    

    public String getO_alumno_id() {
        return o_alumno_id;
    }

    public String getO_alumno_codigo() {
        return o_alumno_codigo;
    }

    public String getO_alumno_nombres() {
        return o_alumno_nombres;
    }

    public String getO_alumno_apellido_paterno() {
        return o_alumno_apellido_paterno;
    }

    public String getO_alumno_apellido_materno() {
        return o_alumno_apellido_materno;
    }

    public String getO_alumno_direccion() {
        return o_alumno_direccion;
    }

    public void setO_alumno_id(String o_alumno_id) {
        this.o_alumno_id = o_alumno_id;
    }

    public void setO_alumno_codigo(String o_alumno_codigo) {
        this.o_alumno_codigo = o_alumno_codigo;
    }

    public void setO_alumno_nombres(String o_alumno_nombres) {
        this.o_alumno_nombres = o_alumno_nombres;
    }

    public void setO_alumno_apellido_paterno(String o_alumno_apellido_paterno) {
        this.o_alumno_apellido_paterno = o_alumno_apellido_paterno;
    }

    public void setO_alumno_apellido_materno(String o_alumno_apellido_materno) {
        this.o_alumno_apellido_materno = o_alumno_apellido_materno;
    }

    public void setO_alumno_direccion(String o_alumno_direccion) {
        this.o_alumno_direccion = o_alumno_direccion;
    }
    

    public Alumno(String o_alumno_id, String o_alumno_codigo, String o_alumno_nombres, String o_alumno_apellido_paterno, String o_alumno_apellido_materno, String o_alumno_direccion) {
        this.o_alumno_id = o_alumno_id;
        this.o_alumno_codigo = o_alumno_codigo;
        this.o_alumno_nombres = o_alumno_nombres;
        this.o_alumno_apellido_paterno = o_alumno_apellido_paterno;
        this.o_alumno_apellido_materno = o_alumno_apellido_materno;
        this.o_alumno_direccion = o_alumno_direccion;
    }
    
    public Alumno(){    }
}
