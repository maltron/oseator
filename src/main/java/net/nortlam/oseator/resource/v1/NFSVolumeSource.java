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
 * NFS volume resource provisioned by an admin; 
 * 
 * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#nfs
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "nfs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"server", "path", "readOnly"})
public class NFSVolumeSource implements Serializable {
    
    /**
     * the hostname or IP address of the NFS server; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#nfs */
    @XmlElement(name="server", type=String.class, required=true)
    private String server;

    /**
     * the path that is exported by the NFS server; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#nfs */
    @XmlElement(name="path", type=String.class, required=true)
    private String path;

    /**
     * forces the NFS export to be mounted with read-only permissions; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#nfs */
    @XmlElement(name="readOnly", type=boolean.class, required=false)
    private boolean readOnly;
    
}
