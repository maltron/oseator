/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.nortlam.oseator.resource.v1;

import java.io.Serializable;
import java.util.Objects;
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
    @XmlElement(name="readOnly", type=boolean.class, required=false, defaultValue = "false")
    private boolean readOnly;

    public NFSVolumeSource() {
    }

    public NFSVolumeSource(String server, String path) {
        this.server = server;
        this.path = path;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.server);
        hash = 71 * hash + Objects.hashCode(this.path);
        hash = 71 * hash + (this.readOnly ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NFSVolumeSource other = (NFSVolumeSource) obj;
        if (!Objects.equals(this.server, other.server)) {
            return false;
        }
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        if (this.readOnly != other.readOnly) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<nfs>");
        builder.append("<server>").append(server != null ? server : "NULL")
                .append("</server>");
        builder.append("<path>").append(path != null ? path : "NULL")
                .append("</path>");
        builder.append("<readOnly>").append(readOnly).append("</readOnly>");
        builder.append("</nfs>");
        
        return builder.toString();
    }
    
}
