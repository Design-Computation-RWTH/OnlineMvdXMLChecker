//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcTimeSeriesDataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcTimeSeriesDataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="continuous"/>
 *     &lt;enumeration value="discrete"/>
 *     &lt;enumeration value="discretebinary"/>
 *     &lt;enumeration value="piecewisebinary"/>
 *     &lt;enumeration value="piecewiseconstant"/>
 *     &lt;enumeration value="piecewisecontinuous"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcTimeSeriesDataTypeEnum")
@XmlEnum
public enum IfcTimeSeriesDataTypeEnum {

    @XmlEnumValue("continuous")
    CONTINUOUS("continuous"),
    @XmlEnumValue("discrete")
    DISCRETE("discrete"),
    @XmlEnumValue("discretebinary")
    DISCRETEBINARY("discretebinary"),
    @XmlEnumValue("piecewisebinary")
    PIECEWISEBINARY("piecewisebinary"),
    @XmlEnumValue("piecewiseconstant")
    PIECEWISECONSTANT("piecewiseconstant"),
    @XmlEnumValue("piecewisecontinuous")
    PIECEWISECONTINUOUS("piecewisecontinuous"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcTimeSeriesDataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcTimeSeriesDataTypeEnum fromValue(String v) {
        for (IfcTimeSeriesDataTypeEnum c: IfcTimeSeriesDataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}