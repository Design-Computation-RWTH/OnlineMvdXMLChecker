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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcTrapeziumProfileDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcTrapeziumProfileDef">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcParameterizedProfileDef">
 *       &lt;attribute name="BottomXDim" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="TopXDim" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="YDim" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPositiveLengthMeasure" />
 *       &lt;attribute name="TopXOffset" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcTrapeziumProfileDef")
public class IfcTrapeziumProfileDef
    extends IfcParameterizedProfileDef
{

    @XmlAttribute(name = "BottomXDim")
    protected Double bottomXDim;
    @XmlAttribute(name = "TopXDim")
    protected Double topXDim;
    @XmlAttribute(name = "YDim")
    protected Double yDim;
    @XmlAttribute(name = "TopXOffset")
    protected Double topXOffset;

    /**
     * Gets the value of the bottomXDim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomXDim() {
        return bottomXDim;
    }

    /**
     * Sets the value of the bottomXDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomXDim(Double value) {
        this.bottomXDim = value;
    }

    /**
     * Gets the value of the topXDim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopXDim() {
        return topXDim;
    }

    /**
     * Sets the value of the topXDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopXDim(Double value) {
        this.topXDim = value;
    }

    /**
     * Gets the value of the yDim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYDim() {
        return yDim;
    }

    /**
     * Sets the value of the yDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYDim(Double value) {
        this.yDim = value;
    }

    /**
     * Gets the value of the topXOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopXOffset() {
        return topXOffset;
    }

    /**
     * Sets the value of the topXOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopXOffset(Double value) {
        this.topXOffset = value;
    }

}