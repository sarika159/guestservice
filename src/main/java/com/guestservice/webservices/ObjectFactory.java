//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.11 at 09:11:17 PM CDT 
//


package com.guestservice.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.guestservice.webservices package. 
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

    private final static QName _Guest_QNAME = new QName("http://webservices.guestservice.com", "Guest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.guestservice.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Guest }
     * 
     */
    public Guest createGuest() {
        return new Guest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.guestservice.com", name = "Guest")
    public JAXBElement<Guest> createGuest(Guest value) {
        return new JAXBElement<Guest>(_Guest_QNAME, Guest.class, null, value);
    }

}