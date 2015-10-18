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
 * AWS disk resource provisioned by an admin; 
 * 
 * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#awselasticblockstore
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "awsElasticBlockStore")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"volumeID", "fsType", "partition", "readOnly"})
public class AWSElasticBlockStoreVolumeSource implements Serializable {
    
    /**
     * unique id of the PD resource in AWS; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#awselasticblockstore */
    @XmlElement(name="volumeID", type=String.class, required=true)
    private String volumeID;

    /**
     * file system type to mount, such as ext4, xfs, ntfs; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#awselasticblockstore */
    @XmlElement(name="fsType", type=String.class, required=true)
    private String fsType;

    /**
     * partition on the disk to mount (e.g., '1' for /dev/sda1); 
     * if omitted the plain device name (e.g., /dev/sda) will be mounted; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#awselasticblockstore */
    @XmlElement(name="partition", type=int.class, required=false)
    private int partition;

    /**
     * read-only if true, read-write otherwise (false or unspecified); 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#awselasticblockstore */
    @XmlElement(name="readOnly", type=boolean.class, required=false, defaultValue = "false")
    private boolean readOnly;
    
}
