/*
 * Created on 8 nov 2016 ( Time 16:16:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dto;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'SipraMtdTLog' entity
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdTLog implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_log int4 
    private Integer idLog;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : des_log varchar 
    private String desLog;

    // DB : data_log date 
    private Date dataLog;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdLog( Integer idLog ) {
        this.idLog = idLog ;
    }

    public Integer getIdLog() {
        return this.idLog;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setDesLog( String desLog ) {
        this.desLog = desLog;
    }
    public String getDesLog() {
        return this.desLog;
    }

    public void setDataLog( Date dataLog ) {
        this.dataLog = dataLog;
    }
    public Date getDataLog() {
        return this.dataLog;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idLog);
        sb.append("|");
        sb.append(desLog);
        sb.append("|");
        sb.append(dataLog);
        return sb.toString(); 
    } 


}
