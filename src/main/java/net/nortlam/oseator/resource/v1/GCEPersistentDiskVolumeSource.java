/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.nortlam.oseator.resource.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * GCE disk resource provisioned by an admin; 
 * 
 * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#gcepersistentdisk
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "gcePersistentDisk")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"pdName", "fsType", "partition", "readOnly"})
public class GCEPersistentDiskVolumeSource implements Serializable {

    /**
     * unique name of the PD resource in GCE; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#gcepersistentdisk */
    @XmlElement(name="pdName", type=String.class, required=true)
    private String pdName;
    
    /**
     * file system type to mount, such as ext4, xfs, ntfs; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#gcepersistentdisk */
    @XmlElement(name="fsType", type=String.class, required=true)
    private String fsType;
    
    /**
     * partition on the disk to mount (e.g., '1' for /dev/sda1); 
     * if omitted the plain device name (e.g., /dev/sda) will be mounted; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#gcepersistentdisk */
    @XmlElement(name="partition", type=int.class, required=false)
    private int partition;
    
    /**
     * read-only if true, read-write otherwise (false or unspecified); 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#gcepersistentdisk */
    @XmlElement(name="readOnly", type=boolean.class, required=false)
    private boolean readOnly;
    
}
