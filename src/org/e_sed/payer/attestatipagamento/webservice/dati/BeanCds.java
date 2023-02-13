/**
 * BeanCds.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.e_sed.payer.attestatipagamento.webservice.dati;

public class BeanCds  implements java.io.Serializable {
    private java.lang.String contoCorrente;

    private java.math.BigDecimal importoBollettino;

    private java.lang.String descIntestatario;

    private java.lang.String codBollettino;

    private java.lang.String numeroVerbale;

    private java.lang.String targa;

    private java.lang.String tipologiaServizio;

    public BeanCds() {
    }

    public BeanCds(
           java.lang.String contoCorrente,
           java.math.BigDecimal importoBollettino,
           java.lang.String descIntestatario,
           java.lang.String codBollettino,
           java.lang.String numeroVerbale,
           java.lang.String targa,
           java.lang.String tipologiaServizio) {
           this.contoCorrente = contoCorrente;
           this.importoBollettino = importoBollettino;
           this.descIntestatario = descIntestatario;
           this.codBollettino = codBollettino;
           this.numeroVerbale = numeroVerbale;
           this.targa = targa;
           this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the contoCorrente value for this BeanCds.
     * 
     * @return contoCorrente
     */
    public java.lang.String getContoCorrente() {
        return contoCorrente;
    }


    /**
     * Sets the contoCorrente value for this BeanCds.
     * 
     * @param contoCorrente
     */
    public void setContoCorrente(java.lang.String contoCorrente) {
        this.contoCorrente = contoCorrente;
    }


    /**
     * Gets the importoBollettino value for this BeanCds.
     * 
     * @return importoBollettino
     */
    public java.math.BigDecimal getImportoBollettino() {
        return importoBollettino;
    }


    /**
     * Sets the importoBollettino value for this BeanCds.
     * 
     * @param importoBollettino
     */
    public void setImportoBollettino(java.math.BigDecimal importoBollettino) {
        this.importoBollettino = importoBollettino;
    }


    /**
     * Gets the descIntestatario value for this BeanCds.
     * 
     * @return descIntestatario
     */
    public java.lang.String getDescIntestatario() {
        return descIntestatario;
    }


    /**
     * Sets the descIntestatario value for this BeanCds.
     * 
     * @param descIntestatario
     */
    public void setDescIntestatario(java.lang.String descIntestatario) {
        this.descIntestatario = descIntestatario;
    }


    /**
     * Gets the codBollettino value for this BeanCds.
     * 
     * @return codBollettino
     */
    public java.lang.String getCodBollettino() {
        return codBollettino;
    }


    /**
     * Sets the codBollettino value for this BeanCds.
     * 
     * @param codBollettino
     */
    public void setCodBollettino(java.lang.String codBollettino) {
        this.codBollettino = codBollettino;
    }


    /**
     * Gets the numeroVerbale value for this BeanCds.
     * 
     * @return numeroVerbale
     */
    public java.lang.String getNumeroVerbale() {
        return numeroVerbale;
    }


    /**
     * Sets the numeroVerbale value for this BeanCds.
     * 
     * @param numeroVerbale
     */
    public void setNumeroVerbale(java.lang.String numeroVerbale) {
        this.numeroVerbale = numeroVerbale;
    }


    /**
     * Gets the targa value for this BeanCds.
     * 
     * @return targa
     */
    public java.lang.String getTarga() {
        return targa;
    }


    /**
     * Sets the targa value for this BeanCds.
     * 
     * @param targa
     */
    public void setTarga(java.lang.String targa) {
        this.targa = targa;
    }


    /**
     * Gets the tipologiaServizio value for this BeanCds.
     * 
     * @return tipologiaServizio
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this BeanCds.
     * 
     * @param tipologiaServizio
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BeanCds)) return false;
        BeanCds other = (BeanCds) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contoCorrente==null && other.getContoCorrente()==null) || 
             (this.contoCorrente!=null &&
              this.contoCorrente.equals(other.getContoCorrente()))) &&
            ((this.importoBollettino==null && other.getImportoBollettino()==null) || 
             (this.importoBollettino!=null &&
              this.importoBollettino.equals(other.getImportoBollettino()))) &&
            ((this.descIntestatario==null && other.getDescIntestatario()==null) || 
             (this.descIntestatario!=null &&
              this.descIntestatario.equals(other.getDescIntestatario()))) &&
            ((this.codBollettino==null && other.getCodBollettino()==null) || 
             (this.codBollettino!=null &&
              this.codBollettino.equals(other.getCodBollettino()))) &&
            ((this.numeroVerbale==null && other.getNumeroVerbale()==null) || 
             (this.numeroVerbale!=null &&
              this.numeroVerbale.equals(other.getNumeroVerbale()))) &&
            ((this.targa==null && other.getTarga()==null) || 
             (this.targa!=null &&
              this.targa.equals(other.getTarga()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getContoCorrente() != null) {
            _hashCode += getContoCorrente().hashCode();
        }
        if (getImportoBollettino() != null) {
            _hashCode += getImportoBollettino().hashCode();
        }
        if (getDescIntestatario() != null) {
            _hashCode += getDescIntestatario().hashCode();
        }
        if (getCodBollettino() != null) {
            _hashCode += getCodBollettino().hashCode();
        }
        if (getNumeroVerbale() != null) {
            _hashCode += getNumeroVerbale().hashCode();
        }
        if (getTarga() != null) {
            _hashCode += getTarga().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BeanCds.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "BeanCds"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contoCorrente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "contoCorrente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "importoBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descIntestatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "descIntestatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "codBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroVerbale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "numeroVerbale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "targa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "tipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
