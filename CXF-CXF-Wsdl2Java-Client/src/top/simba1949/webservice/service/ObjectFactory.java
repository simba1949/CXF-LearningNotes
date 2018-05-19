
package top.simba1949.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the top.simba1949.webservice.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWSServiceString_QNAME = new QName("http://service.webservice.simba1949.top/", "getWSServiceString");
    private final static QName _GetWSServiceStringResponse_QNAME = new QName("http://service.webservice.simba1949.top/", "getWSServiceStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: top.simba1949.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWSServiceString }
     * 
     */
    public GetWSServiceString createGetWSServiceString() {
        return new GetWSServiceString();
    }

    /**
     * Create an instance of {@link GetWSServiceStringResponse }
     * 
     */
    public GetWSServiceStringResponse createGetWSServiceStringResponse() {
        return new GetWSServiceStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWSServiceString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.simba1949.top/", name = "getWSServiceString")
    public JAXBElement<GetWSServiceString> createGetWSServiceString(GetWSServiceString value) {
        return new JAXBElement<GetWSServiceString>(_GetWSServiceString_QNAME, GetWSServiceString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWSServiceStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.simba1949.top/", name = "getWSServiceStringResponse")
    public JAXBElement<GetWSServiceStringResponse> createGetWSServiceStringResponse(GetWSServiceStringResponse value) {
        return new JAXBElement<GetWSServiceStringResponse>(_GetWSServiceStringResponse_QNAME, GetWSServiceStringResponse.class, null, value);
    }

}
