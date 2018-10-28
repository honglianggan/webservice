package com.ghl;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 21:29
 * @Description:
 */
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
        name = "HelloService",
        targetNamespace = "http://ghl.com/",
        wsdlLocation = "http://127.0.0.1:12345/hello?wsdl"
)
public class HelloService extends Service {
    private static final URL HELLOSERVICE_WSDL_LOCATION;
    private static final WebServiceException HELLOSERVICE_EXCEPTION;
    private static final QName HELLOSERVICE_QNAME = new QName("http://ghl.com/", "HelloService");

    public HelloService() {
        super(__getWsdlLocation(), HELLOSERVICE_QNAME);
    }

    public HelloService(WebServiceFeature... var1) {
        super(__getWsdlLocation(), HELLOSERVICE_QNAME, var1);
    }

    public HelloService(URL var1) {
        super(var1, HELLOSERVICE_QNAME);
    }

    public HelloService(URL var1, WebServiceFeature... var2) {
        super(var1, HELLOSERVICE_QNAME, var2);
    }

    public HelloService(URL var1, QName var2) {
        super(var1, var2);
    }

    public HelloService(URL var1, QName var2, WebServiceFeature... var3) {
        super(var1, var2, var3);
    }

    @WebEndpoint(
            name = "HelloPort"
    )
    public IHello getHelloPort() {
        return (IHello)super.getPort(new QName("http://ghl.com/", "HelloPort"), IHello.class);
    }

    @WebEndpoint(
            name = "HelloPort"
    )
    public IHello getHelloPort(WebServiceFeature... var1) {
        return (IHello)super.getPort(new QName("http://ghl.com/", "HelloPort"), IHello.class, var1);
    }

    private static URL __getWsdlLocation() {
        if (HELLOSERVICE_EXCEPTION != null) {
            throw HELLOSERVICE_EXCEPTION;
        } else {
            return HELLOSERVICE_WSDL_LOCATION;
        }
    }

    static {
        URL var0 = null;
        WebServiceException var1 = null;

        try {
            var0 = new URL("http://127.0.0.1:12345/hello?wsdl");
        } catch (MalformedURLException var3) {
            var1 = new WebServiceException(var3);
        }

        HELLOSERVICE_WSDL_LOCATION = var0;
        HELLOSERVICE_EXCEPTION = var1;
    }
}
