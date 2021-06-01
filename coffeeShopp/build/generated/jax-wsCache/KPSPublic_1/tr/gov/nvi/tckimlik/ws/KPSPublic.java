package tr.gov.nvi.tckimlik.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.6-1b01 Generated
 * source version: 2.2
 *
 */
@WebServiceClient(name = "KPSPublic", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", wsdlLocation = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL")
public class KPSPublic
        extends Service {

    private final static URL KPSPUBLİC_WSDL_LOCATION;
    private final static WebServiceException KPSPUBLİC_EXCEPTION;
    private final static QName KPSPUBLİC_QNAME = new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublic");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KPSPUBLİC_WSDL_LOCATION = url;
        KPSPUBLİC_EXCEPTION = e;
    }

    public KPSPublic() {
        super(__getWsdlLocation(), KPSPUBLİC_QNAME);
    }

    public KPSPublic(WebServiceFeature... features) {
        super(__getWsdlLocation(), KPSPUBLİC_QNAME, features);
    }

    public KPSPublic(URL wsdlLocation) {
        super(wsdlLocation, KPSPUBLİC_QNAME);
    }

    public KPSPublic(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KPSPUBLİC_QNAME, features);
    }

    public KPSPublic(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KPSPublic(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap")
    public KPSPublicSoap getKPSPublicSoap() {
        return super.getPort(new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap"), KPSPublicSoap.class);
    }

    /**
     *
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to
     * configure on the proxy. Supported features not in the
     * <code>features</code> parameter will have their default values.
     * @return returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap")
    public KPSPublicSoap getKPSPublicSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap"), KPSPublicSoap.class, features);
    }

    /**
     *
     * @return returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap12")
    public KPSPublicSoap getKPSPublicSoap12() {
        return super.getPort(new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap12"), KPSPublicSoap.class);
    }

    /**
     *
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to
     * configure on the proxy. Supported features not in the
     * <code>features</code> parameter will have their default values.
     * @return returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap12")
    public KPSPublicSoap getKPSPublicSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap12"), KPSPublicSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KPSPUBLİC_EXCEPTION != null) {
            throw KPSPUBLİC_EXCEPTION;
        }
        return KPSPUBLİC_WSDL_LOCATION;
    }

}
