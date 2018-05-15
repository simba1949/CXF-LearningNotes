
package top.simba1949.server.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the top.simba1949.server.service package. 
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

    private final static QName _GetIntValueResponse_QNAME = new QName("http://service.server.simba1949.top/", "getIntValueResponse");
    private final static QName _SayHelloResponse_QNAME = new QName("http://service.server.simba1949.top/", "sayHelloResponse");
    private final static QName _GetIntValue_QNAME = new QName("http://service.server.simba1949.top/", "getIntValue");
    private final static QName _GetList_QNAME = new QName("http://service.server.simba1949.top/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://service.server.simba1949.top/", "getListResponse");
    private final static QName _SayHello_QNAME = new QName("http://service.server.simba1949.top/", "sayHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: top.simba1949.server.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetIntValue }
     * 
     */
    public GetIntValue createGetIntValue() {
        return new GetIntValue();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link GetIntValueResponse }
     * 
     */
    public GetIntValueResponse createGetIntValueResponse() {
        return new GetIntValueResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIntValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.simba1949.top/", name = "getIntValueResponse")
    public JAXBElement<GetIntValueResponse> createGetIntValueResponse(GetIntValueResponse value) {
        return new JAXBElement<GetIntValueResponse>(_GetIntValueResponse_QNAME, GetIntValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.simba1949.top/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIntValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.simba1949.top/", name = "getIntValue")
    public JAXBElement<GetIntValue> createGetIntValue(GetIntValue value) {
        return new JAXBElement<GetIntValue>(_GetIntValue_QNAME, GetIntValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.simba1949.top/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.simba1949.top/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.simba1949.top/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

}
