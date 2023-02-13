/**
 * AttestatiPagamentoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.e_sed.payer.attestatipagamento.webservice.dati;

public class AttestatiPagamentoRequestType  implements java.io.Serializable {
    /* Codice Utente E-SED */
    private java.lang.String codUtente;

    /* Identificativo Transazione Pagonet */
    private java.lang.String idTransazione;

    public AttestatiPagamentoRequestType() {
    }

    public AttestatiPagamentoRequestType(
           java.lang.String codUtente,
           java.lang.String idTransazione) {
           this.codUtente = codUtente;
           this.idTransazione = idTransazione;
    }


    /**
     * Gets the codUtente value for this AttestatiPagamentoRequestType.
     * 
     * @return codUtente   * Codice Utente E-SED
     */
    public java.lang.String getCodUtente() {
        return codUtente;
    }


    /**
     * Sets the codUtente value for this AttestatiPagamentoRequestType.
     * 
     * @param codUtente   * Codice Utente E-SED
     */
    public void setCodUtente(java.lang.String codUtente) {
        this.codUtente = codUtente;
    }


    /**
     * Gets the idTransazione value for this AttestatiPagamentoRequestType.
     * 
     * @return idTransazione   * Identificativo Transazione Pagonet
     */
    public java.lang.String getIdTransazione() {
        return idTransazione;
    }


    /**
     * Sets the idTransazione value for this AttestatiPagamentoRequestType.
     * 
     * @param idTransazione   * Identificativo Transazione Pagonet
     */
    public void setIdTransazione(java.lang.String idTransazione) {
        this.idTransazione = idTransazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttestatiPagamentoRequestType)) return false;
        AttestatiPagamentoRequestType other = (AttestatiPagamentoRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codUtente==null && other.getCodUtente()==null) || 
             (this.codUtente!=null &&
              this.codUtente.equals(other.getCodUtente()))) &&
            ((this.idTransazione==null && other.getIdTransazione()==null) || 
             (this.idTransazione!=null &&
              this.idTransazione.equals(other.getIdTransazione())));
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
        if (getCodUtente() != null) {
            _hashCode += getCodUtente().hashCode();
        }
        if (getIdTransazione() != null) {
            _hashCode += getIdTransazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttestatiPagamentoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "AttestatiPagamentoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "codUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "idTransazione"));
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
