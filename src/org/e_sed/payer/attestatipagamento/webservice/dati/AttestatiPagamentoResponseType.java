/**
 * AttestatiPagamentoResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.e_sed.payer.attestatipagamento.webservice.dati;

public class AttestatiPagamentoResponseType  implements java.io.Serializable {
    private org.e_sed.payer.attestatipagamento.webservice.dati.Transazione transazione;

    private org.e_sed.payer.attestatipagamento.webservice.dati.BeanIci[] listBollIci;

    private org.e_sed.payer.attestatipagamento.webservice.dati.BeanPremarcato[] listBollPremarcato;

    private org.e_sed.payer.attestatipagamento.webservice.dati.BeanCds[] listBollCds;

    private org.e_sed.payer.attestatipagamento.webservice.dati.BeanSpontaneo[] listBollSpontaneo;

    private org.e_sed.payer.attestatipagamento.webservice.dati.BeanFreccia[] listBollFreccia;

    private java.lang.String rtXml;

    public AttestatiPagamentoResponseType() {
    }

    public AttestatiPagamentoResponseType(
           org.e_sed.payer.attestatipagamento.webservice.dati.Transazione transazione,
           org.e_sed.payer.attestatipagamento.webservice.dati.BeanIci[] listBollIci,
           org.e_sed.payer.attestatipagamento.webservice.dati.BeanPremarcato[] listBollPremarcato,
           org.e_sed.payer.attestatipagamento.webservice.dati.BeanCds[] listBollCds,
           org.e_sed.payer.attestatipagamento.webservice.dati.BeanSpontaneo[] listBollSpontaneo,
           org.e_sed.payer.attestatipagamento.webservice.dati.BeanFreccia[] listBollFreccia,
           java.lang.String rtXml) {
           this.transazione = transazione;
           this.listBollIci = listBollIci;
           this.listBollPremarcato = listBollPremarcato;
           this.listBollCds = listBollCds;
           this.listBollSpontaneo = listBollSpontaneo;
           this.listBollFreccia = listBollFreccia;
           this.rtXml = rtXml;
    }


    /**
     * Gets the transazione value for this AttestatiPagamentoResponseType.
     * 
     * @return transazione
     */
    public org.e_sed.payer.attestatipagamento.webservice.dati.Transazione getTransazione() {
        return transazione;
    }


    /**
     * Sets the transazione value for this AttestatiPagamentoResponseType.
     * 
     * @param transazione
     */
    public void setTransazione(org.e_sed.payer.attestatipagamento.webservice.dati.Transazione transazione) {
        this.transazione = transazione;
    }


    /**
     * Gets the listBollIci value for this AttestatiPagamentoResponseType.
     * 
     * @return listBollIci
     */
    public org.e_sed.payer.attestatipagamento.webservice.dati.BeanIci[] getListBollIci() {
        return listBollIci;
    }


    /**
     * Sets the listBollIci value for this AttestatiPagamentoResponseType.
     * 
     * @param listBollIci
     */
    public void setListBollIci(org.e_sed.payer.attestatipagamento.webservice.dati.BeanIci[] listBollIci) {
        this.listBollIci = listBollIci;
    }


    /**
     * Gets the listBollPremarcato value for this AttestatiPagamentoResponseType.
     * 
     * @return listBollPremarcato
     */
    public org.e_sed.payer.attestatipagamento.webservice.dati.BeanPremarcato[] getListBollPremarcato() {
        return listBollPremarcato;
    }


    /**
     * Sets the listBollPremarcato value for this AttestatiPagamentoResponseType.
     * 
     * @param listBollPremarcato
     */
    public void setListBollPremarcato(org.e_sed.payer.attestatipagamento.webservice.dati.BeanPremarcato[] listBollPremarcato) {
        this.listBollPremarcato = listBollPremarcato;
    }


    /**
     * Gets the listBollCds value for this AttestatiPagamentoResponseType.
     * 
     * @return listBollCds
     */
    public org.e_sed.payer.attestatipagamento.webservice.dati.BeanCds[] getListBollCds() {
        return listBollCds;
    }


    /**
     * Sets the listBollCds value for this AttestatiPagamentoResponseType.
     * 
     * @param listBollCds
     */
    public void setListBollCds(org.e_sed.payer.attestatipagamento.webservice.dati.BeanCds[] listBollCds) {
        this.listBollCds = listBollCds;
    }


    /**
     * Gets the listBollSpontaneo value for this AttestatiPagamentoResponseType.
     * 
     * @return listBollSpontaneo
     */
    public org.e_sed.payer.attestatipagamento.webservice.dati.BeanSpontaneo[] getListBollSpontaneo() {
        return listBollSpontaneo;
    }


    /**
     * Sets the listBollSpontaneo value for this AttestatiPagamentoResponseType.
     * 
     * @param listBollSpontaneo
     */
    public void setListBollSpontaneo(org.e_sed.payer.attestatipagamento.webservice.dati.BeanSpontaneo[] listBollSpontaneo) {
        this.listBollSpontaneo = listBollSpontaneo;
    }


    /**
     * Gets the listBollFreccia value for this AttestatiPagamentoResponseType.
     * 
     * @return listBollFreccia
     */
    public org.e_sed.payer.attestatipagamento.webservice.dati.BeanFreccia[] getListBollFreccia() {
        return listBollFreccia;
    }


    /**
     * Sets the listBollFreccia value for this AttestatiPagamentoResponseType.
     * 
     * @param listBollFreccia
     */
    public void setListBollFreccia(org.e_sed.payer.attestatipagamento.webservice.dati.BeanFreccia[] listBollFreccia) {
        this.listBollFreccia = listBollFreccia;
    }


    /**
     * Gets the rtXml value for this AttestatiPagamentoResponseType.
     * 
     * @return rtXml
     */
    public java.lang.String getRtXml() {
        return rtXml;
    }


    /**
     * Sets the rtXml value for this AttestatiPagamentoResponseType.
     * 
     * @param rtXml
     */
    public void setRtXml(java.lang.String rtXml) {
        this.rtXml = rtXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttestatiPagamentoResponseType)) return false;
        AttestatiPagamentoResponseType other = (AttestatiPagamentoResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transazione==null && other.getTransazione()==null) || 
             (this.transazione!=null &&
              this.transazione.equals(other.getTransazione()))) &&
            ((this.listBollIci==null && other.getListBollIci()==null) || 
             (this.listBollIci!=null &&
              java.util.Arrays.equals(this.listBollIci, other.getListBollIci()))) &&
            ((this.listBollPremarcato==null && other.getListBollPremarcato()==null) || 
             (this.listBollPremarcato!=null &&
              java.util.Arrays.equals(this.listBollPremarcato, other.getListBollPremarcato()))) &&
            ((this.listBollCds==null && other.getListBollCds()==null) || 
             (this.listBollCds!=null &&
              java.util.Arrays.equals(this.listBollCds, other.getListBollCds()))) &&
            ((this.listBollSpontaneo==null && other.getListBollSpontaneo()==null) || 
             (this.listBollSpontaneo!=null &&
              java.util.Arrays.equals(this.listBollSpontaneo, other.getListBollSpontaneo()))) &&
            ((this.listBollFreccia==null && other.getListBollFreccia()==null) || 
             (this.listBollFreccia!=null &&
              java.util.Arrays.equals(this.listBollFreccia, other.getListBollFreccia()))) &&
            ((this.rtXml==null && other.getRtXml()==null) || 
             (this.rtXml!=null &&
              this.rtXml.equals(other.getRtXml())));
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
        if (getTransazione() != null) {
            _hashCode += getTransazione().hashCode();
        }
        if (getListBollIci() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListBollIci());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListBollIci(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListBollPremarcato() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListBollPremarcato());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListBollPremarcato(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListBollCds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListBollCds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListBollCds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListBollSpontaneo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListBollSpontaneo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListBollSpontaneo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListBollFreccia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListBollFreccia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListBollFreccia(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRtXml() != null) {
            _hashCode += getRtXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttestatiPagamentoResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "AttestatiPagamentoResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "transazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "Transazione"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listBollIci");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "listBollIci"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "BeanIci"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "bollIci"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listBollPremarcato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "listBollPremarcato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "BeanPremarcato"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "bollPremarcato"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listBollCds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "listBollCds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "BeanCds"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "bollCds"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listBollSpontaneo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "listBollSpontaneo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "BeanSpontaneo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "bollSpontaneo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listBollFreccia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "listBollFreccia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "BeanFreccia"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "bollFreccia"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "rtXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
