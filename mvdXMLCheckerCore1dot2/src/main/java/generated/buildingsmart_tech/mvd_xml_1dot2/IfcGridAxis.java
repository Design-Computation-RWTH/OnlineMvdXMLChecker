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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IfcGridAxis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcGridAxis">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Entity">
 *       &lt;sequence>
 *         &lt;element name="AxisCurve" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCurve"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AxisTag" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *       &lt;attribute name="SameSense" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcBoolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcGridAxis", propOrder = {
    "axisCurve"
})
public class IfcGridAxis
    extends Entity
{

    @XmlElement(name = "AxisCurve", required = true, nillable = true)
    protected IfcCurve axisCurve;
    @XmlAttribute(name = "AxisTag")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String axisTag;
    @XmlAttribute(name = "SameSense")
    protected Boolean sameSense;

    /**
     * Gets the value of the axisCurve property.
     * 
     * @return
     *     possible object is
     *     {@link IfcCurve }
     *     
     */
    public IfcCurve getAxisCurve() {
        return axisCurve;
    }

    /**
     * Sets the value of the axisCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcCurve }
     *     
     */
    public void setAxisCurve(IfcCurve value) {
        this.axisCurve = value;
    }

    /**
     * Gets the value of the axisTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisTag() {
        return axisTag;
    }

    /**
     * Sets the value of the axisTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisTag(String value) {
        this.axisTag = value;
    }

    /**
     * Gets the value of the sameSense property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameSense() {
        return sameSense;
    }

    /**
     * Sets the value of the sameSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameSense(Boolean value) {
        this.sameSense = value;
    }

}
