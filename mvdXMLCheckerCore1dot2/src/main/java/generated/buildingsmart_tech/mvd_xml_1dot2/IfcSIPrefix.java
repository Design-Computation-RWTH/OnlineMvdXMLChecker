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
 * <p>Java class for IfcSIPrefix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcSIPrefix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exa"/>
 *     &lt;enumeration value="peta"/>
 *     &lt;enumeration value="tera"/>
 *     &lt;enumeration value="giga"/>
 *     &lt;enumeration value="mega"/>
 *     &lt;enumeration value="kilo"/>
 *     &lt;enumeration value="hecto"/>
 *     &lt;enumeration value="deca"/>
 *     &lt;enumeration value="deci"/>
 *     &lt;enumeration value="centi"/>
 *     &lt;enumeration value="milli"/>
 *     &lt;enumeration value="micro"/>
 *     &lt;enumeration value="nano"/>
 *     &lt;enumeration value="pico"/>
 *     &lt;enumeration value="femto"/>
 *     &lt;enumeration value="atto"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcSIPrefix")
@XmlEnum
public enum IfcSIPrefix {

    @XmlEnumValue("exa")
    EXA("exa"),
    @XmlEnumValue("peta")
    PETA("peta"),
    @XmlEnumValue("tera")
    TERA("tera"),
    @XmlEnumValue("giga")
    GIGA("giga"),
    @XmlEnumValue("mega")
    MEGA("mega"),
    @XmlEnumValue("kilo")
    KILO("kilo"),
    @XmlEnumValue("hecto")
    HECTO("hecto"),
    @XmlEnumValue("deca")
    DECA("deca"),
    @XmlEnumValue("deci")
    DECI("deci"),
    @XmlEnumValue("centi")
    CENTI("centi"),
    @XmlEnumValue("milli")
    MILLI("milli"),
    @XmlEnumValue("micro")
    MICRO("micro"),
    @XmlEnumValue("nano")
    NANO("nano"),
    @XmlEnumValue("pico")
    PICO("pico"),
    @XmlEnumValue("femto")
    FEMTO("femto"),
    @XmlEnumValue("atto")
    ATTO("atto");
    private final String value;

    IfcSIPrefix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcSIPrefix fromValue(String v) {
        for (IfcSIPrefix c: IfcSIPrefix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
