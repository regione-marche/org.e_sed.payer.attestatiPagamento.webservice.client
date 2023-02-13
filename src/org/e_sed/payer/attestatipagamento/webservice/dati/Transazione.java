/**
 * Transazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.e_sed.payer.attestatipagamento.webservice.dati;

public class Transazione  implements java.io.Serializable {
    private org.e_sed.payer.attestatipagamento.webservice.dati.TransazioneBeanTransazione beanTransazione;

    public Transazione() {
    }

    public Transazione(
           org.e_sed.payer.attestatipagamento.webservice.dati.TransazioneBeanTransazione beanTransazione) {
           this.beanTransazione = beanTransazione;
    }


    /**
     * Gets the beanTransazione value for this Transazione.
     * 
     * @return beanTransazione
     */
    public org.e_sed.payer.attestatipagamento.webservice.dati.TransazioneBeanTransazione getBeanTransazione() {
        return beanTransazione;
    }


    /**
     * Sets the beanTransazione value for this Transazione.
     * 
     * @param beanTransazione
     */
    public void setBeanTransazione(org.e_sed.payer.attestatipagamento.webservice.dati.TransazioneBeanTransazione beanTransazione) {
        this.beanTransazione = beanTransazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transazione)) return false;
        Transazione other = (Transazione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beanTransazione==null && other.getBeanTransazione()==null) || 
             (this.beanTransazione!=null &&
              this.beanTransazione.equals(other.getBeanTransazione())));
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
        if (getBeanTransazione() != null) {
            _hashCode += getBeanTransazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transazione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "Transazione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "beanTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", ">Transazione>beanTransazione"));
        elemField.setMinOccurs(0);
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
