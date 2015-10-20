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
 * Ceph filesystem that will be mounted on the host machine 
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "cephfs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"monitors", "user", "secretFile", "secretRef", "readOnly"})
public class CephFSVolumeSource implements Serializable {
    
    /**
     * a collection of Ceph monitors */
    @XmlElement(name="monitors", type=String[].class, required=true)
    private String[] monitors;

    /**
     * rados user name; default is admin; optional */
    @XmlElement(name="user", type=String.class, required=false)
    private String user;

    /**
     * path to secret for rados user; default is /etc/ceph/user.secret; optional */
    @XmlElement(name="secretFile", type=String.class, required=false)
    private String secretFile;

    /**
     * name of a secret to authenticate the user; if provided overrides keyring; 
     * optional */
    @XmlElement(name="secretRef", type=String.class, required=false)
    private String secretRef;

    /**
     * Ceph fs to be mounted with read-only permissions */
    @XmlElement(name="readOnly", type=String.class, required=false, defaultValue = "false")
    private boolean readOnly;
    
}
