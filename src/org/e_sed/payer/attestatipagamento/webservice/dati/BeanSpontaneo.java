/**
 * BeanSpontaneo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.e_sed.payer.attestatipagamento.webservice.dati;

public class BeanSpontaneo  implements java.io.Serializable {
    private java.lang.String contoCorrente;

    private java.math.BigDecimal importoBollettino;

    private java.lang.String descIntestatario;

    private java.lang.String causale;

    private java.lang.String denominazioneEsecutore;

    private java.lang.String indirizzoResidenza;

    private java.lang.String capResidenza;

    private java.lang.String comuneResidenza;

    private java.lang.String tipologiaServizio;

    public BeanSpontaneo() {
    }

    public BeanSpontaneo(
           java.lang.String contoCorrente,
           java.math.BigDecimal importoBollettino,
           java.lang.String descIntestatario,
           java.lang.String causale,
           java.lang.String denominazioneEsecutore,
           java.lang.String indirizzoResidenza,
           java.lang.String capResidenza,
           java.lang.String comuneResidenza,
           java.lang.String tipologiaServizio) {
           this.contoCorrente = contoCorrente;
           this.importoBollettino = importoBollettino;
           this.descIntestatario = descIntestatario;
           this.causale = causale;
           this.denominazioneEsecutore = denominazioneEsecutore;
           this.indirizzoResidenza = indirizzoResidenza;
           this.capResidenza = capResidenza;
           this.comuneResidenza = comuneResidenza;
           this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the contoCorrente value for this BeanSpontaneo.
     * 
     * @return contoCorrente
     */
    public java.lang.String getContoCorrente() {
        return contoCorrente;
    }


    /**
     * Sets the contoCorrente value for this BeanSpontaneo.
     * 
     * @param contoCorrente
     */
    public void setContoCorrente(java.lang.String contoCorrente) {
        this.contoCorrente = contoCorrente;
    }


    /**
     * Gets the importoBollettino value for this BeanSpontaneo.
     * 
     * @return importoBollettino
     */
    public java.math.BigDecimal getImportoBollettino() {
        return importoBollettino;
    }


    /**
     * Sets the importoBollettino value for this BeanSpontaneo.
     * 
     * @param importoBollettino
     */
    public void setImportoBollettino(java.math.BigDecimal importoBollettino) {
        this.importoBollettino = importoBollettino;
    }


    /**
     * Gets the descIntestatario value for this BeanSpontaneo.
     * 
     * @return descIntestatario
     */
    public java.lang.String getDescIntestatario() {
        return descIntestatario;
    }


    /**
     * Sets the descIntestatario value for this BeanSpontaneo.
     * 
     * @param descIntestatario
     */
    public void setDescIntestatario(java.lang.String descIntestatario) {
        this.descIntestatario = descIntestatario;
    }


    /**
     * Gets the causale value for this BeanSpontaneo.
     * 
     * @return causale
     */
    public java.lang.String getCausale() {
        return causale;
    }


    /**
     * Sets the causale value for this BeanSpontaneo.
     * 
     * @param causale
     */
    public void setCausale(java.lang.String causale) {
        this.causale = causale;
    }


    /**
     * Gets the denominazioneEsecutore value for this BeanSpontaneo.
     * 
     * @return denominazioneEsecutore
     */
    public java.lang.String getDenominazioneEsecutore() {
        return denominazioneEsecutore;
    }


    /**
     * Sets the denominazioneEsecutore value for this BeanSpontaneo.
     * 
     * @param denominazioneEsecutore
     */
    public void setDenominazioneEsecutore(java.lang.String denominazioneEsecutore) {
        this.denominazioneEsecutore = denominazioneEsecutore;
    }


    /**
     * Gets the indirizzoResidenza value for this BeanSpontaneo.
     * 
     * @return indirizzoResidenza
     */
    public java.lang.String getIndirizzoResidenza() {
        return indirizzoResidenza;
    }


    /**
     * Sets the indirizzoResidenza value for this BeanSpontaneo.
     * 
     * @param indirizzoResidenza
     */
    public void setIndirizzoResidenza(java.lang.String indirizzoResidenza) {
        this.indirizzoResidenza = indirizzoResidenza;
    }


    /**
     * Gets the capResidenza value for this BeanSpontaneo.
     * 
     * @return capResidenza
     */
    public java.lang.String getCapResidenza() {
        return capResidenza;
    }


    /**
     * Sets the capResidenza value for this BeanSpontaneo.
     * 
     * @param capResidenza
     */
    public void setCapResidenza(java.lang.String capResidenza) {
        this.capResidenza = capResidenza;
    }


    /**
     * Gets the comuneResidenza value for this BeanSpontaneo.
     * 
     * @return comuneResidenza
     */
    public java.lang.String getComuneResidenza() {
        return comuneResidenza;
    }


    /**
     * Sets the comuneResidenza value for this BeanSpontaneo.
     * 
     * @param comuneResidenza
     */
    public void setComuneResidenza(java.lang.String comuneResidenza) {
        this.comuneResidenza = comuneResidenza;
    }


    /**
     * Gets the tipologiaServizio value for this BeanSpontaneo.
     * 
     * @return tipologiaServizio
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this BeanSpontaneo.
     * 
     * @param tipologiaServizio
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BeanSpontaneo)) return false;
        BeanSpontaneo other = (BeanSpontaneo) obj;
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
            ((this.causale==null && other.getCausale()==null) || 
             (this.causale!=null &&
              this.causale.equals(other.getCausale()))) &&
            ((this.denominazioneEsecutore==null && other.getDenominazioneEsecutore()==null) || 
             (this.denominazioneEsecutore!=null &&
              this.denominazioneEsecutore.equals(other.getDenominazioneEsecutore()))) &&
            ((this.indirizzoResidenza==null && other.getIndirizzoResidenza()==null) || 
             (this.indirizzoResidenza!=null &&
              this.indirizzoResidenza.equals(other.getIndirizzoResidenza()))) &&
            ((this.capResidenza==null && other.getCapResidenza()==null) || 
             (this.capResidenza!=null &&
              this.capResidenza.equals(other.getCapResidenza()))) &&
            ((this.comuneResidenza==null && other.getComuneResidenza()==null) || 
             (this.comuneResidenza!=null &&
              this.comuneResidenza.equals(other.getComuneResidenza()))) &&
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
        if (getCausale() != null) {
            _hashCode += getCausale().hashCode();
        }
        if (getDenominazioneEsecutore() != null) {
            _hashCode += getDenominazioneEsecutore().hashCode();
        }
        if (getIndirizzoResidenza() != null) {
            _hashCode += getIndirizzoResidenza().hashCode();
        }
        if (getCapResidenza() != null) {
            _hashCode += getCapResidenza().hashCode();
        }
        if (getComuneResidenza() != null) {
            _hashCode += getComuneResidenza().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BeanSpontaneo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "BeanSpontaneo"));
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
        elemField.setFieldName("causale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "causale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazioneEsecutore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "denominazioneEsecutore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoResidenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "indirizzoResidenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capResidenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "capResidenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuneResidenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "comuneResidenza"));
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
