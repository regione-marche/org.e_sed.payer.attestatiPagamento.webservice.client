/**
 * AttestatiPagamentoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.e_sed.payer.attestatipagamento.webservice.source;

public class AttestatiPagamentoServiceLocator extends org.apache.axis.client.Service implements org.e_sed.payer.attestatipagamento.webservice.source.AttestatiPagamentoService {

    public AttestatiPagamentoServiceLocator() {
    }


    public AttestatiPagamentoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AttestatiPagamentoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AttestatiPagamentoPort
    private java.lang.String AttestatiPagamentoPort_address = "http://localhost:10585/AttestatiPagamentoService/attestatipagamento";

    public java.lang.String getAttestatiPagamentoPortAddress() {
        return AttestatiPagamentoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AttestatiPagamentoPortWSDDServiceName = "AttestatiPagamentoPort";

    public java.lang.String getAttestatiPagamentoPortWSDDServiceName() {
        return AttestatiPagamentoPortWSDDServiceName;
    }

    public void setAttestatiPagamentoPortWSDDServiceName(java.lang.String name) {
        AttestatiPagamentoPortWSDDServiceName = name;
    }

    public org.e_sed.payer.attestatipagamento.webservice.source.AttestatiPagamentoInterface getAttestatiPagamentoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AttestatiPagamentoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAttestatiPagamentoPort(endpoint);
    }

    public org.e_sed.payer.attestatipagamento.webservice.source.AttestatiPagamentoInterface getAttestatiPagamentoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.e_sed.payer.attestatipagamento.webservice.source.AttestatiPagamentoSOAPBindingStub _stub = new org.e_sed.payer.attestatipagamento.webservice.source.AttestatiPagamentoSOAPBindingStub(portAddress, this);
            _stub.setPortName(getAttestatiPagamentoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAttestatiPagamentoPortEndpointAddress(java.lang.String address) {
        AttestatiPagamentoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.e_sed.payer.attestatipagamento.webservice.source.AttestatiPagamentoInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                org.e_sed.payer.attestatipagamento.webservice.source.AttestatiPagamentoSOAPBindingStub _stub = new org.e_sed.payer.attestatipagamento.webservice.source.AttestatiPagamentoSOAPBindingStub(new java.net.URL(AttestatiPagamentoPort_address), this);
                _stub.setPortName(getAttestatiPagamentoPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AttestatiPagamentoPort".equals(inputPortName)) {
            return getAttestatiPagamentoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservice.attestatipagamento.payer.e-sed.org", "AttestatiPagamentoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservice.attestatipagamento.payer.e-sed.org", "AttestatiPagamentoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AttestatiPagamentoPort".equals(portName)) {
            setAttestatiPagamentoPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
