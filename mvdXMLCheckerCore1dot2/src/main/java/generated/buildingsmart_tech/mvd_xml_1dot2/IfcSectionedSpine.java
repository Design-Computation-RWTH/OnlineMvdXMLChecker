//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for IfcSectionedSpine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSectionedSpine">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcGeometricRepresentationItem">
 *       &lt;sequence>
 *         &lt;element name="SpineCurve" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcCompositeCurve"/>
 *         &lt;element name="CrossSections">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcProfileDef" maxOccurs="unbounded" minOccurs="2"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcProfileDef""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="list""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CrossSectionPositions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAxis2Placement3D" maxOccurs="unbounded" minOccurs="2"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcAxis2Placement3D""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="list""/>
 *                 &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSectionedSpine", propOrder = {
    "spineCurve",
    "crossSections",
    "crossSectionPositions"
})
public class IfcSectionedSpine
    extends IfcGeometricRepresentationItem
{

    @XmlElement(name = "SpineCurve", required = true, nillable = true)
    protected IfcCompositeCurve spineCurve;
    @XmlElement(name = "CrossSections", required = true)
    protected IfcSectionedSpine.CrossSections crossSections;
    @XmlElement(name = "CrossSectionPositions", required = true)
    protected IfcSectionedSpine.CrossSectionPositions crossSectionPositions;

    /**
     * Gets the value of the spineCurve property.
     * 
     * @return
     *     possible object is
     *     {@link IfcCompositeCurve }
     *     
     */
    public IfcCompositeCurve getSpineCurve() {
        return spineCurve;
    }

    /**
     * Sets the value of the spineCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcCompositeCurve }
     *     
     */
    public void setSpineCurve(IfcCompositeCurve value) {
        this.spineCurve = value;
    }

    /**
     * Gets the value of the crossSections property.
     * 
     * @return
     *     possible object is
     *     {@link IfcSectionedSpine.CrossSections }
     *     
     */
    public IfcSectionedSpine.CrossSections getCrossSections() {
        return crossSections;
    }

    /**
     * Sets the value of the crossSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcSectionedSpine.CrossSections }
     *     
     */
    public void setCrossSections(IfcSectionedSpine.CrossSections value) {
        this.crossSections = value;
    }

    /**
     * Gets the value of the crossSectionPositions property.
     * 
     * @return
     *     possible object is
     *     {@link IfcSectionedSpine.CrossSectionPositions }
     *     
     */
    public IfcSectionedSpine.CrossSectionPositions getCrossSectionPositions() {
        return crossSectionPositions;
    }

    /**
     * Sets the value of the crossSectionPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcSectionedSpine.CrossSectionPositions }
     *     
     */
    public void setCrossSectionPositions(IfcSectionedSpine.CrossSectionPositions value) {
        this.crossSectionPositions = value;
    }


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
     *         &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcAxis2Placement3D" maxOccurs="unbounded" minOccurs="2"/>
     *       &lt;/sequence>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcAxis2Placement3D""/>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="list""/>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcAxis2Placement3D"
    })
    public static class CrossSectionPositions {

        @XmlElement(name = "IfcAxis2Placement3D", required = true, nillable = true)
        protected List<IfcAxis2Placement3D> ifcAxis2Placement3D;
        @XmlAttribute(name = "itemType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<QName> itemType;
        @XmlAttribute(name = "cType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<AggregateType> cType;
        @XmlAttribute(name = "arraySize", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<BigInteger> arraySize;

        /**
         * Gets the value of the ifcAxis2Placement3D property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcAxis2Placement3D property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcAxis2Placement3D().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IfcAxis2Placement3D }
         * 
         * 
         */
        public List<IfcAxis2Placement3D> getIfcAxis2Placement3D() {
            if (ifcAxis2Placement3D == null) {
                ifcAxis2Placement3D = new ArrayList<IfcAxis2Placement3D>();
            }
            return this.ifcAxis2Placement3D;
        }

        /**
         * Gets the value of the itemType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QName }
         * 
         * 
         */
        public List<QName> getItemType() {
            if (itemType == null) {
                itemType = new ArrayList<QName>();
            }
            return this.itemType;
        }

        /**
         * Gets the value of the cType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AggregateType }
         * 
         * 
         */
        public List<AggregateType> getCType() {
            if (cType == null) {
                cType = new ArrayList<AggregateType>();
            }
            return this.cType;
        }

        /**
         * Gets the value of the arraySize property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arraySize property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArraySize().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getArraySize() {
            if (arraySize == null) {
                arraySize = new ArrayList<BigInteger>();
            }
            return this.arraySize;
        }

    }


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
     *         &lt;element ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcProfileDef" maxOccurs="unbounded" minOccurs="2"/>
     *       &lt;/sequence>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}itemType fixed="ifc:IfcProfileDef""/>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}cType fixed="list""/>
     *       &lt;attribute ref="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}arraySize"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ifcProfileDef"
    })
    public static class CrossSections {

        @XmlElementRef(name = "IfcProfileDef", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class)
        protected List<JAXBElement<? extends IfcProfileDef>> ifcProfileDef;
        @XmlAttribute(name = "itemType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<QName> itemType;
        @XmlAttribute(name = "cType", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<AggregateType> cType;
        @XmlAttribute(name = "arraySize", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1")
        protected List<BigInteger> arraySize;

        /**
         * Gets the value of the ifcProfileDef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ifcProfileDef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIfcProfileDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link IfcAsymmetricIShapeProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcRectangleProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcTrapeziumProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcLShapeProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCircleProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCShapeProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcMirroredProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcEllipseProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCenterLineProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcRoundedRectangleProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcParameterizedProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcArbitraryOpenProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcRectangleHollowProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCompositeProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcArbitraryClosedProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcZShapeProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcCircleHollowProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcUShapeProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcIShapeProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcArbitraryProfileDefWithVoids }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcDerivedProfileDef }{@code >}
         * {@link JAXBElement }{@code <}{@link IfcTShapeProfileDef }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends IfcProfileDef>> getIfcProfileDef() {
            if (ifcProfileDef == null) {
                ifcProfileDef = new ArrayList<JAXBElement<? extends IfcProfileDef>>();
            }
            return this.ifcProfileDef;
        }

        /**
         * Gets the value of the itemType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QName }
         * 
         * 
         */
        public List<QName> getItemType() {
            if (itemType == null) {
                itemType = new ArrayList<QName>();
            }
            return this.itemType;
        }

        /**
         * Gets the value of the cType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AggregateType }
         * 
         * 
         */
        public List<AggregateType> getCType() {
            if (cType == null) {
                cType = new ArrayList<AggregateType>();
            }
            return this.cType;
        }

        /**
         * Gets the value of the arraySize property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arraySize property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArraySize().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getArraySize() {
            if (arraySize == null) {
                arraySize = new ArrayList<BigInteger>();
            }
            return this.arraySize;
        }

    }

}