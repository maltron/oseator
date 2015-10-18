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
 * Glusterfs volume resource provisioned by an admin; 
 * 
 * see http://releases.k8s.io/HEAD/examples/glusterfs/README.md
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "glusterfs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"endpoints", "path", "readOnly"})
public class GlusterfsVolumeSource implements Serializable {
    
    /**
     * gluster hosts endpoints name; 
     * 
     * see http://releases.k8s.io/HEAD/examples/glusterfs/README.md#create-a-pod */
    @XmlElement(name="endpoints", type=String.class, required=true)
    private String endpoints;
    
    /**
     * path to gluster volume; 
     * 
     * see http://releases.k8s.io/HEAD/examples/glusterfs/README.md#create-a-pod */
    @XmlElement(name="path", type=String.class, required=true)
    private String path;

    /**
     * glusterfs volume to be mounted with read-only permissions; 
     * 
     * see http://releases.k8s.io/HEAD/examples/glusterfs/README.md#create-a-pod */
    @XmlElement(name="readOnly", type=boolean.class, required=false, defaultValue = "false")
    private boolean readOnly;

    public GlusterfsVolumeSource() {
    }
    
    public GlusterfsVolumeSource(String endpoints, String path) {
        this.endpoints = endpoints;
        this.path = path;
    }

    public String getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(String endpoints) {
        this.endpoints = endpoints;
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
        hash = 37 * hash + Objects.hashCode(this.endpoints);
        hash = 37 * hash + Objects.hashCode(this.path);
        hash = 37 * hash + (this.readOnly ? 1 : 0);
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
        final GlusterfsVolumeSource other = (GlusterfsVolumeSource) obj;
        if (!Objects.equals(this.endpoints, other.endpoints)) {
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
        builder.append("<glusterfs>");
        builder.append("<endpoints>").append(endpoints != null ? endpoints : "NULL")
                .append("</endpoints>");
        builder.append("<path>").append(path != null ? path : "NULL")
                .append("</path>");
        builder.append("<readOnly>").append(readOnly).append("</readOnly>");
        builder.append("</glusterfs>");
        
        return builder.toString();
    }
    
    
    
}
