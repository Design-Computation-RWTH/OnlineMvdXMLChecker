//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcOffsetCurve3D complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcOffsetCurve3D">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCurve">
 *       &lt;sequence>
 *         &lt;element name="BasisCurve" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCurve"/>
 *         &lt;element name="RefDirection" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcDirection"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Distance" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *       &lt;attribute name="SelfIntersect" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLogical" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcOffsetCurve3D", propOrder = {
    "basisCurve",
    "refDirection"
})
public class IfcOffsetCurve3D
    extends IfcCurve
{

    @XmlElement(name = "BasisCurve", required = true, nillable = true)
    protected IfcCurve basisCurve;
    @XmlElement(name = "RefDirection", required = true, nillable = true)
    protected IfcDirection refDirection;
    @XmlAttribute(name = "Distance")
    protected Double distance;
    @XmlAttribute(name = "SelfIntersect")
    protected Logical selfIntersect;

    /**
     * Gets the value of the basisCurve property.
     * 
     * @return
     *     possible object is
     *     {@link IfcCurve }
     *     
     */
    public IfcCurve getBasisCurve() {
        return basisCurve;
    }

    /**
     * Sets the value of the basisCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcCurve }
     *     
     */
    public void setBasisCurve(IfcCurve value) {
        this.basisCurve = value;
    }

    /**
     * Gets the value of the refDirection property.
     * 
     * @return
     *     possible object is
     *     {@link IfcDirection }
     *     
     */
    public IfcDirection getRefDirection() {
        return refDirection;
    }

    /**
     * Sets the value of the refDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcDirection }
     *     
     */
    public void setRefDirection(IfcDirection value) {
        this.refDirection = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistance(Double value) {
        this.distance = value;
    }

    /**
     * Gets the value of the selfIntersect property.
     * 
     * @return
     *     possible object is
     *     {@link Logical }
     *     
     */
    public Logical getSelfIntersect() {
        return selfIntersect;
    }

    /**
     * Sets the value of the selfIntersect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Logical }
     *     
     */
    public void setSelfIntersect(Logical value) {
        this.selfIntersect = value;
    }

}