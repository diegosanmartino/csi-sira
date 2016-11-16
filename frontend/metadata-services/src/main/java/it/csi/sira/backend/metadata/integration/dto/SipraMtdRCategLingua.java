/*
 * Created on 8 nov 2016 ( Time 16:16:32 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dto;

import java.io.Serializable;


/**
 * Java bean for 'SipraMtdRCategLingua' entity
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdRCategLingua implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_categoria int4 
    private Integer idCategoria;
    // DB : id_lingua int4 
    private Integer idLingua;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : des_categoria varchar 
    private String desCategoria;

    // DB : des_alias varchar 
    private String desAlias;

    // DB : fl_alias varchar 
    private String flAlias;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdCategoria( Integer idCategoria ) {
        this.idCategoria = idCategoria ;
    }

    public Integer getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdLingua( Integer idLingua ) {
        this.idLingua = idLingua ;
    }

    public Integer getIdLingua() {
        return this.idLingua;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setDesCategoria( String desCategoria ) {
        this.desCategoria = desCategoria;
    }
    public String getDesCategoria() {
        return this.desCategoria;
    }

    public void setDesAlias( String desAlias ) {
        this.desAlias = desAlias;
    }
    public String getDesAlias() {
        return this.desAlias;
    }

    public void setFlAlias( String flAlias ) {
        this.flAlias = flAlias;
    }
    public String getFlAlias() {
        return this.flAlias;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idCategoria);
        sb.append("|");
        sb.append(idLingua);
        sb.append("|");
        sb.append(desCategoria);
        sb.append("|");
        sb.append(desAlias);
        sb.append("|");
        sb.append(flAlias);
        return sb.toString(); 
    } 


}
