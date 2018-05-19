
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

    private final static QName _GetString_QNAME = new QName("http://service.webservice.simba1949.top/", "getString");
    private final static QName _GetStringResponse_QNAME = new QName("http://service.webservice.simba1949.top/", "getStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: top.simba1949.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetString }
     * 
     */
    public GetString createGetString() {
        return new GetString();
    }

    /**
     * Create an instance of {@link GetStringResponse }
     * 
     */
    public GetStringResponse createGetStringResponse() {
        return new GetStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.simba1949.top/", name = "getString")
    public JAXBElement<GetString> createGetString(GetString value) {
        return new JAXBElement<GetString>(_GetString_QNAME, GetString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.simba1949.top/", name = "getStringResponse")
    public JAXBElement<GetStringResponse> createGetStringResponse(GetStringResponse value) {
        return new JAXBElement<GetStringResponse>(_GetStringResponse_QNAME, GetStringResponse.class, null, value);
    }

}
