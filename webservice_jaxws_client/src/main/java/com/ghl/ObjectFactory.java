package com.ghl;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 21:26
 * @Description:
 */
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private static final QName _SayHelloResponse_QNAME = new QName("http://ghl.com/", "sayHelloResponse");
    private static final QName _SayHello_QNAME = new QName("http://ghl.com/", "sayHello");

    public ObjectFactory() {
    }

    public SayHello createSayHello() {
        return new SayHello();
    }

    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    @XmlElementDecl(
            namespace = "http://ghl.com/",
            name = "sayHelloResponse"
    )
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse var1) {
        return new JAXBElement(_SayHelloResponse_QNAME, SayHelloResponse.class, (Class)null, var1);
    }

    @XmlElementDecl(
            namespace = "http://ghl.com/",
            name = "sayHello"
    )
    public JAXBElement<SayHello> createSayHello(SayHello var1) {
        return new JAXBElement(_SayHello_QNAME, SayHello.class, (Class)null, var1);
    }
}

