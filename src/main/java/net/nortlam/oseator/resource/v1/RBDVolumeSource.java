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
 * rados block volume that will be mounted on the host machine; 
 * 
 * see http://releases.k8s.io/HEAD/examples/rbd/README.md
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "rbd")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"monitors", "image", "fsType", "pool", "user", "keyring", 
    "secretRef", "readOnly"})
public class RBDVolumeSource implements Serializable {
    
    /**
     * a collection of Ceph monitors; 
     * 
     * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it */
    @XmlElement(name="monitors", type=String[].class, required=true)
    private String[] monitors;

    /**
     * rados image name; 
     * 
     * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it */
    @XmlElement(name="image", type=String.class, required=true)
    private String image;

    /**
     * file system type to mount, such as ext4, xfs, ntfs; 
     * 
     * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it */
    @XmlElement(name="fsType", type=String.class, required=false)
    private String fsType;

    /**
     * rados pool name; default is rbd; optional; 
     * 
     * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it */
    @XmlElement(name="pool", type=String.class, required=true)
    private String pool;

    /**
     * rados user name; default is admin; optional; 
     * 
     * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it */
    @XmlElement(name="user", type=String.class, required=true)
    private String user;

    /**
     * keyring is the path to key ring for rados user; default is /etc/ceph/keyring; 
     * optional; 
     * 
     * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it */
    @XmlElement(name="keyring", type=String.class, required=true)
    private String keyring;

    /**
     * name of a secret to authenticate the RBD user; if provided overrides keyring; 
     * optional; 
     * 
     * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it */
    @XmlElement(name="secretRef", type=LocalObjectReference.class, required=true)
    private LocalObjectReference secretRef;

    /**
     * rbd volume to be mounted with read-only permissions; 
     * 
     * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it */
    @XmlElement(name="readOnly", type=String[].class, required=false, defaultValue = "false")
    private boolean readOnly;
    
}
