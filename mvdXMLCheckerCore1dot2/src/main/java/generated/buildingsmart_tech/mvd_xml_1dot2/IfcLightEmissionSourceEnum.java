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
 * <p>Java class for IfcLightEmissionSourceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcLightEmissionSourceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="compactfluorescent"/>
 *     &lt;enumeration value="fluorescent"/>
 *     &lt;enumeration value="highpressuremercury"/>
 *     &lt;enumeration value="highpressuresodium"/>
 *     &lt;enumeration value="lightemittingdiode"/>
 *     &lt;enumeration value="lowpressuresodium"/>
 *     &lt;enumeration value="lowvoltagehalogen"/>
 *     &lt;enumeration value="mainvoltagehalogen"/>
 *     &lt;enumeration value="metalhalide"/>
 *     &lt;enumeration value="tungstenfilament"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcLightEmissionSourceEnum")
@XmlEnum
public enum IfcLightEmissionSourceEnum {

    @XmlEnumValue("compactfluorescent")
    COMPACTFLUORESCENT("compactfluorescent"),
    @XmlEnumValue("fluorescent")
    FLUORESCENT("fluorescent"),
    @XmlEnumValue("highpressuremercury")
    HIGHPRESSUREMERCURY("highpressuremercury"),
    @XmlEnumValue("highpressuresodium")
    HIGHPRESSURESODIUM("highpressuresodium"),
    @XmlEnumValue("lightemittingdiode")
    LIGHTEMITTINGDIODE("lightemittingdiode"),
    @XmlEnumValue("lowpressuresodium")
    LOWPRESSURESODIUM("lowpressuresodium"),
    @XmlEnumValue("lowvoltagehalogen")
    LOWVOLTAGEHALOGEN("lowvoltagehalogen"),
    @XmlEnumValue("mainvoltagehalogen")
    MAINVOLTAGEHALOGEN("mainvoltagehalogen"),
    @XmlEnumValue("metalhalide")
    METALHALIDE("metalhalide"),
    @XmlEnumValue("tungstenfilament")
    TUNGSTENFILAMENT("tungstenfilament"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcLightEmissionSourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcLightEmissionSourceEnum fromValue(String v) {
        for (IfcLightEmissionSourceEnum c: IfcLightEmissionSourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}