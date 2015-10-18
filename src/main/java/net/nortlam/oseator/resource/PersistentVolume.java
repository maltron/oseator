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
    
    /**
     * kind of object, in CamelCase; cannot be updated; 
     * see http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds */
    @XmlElement(name="kind", type=String.class, required=false)
    private String kind;

    /**
     * version of the schema the object should have; 
     * see http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources */
    @XmlElement(name="apiVersion", type=String.class, required=false)
    private String apiVersion;

    /**
     * standard object metadata; 
     * see http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata */
    @XmlElement(name="metadata", type=ObjectMeta.class, required=false)
    private ObjectMeta metadata;

    /**
     * specification of a persistent volume as provisioned by an administrator; 
     * see http://releases.k8s.io/HEAD/docs/user-guide/persistent-volumes.md#persistent-volumes */
    @XmlElement(name="spec", type=PersistentVolumeSpec.class, required=false)
    private PersistentVolumeSpec spec;

    /**
     * current status of a persistent volume; populated by the system, 
     * read-only; 
     * see http://releases.k8s.io/HEAD/docs/user-guide/persistent-volumes.md#persistent-volumes */
    @XmlElement(name="status", type=PersistentVolumeStatus.class, required=false)
    private PersistentVolumeStatus status;
    
    
}
