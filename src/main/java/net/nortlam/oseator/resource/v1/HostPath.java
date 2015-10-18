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
 * a HostPath provisioned by a developer or tester; for development use only; 
 * 
 * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#hostpath
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "hostPath")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"path"})
public class HostPath implements Serializable {
    
    /**
     * path of the directory on the host; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#hostpath */
    @XmlElement(name="path", type=String.class, required=true)
    private String path;

    public HostPath() {
    }

    public HostPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.path);
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
        final HostPath other = (HostPath) obj;
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<hostPath>");
        builder.append("<path>").append(path != null ? path : "NULL").append("</path>");
        builder.append("</hostPath>");
        
        return builder.toString();
    }
    
}
