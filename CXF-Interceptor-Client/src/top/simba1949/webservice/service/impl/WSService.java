package top.simba1949.webservice.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-05-19T14:17:23.150+08:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "wSService",
                  wsdlLocation = "http://localhost:8881/ws/wSService?wsdl",
                  targetNamespace = "http://impl.service.webservice.simba1949.top")
public class WSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.webservice.simba1949.top", "wSService");
    public final static QName WSServiceImplPort = new QName("http://impl.service.webservice.simba1949.top", "WSServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8881/ws/wSService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WSService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8881/ws/wSService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WSService
     */
    @WebEndpoint(name = "WSServiceImplPort")
    public top.simba1949.webservice.service.WSService getWSServiceImplPort() {
        return super.getPort(WSServiceImplPort, top.simba1949.webservice.service.WSService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSService
     */
    @WebEndpoint(name = "WSServiceImplPort")
    public top.simba1949.webservice.service.WSService getWSServiceImplPort(WebServiceFeature... features) {
        return super.getPort(WSServiceImplPort, top.simba1949.webservice.service.WSService.class, features);
    }

}