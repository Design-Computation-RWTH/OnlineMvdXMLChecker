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
 * <p>Java class for IfcBeamTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcBeamTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="beam"/>
 *     &lt;enumeration value="joist"/>
 *     &lt;enumeration value="hollowcore"/>
 *     &lt;enumeration value="lintel"/>
 *     &lt;enumeration value="spandrel"/>
 *     &lt;enumeration value="t_beam"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcBeamTypeEnum")
@XmlEnum
public enum IfcBeamTypeEnum {

    @XmlEnumValue("beam")
    BEAM("beam"),
    @XmlEnumValue("joist")
    JOIST("joist"),
    @XmlEnumValue("hollowcore")
    HOLLOWCORE("hollowcore"),
    @XmlEnumValue("lintel")
    LINTEL("lintel"),
    @XmlEnumValue("spandrel")
    SPANDREL("spandrel"),
    @XmlEnumValue("t_beam")
    T_BEAM("t_beam"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcBeamTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcBeamTypeEnum fromValue(String v) {
        for (IfcBeamTypeEnum c: IfcBeamTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
