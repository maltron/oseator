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
 * name of a secret to authenticate the RBD user; if provided overrides keyring; 
 * optional; 
 * 
 * see http://releases.k8s.io/HEAD/examples/rbd/README.md#how-to-use-it
 * 
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name = "secretRef")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"server", "path", "readOnly"})
public class LocalObjectReference implements Serializable {
    
    /**
     * name of the referent; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/identifiers.md#names */
    @XmlElement(name="name", type=String.class, required=false)
    private String name;

    public LocalObjectReference() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
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
        final LocalObjectReference other = (LocalObjectReference) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<secretRef>");
        builder.append("<name>").append(name != null ? name : "NULL").append("</name>");
        builder.append("</secretRef>");
        
        return builder.toString();
    }
}
