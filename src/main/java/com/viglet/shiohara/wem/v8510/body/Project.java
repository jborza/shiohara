//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.17 at 02:23:34 PM BRT 
//


package com.viglet.shiohara.wem.v8510.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capabilityMask" type="{http://www.vignette.com/xmlschemas/importexport}CT_acl" minOccurs="0"/>
 *         &lt;element name="acl" type="{http://www.vignette.com/xmlschemas/importexport}CT_acl" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.vignette.com/xmlschemas/importexport}AG_vcmAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "description",
    "projectPath",
    "capabilityMask",
    "acl"
})
@XmlRootElement(name = "project")
public class Project {

    protected String name;
    protected String description;
    protected String projectPath;
    protected CTAcl capabilityMask;
    protected CTAcl acl;
    @XmlAttribute(name = "vcmId")
    protected String vcmId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the projectPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectPath() {
        return projectPath;
    }

    /**
     * Sets the value of the projectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectPath(String value) {
        this.projectPath = value;
    }

    /**
     * Gets the value of the capabilityMask property.
     * 
     * @return
     *     possible object is
     *     {@link CTAcl }
     *     
     */
    public CTAcl getCapabilityMask() {
        return capabilityMask;
    }

    /**
     * Sets the value of the capabilityMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAcl }
     *     
     */
    public void setCapabilityMask(CTAcl value) {
        this.capabilityMask = value;
    }

    /**
     * Gets the value of the acl property.
     * 
     * @return
     *     possible object is
     *     {@link CTAcl }
     *     
     */
    public CTAcl getAcl() {
        return acl;
    }

    /**
     * Sets the value of the acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAcl }
     *     
     */
    public void setAcl(CTAcl value) {
        this.acl = value;
    }

    /**
     * Gets the value of the vcmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcmId() {
        return vcmId;
    }

    /**
     * Sets the value of the vcmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcmId(String value) {
        this.vcmId = value;
    }

}