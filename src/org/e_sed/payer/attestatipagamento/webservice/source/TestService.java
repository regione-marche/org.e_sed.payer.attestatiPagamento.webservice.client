package org.e_sed.payer.attestatipagamento.webservice.source;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.e_sed.payer.attestatipagamento.webservice.dati.AttestatiPagamentoRequestType;
import org.e_sed.payer.attestatipagamento.webservice.dati.AttestatiPagamentoResponseType;

public class TestService {

	public static void main(String[] args) {
		String messaggio = "";
		try {
			
			AttestatiPagamentoServiceLocator attestatiPagamentoServiceLocator=new AttestatiPagamentoServiceLocator();
			AttestatiPagamentoSOAPBindingStub attestatiPagamento=(AttestatiPagamentoSOAPBindingStub) attestatiPagamentoServiceLocator.getAttestatiPagamentoPort(
					new URL("http://10.10.80.6:10585/AttestatiPagamentoService/attestatipagamento"));
			
			attestatiPagamento.setHeader("http://dati.webservice.attestatipagamento.payer.e_sed.org", "codUtente", "000TO");	//TODO da verificare
			
			AttestatiPagamentoRequestType in = new AttestatiPagamentoRequestType();
			in.setCodUtente("codUtente");	//TODO impostare parametri corretti per test
			in.setIdTransazione("idTransazione"); 	//TODO impostare parametri corretti per test
			
			AttestatiPagamentoResponseType out;
			out = attestatiPagamento.getAttestatiPagamento(in);
			
			System.out.println(out.getTransazione().getBeanTransazione().getIdTransazione());
			
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'url non è esatta";
		} catch (ServiceException ex) {
			ex.printStackTrace();
			messaggio = "errore: la creazione della chiamata è fallita";
		} catch (RemoteException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'invocazione del WS è fallita";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(messaggio);
		}
	}
}