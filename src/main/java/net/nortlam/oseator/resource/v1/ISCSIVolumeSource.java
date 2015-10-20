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
 * an iSCSI disk resource provisioned by an admin
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "iscsi")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"targetPortal", "iqn", "lun", "fsType", "readOnly"})
public class ISCSIVolumeSource implements Serializable {
    
    /**
     * iSCSI target portal */
    @XmlElement(name="targetPortal", type=String.class, required=true)
    private String targetPortal;

    /**
     * iSCSI Qualified Name */
    @XmlElement(name="iqn", type=String.class, required=true)
    private String iqn;

    /**
     * iscsi target lun number */
    @XmlElement(name="lun", type=int.class, required=true)
    private int lun;

    /**
     * file system type to mount, such as ext4, xfs, ntfs */
    @XmlElement(name="fsType", type=String.class, required=true)
    private String fsType;

    /**
     * read-only if true, read-write otherwise (false or unspecified) */
    @XmlElement(name="readOnly", type=boolean.class, required=false, defaultValue = "false")
    private boolean readOnly;
    
}
