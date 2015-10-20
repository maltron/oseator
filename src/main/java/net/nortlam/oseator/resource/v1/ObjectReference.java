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
 *
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name="spec")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"kind","namespace", "name", "uid", "apiVersion", 
    "resourceVersion", "fieldPath"})
public class ObjectReference implements Serializable {
    
    /**
     * kind of the referent; 
     * 
     * see http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds */
    @XmlElement(name="kind", type=String.class, required=false)
    private String kind;

    /**
     * namespace of the referent; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/namespaces.md */
    @XmlElement(name="namespace", type=String.class, required=false)
    private String namespace;

    /**
     * name of the referent; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/identifiers.md#names */
    @XmlElement(name="name", type=String.class, required=false)
    private String name;

    /**
     * uid of the referent; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/identifiers.md#uids */
    @XmlElement(name="uid", type=String.class, required=false)
    private String uid;

    /**
     * API version of the referent */
    @XmlElement(name="apiVersion", type=String.class, required=false)
    private String apiVersion;

    /**
     * specific resourceVersion to which this reference is made, if any: 
     * 
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#concurrency-control-and-consistency */
    @XmlElement(name="resourceVersion", type=String.class, required=false)
    private String resourceVersion;

    /**
     * if referring to a piece of an object instead of an entire object, 
     * this string should contain a valid JSON/Go field access statement, 
     * such as desiredState.manifest.containers[2] */
    @XmlElement(name="fieldPath", type=String.class, required=false)
    private String fieldPath;

    public ObjectReference() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.kind);
        hash = 79 * hash + Objects.hashCode(this.namespace);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.uid);
        hash = 79 * hash + Objects.hashCode(this.apiVersion);
        hash = 79 * hash + Objects.hashCode(this.resourceVersion);
        hash = 79 * hash + Objects.hashCode(this.fieldPath);
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
        final ObjectReference other = (ObjectReference) obj;
        if (!Objects.equals(this.kind, other.kind)) {
            return false;
        }
        if (!Objects.equals(this.namespace, other.namespace)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.uid, other.uid)) {
            return false;
        }
        if (!Objects.equals(this.apiVersion, other.apiVersion)) {
            return false;
        }
        if (!Objects.equals(this.resourceVersion, other.resourceVersion)) {
            return false;
        }
        if (!Objects.equals(this.fieldPath, other.fieldPath)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<ObjectReference>");
        builder.append("<kind>").append(kind != null ? kind : "NULL").append("</kind>");
        builder.append("<namespace>").append(namespace != null ? namespace : "NULL")
                .append("</namespace>");
        builder.append("<name>").append(name != null ? name : "NULL")
                .append("</name>");
        builder.append("<uid>").append(uid != null ? uid : "NULL")
                .append("</uid>");
        builder.append("<apiVersion>").append(apiVersion != null ? apiVersion : "NULL")
                .append("</apiVersion>");
        builder.append("<resourceVesion>").append(resourceVersion != null ? resourceVersion : "NULL")
                .append("</resourceVersion>");
        builder.append("<fieldPath>").append(fieldPath != null ? fieldPath : "NULL")
                .append("</fieldPath>");
        
        builder.append("</ObjectReference>");
        
        return builder.toString();
    }
}
