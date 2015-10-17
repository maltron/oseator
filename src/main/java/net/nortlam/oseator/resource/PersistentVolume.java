package net.nortlam.oseator.resource;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name="persistentVolume")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"kind","apiVersion", "metada", "spec", "status"})
public class PersistentVolume implements Serializable {
    
    @XmlElement(name="kind", type=String.class, required=false)
    private String kind;
    
    @XmlElement(name="apiVersion", type=String.class, required=false)
    private String apiVersion;
    
    @XmlElement(name="metadata", type=ObjectMeta.class, required=false)
    private ObjectMeta metadata;
    
    @XmlElement(name="spec", type=PersistentVolumeSpec.class, required=false)
    private PersistentVolumeSpec spec;
    
    @XmlElement(name="status", type=PersistentVolumeStatus.class, required=false)
    private PersistentVolumeStatus status;
    
    
}
