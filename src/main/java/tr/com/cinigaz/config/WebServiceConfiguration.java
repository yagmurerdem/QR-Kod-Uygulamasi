package tr.com.cinigaz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.endpoint.interceptor.PayloadLoggingInterceptor;
import org.springframework.ws.soap.security.xwss.XwsSecurityInterceptor;
import org.springframework.ws.soap.security.xwss.callback.SimplePasswordValidationCallbackHandler;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import tr.com.cinigaz.entities.User;
import tr.com.cinigaz.service.UserService;
import tr.com.cinigaz.service.impl.UserServiceImpl;

import java.util.Collections;
import java.util.List;


@EnableWs
@Configuration
public class WebServiceConfiguration extends WsConfigurerAdapter {

    @Autowired
    UserService userService;

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/kioskqrkod/*");
    }

    @Bean(name = "kioskqrkod")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema kioskqrkodSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("kioskqrkodPort");
        wsdl11Definition.setLocationUri("/kioskqrkod");
        wsdl11Definition.setTargetNamespace("xml.cinigaz.com.tr");
        wsdl11Definition.setSchema(kioskqrkodSchema);


        return wsdl11Definition;
    }


    @Bean
    public XsdSchema kioskqrkodSchema() {
        return new SimpleXsdSchema(new ClassPathResource("kioskqrkod.xsd"));
    }


    @Bean(name = "secondstage")
    public DefaultWsdl11Definition defaultWsdl11Definition2(XsdSchema secondStageSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("secondstagePort");
        wsdl11Definition.setLocationUri("/kioskqrkod");
        wsdl11Definition.setTargetNamespace("xml.cinigaz.com.tr");
        wsdl11Definition.setSchema(secondStageSchema);


        return wsdl11Definition;
    }


    @Bean
    public XsdSchema secondStageSchema() {
        return new SimpleXsdSchema(new ClassPathResource("secondstage.xsd"));
    }


    @Bean
    public XwsSecurityInterceptor securityInterceptor() {
        XwsSecurityInterceptor securityInterceptor = new XwsSecurityInterceptor();
        securityInterceptor.setCallbackHandler(callbackHandler());
        securityInterceptor.setPolicyConfiguration(new ClassPathResource("securityPolicy.xml"));
        return securityInterceptor;
    }

    @Bean
    public SimplePasswordValidationCallbackHandler callbackHandler() {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        SimplePasswordValidationCallbackHandler callbackHandler = new SimplePasswordValidationCallbackHandler();
        User user = userService.findUserByuserId(1L);
        callbackHandler.setUsersMap(Collections.singletonMap(user.getUserName(), user.getPassword()));
        return callbackHandler;
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        interceptors.add(payloadLoggingInterceptor());
        interceptors.add(payloadValidatingInterceptor());
        interceptors.add(securityInterceptor());
    }

    @Bean
    public PayloadLoggingInterceptor payloadLoggingInterceptor() {
        return new PayloadLoggingInterceptor();
    }

    @Bean
    public PayloadValidatingInterceptor payloadValidatingInterceptor() {
        final PayloadValidatingInterceptor payloadValidatingInterceptor = new PayloadValidatingInterceptor();
       // payloadValidatingInterceptor.setSchema(new ClassPathResource("kioskqrkod.xsd"));
        payloadValidatingInterceptor.setSchema(new ClassPathResource("secondstage.xsd"));
        return payloadValidatingInterceptor;
    }

}
