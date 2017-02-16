//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.14 at 03:02:07 PM EET 
//


package ua.nure.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Coach complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Coach">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="general" type="{}CoachInfo"/>
 *         &lt;element name="experience" type="{}Experience"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coach", propOrder = {
        "general",
        "experience"
})
public class Coach {

    @XmlElement(required = true)
    protected CoachInfo general;

    @XmlSchemaType(name = "integer")
    protected int experience;

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the general property.
     *
     * @return possible object is
     * {@link CoachInfo }
     */
    public CoachInfo getGeneral() {
        return general;
    }

    /**
     * Sets the value of the general property.
     *
     * @param value allowed object is
     *              {@link CoachInfo }
     */
    public void setGeneral(CoachInfo value) {
        this.general = value;
    }

    /**
     * Gets the value of the experience property.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the value of the experience property.
     */
    public void setExperience(int value) {
        this.experience = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public String toString() {
        return "Coach{" + "id='" + id + "\', " + general + ", experience=" + experience + '}';
    }

}
