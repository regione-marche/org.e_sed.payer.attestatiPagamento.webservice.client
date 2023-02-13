/**
 * TransazioneBeanTransazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.e_sed.payer.attestatipagamento.webservice.dati;

public class TransazioneBeanTransazione  implements java.io.Serializable {
    private java.lang.String idTransazione;

    private java.lang.String idBanca;

    private java.lang.String autorizzazioneBanca;

    private java.util.Calendar dataPagamento;

    private java.lang.String codiceIuv;

    private java.math.BigDecimal importoTotaleTransazione;

    private java.math.BigDecimal importoCostiServizio;

    private java.lang.String emailContribuente;

    public TransazioneBeanTransazione() {
    }

    public TransazioneBeanTransazione(
           java.lang.String idTransazione,
           java.lang.String idBanca,
           java.lang.String autorizzazioneBanca,
           java.util.Calendar dataPagamento,
           java.lang.String codiceIuv,
           java.math.BigDecimal importoTotaleTransazione,
           java.math.BigDecimal importoCostiServizio,
           java.lang.String emailContribuente) {
           this.idTransazione = idTransazione;
           this.idBanca = idBanca;
           this.autorizzazioneBanca = autorizzazioneBanca;
           this.dataPagamento = dataPagamento;
           this.codiceIuv = codiceIuv;
           this.importoTotaleTransazione = importoTotaleTransazione;
           this.importoCostiServizio = importoCostiServizio;
           this.emailContribuente = emailContribuente;
    }


    /**
     * Gets the idTransazione value for this TransazioneBeanTransazione.
     * 
     * @return idTransazione
     */
    public java.lang.String getIdTransazione() {
        return idTransazione;
    }


    /**
     * Sets the idTransazione value for this TransazioneBeanTransazione.
     * 
     * @param idTransazione
     */
    public void setIdTransazione(java.lang.String idTransazione) {
        this.idTransazione = idTransazione;
    }


    /**
     * Gets the idBanca value for this TransazioneBeanTransazione.
     * 
     * @return idBanca
     */
    public java.lang.String getIdBanca() {
        return idBanca;
    }


    /**
     * Sets the idBanca value for this TransazioneBeanTransazione.
     * 
     * @param idBanca
     */
    public void setIdBanca(java.lang.String idBanca) {
        this.idBanca = idBanca;
    }


    /**
     * Gets the autorizzazioneBanca value for this TransazioneBeanTransazione.
     * 
     * @return autorizzazioneBanca
     */
    public java.lang.String getAutorizzazioneBanca() {
        return autorizzazioneBanca;
    }


    /**
     * Sets the autorizzazioneBanca value for this TransazioneBeanTransazione.
     * 
     * @param autorizzazioneBanca
     */
    public void setAutorizzazioneBanca(java.lang.String autorizzazioneBanca) {
        this.autorizzazioneBanca = autorizzazioneBanca;
    }


    /**
     * Gets the dataPagamento value for this TransazioneBeanTransazione.
     * 
     * @return dataPagamento
     */
    public java.util.Calendar getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this TransazioneBeanTransazione.
     * 
     * @param dataPagamento
     */
    public void setDataPagamento(java.util.Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the codiceIuv value for this TransazioneBeanTransazione.
     * 
     * @return codiceIuv
     */
    public java.lang.String getCodiceIuv() {
        return codiceIuv;
    }


    /**
     * Sets the codiceIuv value for this TransazioneBeanTransazione.
     * 
     * @param codiceIuv
     */
    public void setCodiceIuv(java.lang.String codiceIuv) {
        this.codiceIuv = codiceIuv;
    }


    /**
     * Gets the importoTotaleTransazione value for this TransazioneBeanTransazione.
     * 
     * @return importoTotaleTransazione
     */
    public java.math.BigDecimal getImportoTotaleTransazione() {
        return importoTotaleTransazione;
    }


    /**
     * Sets the importoTotaleTransazione value for this TransazioneBeanTransazione.
     * 
     * @param importoTotaleTransazione
     */
    public void setImportoTotaleTransazione(java.math.BigDecimal importoTotaleTransazione) {
        this.importoTotaleTransazione = importoTotaleTransazione;
    }


    /**
     * Gets the importoCostiServizio value for this TransazioneBeanTransazione.
     * 
     * @return importoCostiServizio
     */
    public java.math.BigDecimal getImportoCostiServizio() {
        return importoCostiServizio;
    }


    /**
     * Sets the importoCostiServizio value for this TransazioneBeanTransazione.
     * 
     * @param importoCostiServizio
     */
    public void setImportoCostiServizio(java.math.BigDecimal importoCostiServizio) {
        this.importoCostiServizio = importoCostiServizio;
    }


    /**
     * Gets the emailContribuente value for this TransazioneBeanTransazione.
     * 
     * @return emailContribuente
     */
    public java.lang.String getEmailContribuente() {
        return emailContribuente;
    }


    /**
     * Sets the emailContribuente value for this TransazioneBeanTransazione.
     * 
     * @param emailContribuente
     */
    public void setEmailContribuente(java.lang.String emailContribuente) {
        this.emailContribuente = emailContribuente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransazioneBeanTransazione)) return false;
        TransazioneBeanTransazione other = (TransazioneBeanTransazione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idTransazione==null && other.getIdTransazione()==null) || 
             (this.idTransazione!=null &&
              this.idTransazione.equals(other.getIdTransazione()))) &&
            ((this.idBanca==null && other.getIdBanca()==null) || 
             (this.idBanca!=null &&
              this.idBanca.equals(other.getIdBanca()))) &&
            ((this.autorizzazioneBanca==null && other.getAutorizzazioneBanca()==null) || 
             (this.autorizzazioneBanca!=null &&
              this.autorizzazioneBanca.equals(other.getAutorizzazioneBanca()))) &&
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.codiceIuv==null && other.getCodiceIuv()==null) || 
             (this.codiceIuv!=null &&
              this.codiceIuv.equals(other.getCodiceIuv()))) &&
            ((this.importoTotaleTransazione==null && other.getImportoTotaleTransazione()==null) || 
             (this.importoTotaleTransazione!=null &&
              this.importoTotaleTransazione.equals(other.getImportoTotaleTransazione()))) &&
            ((this.importoCostiServizio==null && other.getImportoCostiServizio()==null) || 
             (this.importoCostiServizio!=null &&
              this.importoCostiServizio.equals(other.getImportoCostiServizio()))) &&
            ((this.emailContribuente==null && other.getEmailContribuente()==null) || 
             (this.emailContribuente!=null &&
              this.emailContribuente.equals(other.getEmailContribuente())));
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
        if (getIdTransazione() != null) {
            _hashCode += getIdTransazione().hashCode();
        }
        if (getIdBanca() != null) {
            _hashCode += getIdBanca().hashCode();
        }
        if (getAutorizzazioneBanca() != null) {
            _hashCode += getAutorizzazioneBanca().hashCode();
        }
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getCodiceIuv() != null) {
            _hashCode += getCodiceIuv().hashCode();
        }
        if (getImportoTotaleTransazione() != null) {
            _hashCode += getImportoTotaleTransazione().hashCode();
        }
        if (getImportoCostiServizio() != null) {
            _hashCode += getImportoCostiServizio().hashCode();
        }
        if (getEmailContribuente() != null) {
            _hashCode += getEmailContribuente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransazioneBeanTransazione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", ">Transazione>beanTransazione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "idTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBanca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "idBanca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizzazioneBanca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "autorizzazioneBanca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "dataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIuv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "codiceIuv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoTotaleTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "importoTotaleTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoCostiServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "importoCostiServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailContribuente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.attestatipagamento.payer.e-sed.org", "emailContribuente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
