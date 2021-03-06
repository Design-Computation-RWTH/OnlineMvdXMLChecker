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
 * <p>Java class for IfcElementAssemblyTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcElementAssemblyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accessory_assembly"/>
 *     &lt;enumeration value="arch"/>
 *     &lt;enumeration value="beam_grid"/>
 *     &lt;enumeration value="braced_frame"/>
 *     &lt;enumeration value="girder"/>
 *     &lt;enumeration value="reinforcement_unit"/>
 *     &lt;enumeration value="rigid_frame"/>
 *     &lt;enumeration value="slab_field"/>
 *     &lt;enumeration value="truss"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcElementAssemblyTypeEnum")
@XmlEnum
public enum IfcElementAssemblyTypeEnum {

    @XmlEnumValue("accessory_assembly")
    ACCESSORY_ASSEMBLY("accessory_assembly"),
    @XmlEnumValue("arch")
    ARCH("arch"),
    @XmlEnumValue("beam_grid")
    BEAM_GRID("beam_grid"),
    @XmlEnumValue("braced_frame")
    BRACED_FRAME("braced_frame"),
    @XmlEnumValue("girder")
    GIRDER("girder"),
    @XmlEnumValue("reinforcement_unit")
    REINFORCEMENT_UNIT("reinforcement_unit"),
    @XmlEnumValue("rigid_frame")
    RIGID_FRAME("rigid_frame"),
    @XmlEnumValue("slab_field")
    SLAB_FIELD("slab_field"),
    @XmlEnumValue("truss")
    TRUSS("truss"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcElementAssemblyTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcElementAssemblyTypeEnum fromValue(String v) {
        for (IfcElementAssemblyTypeEnum c: IfcElementAssemblyTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
