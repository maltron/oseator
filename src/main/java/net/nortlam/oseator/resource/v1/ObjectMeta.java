package net.nortlam.oseator.resource.v1;

import java.io.Serializable;
import java.util.Date;
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
@XmlRootElement(name = "metadata")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"name", "generateName", "namespace", "selflink", "uid",
    "resourceVersion", "generation", "creationTimestamp", "deletionTimestamp",
    "labels", "annotations"})
public class ObjectMeta implements Serializable {
    
    /**
     * string that identifies an object. Must be unique within a namespace; 
     * cannot be updated; 
     * see http://releases.k8s.io/HEAD/docs/user-guide/identifiers.md#names */
    @XmlElement(name = "name", type = String.class, required=false)
    private String name;
    
    /**
     * an optional prefix to use to generate a unique name; 
     * has the same validation rules as name; 
     * optional, and is applied only name if is not specified; 
     * see http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#idempotency
     */
    @XmlElement(name = "generateName", type=String.class, required=false)
    private String generateName;
    
    /**
     * namespace of the object; must be a DNS_LABEL; 
     * cannot be updated; 
     * see http://releases.k8s.io/HEAD/docs/user-guide/namespaces.md
     */
    @XmlElement(name = "namespace", type=String.class, required=false)
    private String namespace;
    
    /**
     * URL for the object; populated by the system, read-only */
    @XmlElement(name = "selflink", type=String.class, required=false)
    private String selfLink;
    
    /**
     * unique UUID across space and time; populated by the system; 
     * read-only; 
     * see http://releases.k8s.io/HEAD/docs/user-guide/identifiers.md#uids */
    @XmlElement(name = "uid", type=String.class, required=false)
    private String uid;
    
    /**
     * string that identifies the internal version of this object that 
     * can be used by clients to determine when objects have changed; 
     * populated by the system, read-only; 
     * value must be treated as opaque by clients and passed unmodified 
     * back to the server: 
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#concurrency-control-and-consistency */
    @XmlElement(name = "resourceVersion", type=String.class, required=false)
    private String resourceVersion;
    
    /**
     * a sequence number representing a specific generation 
     * of the desired state; populated by the system; read-only */
    @XmlElement(name = "generation", type=int.class, required=false)
    private int generation;
    
    /**
     * RFC 3339 date and time at which the object was created; 
     * populated by the system, read-only; null for lists; 
     * see http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata */
    @XmlElement(name = "name", type=Date.class, required=false)
    private Date creationTimestamp;
    
    /**
     * RFC 3339 date and time at which the object will be deleted; 
     * populated by the system when a graceful deletion is requested, 
     * read-only; if not set, graceful deletion of the object has not been requested; 
     * see http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata */
    @XmlElement(name = "deletionTimestamp", type=Date.class, required=false)
    private Date deletionTimestamp;
    
    /**
     * map of string keys and values that can be used to organize 
     * and categorize objects; may match selectors of replication 
     * controllers and services; 
     * see http://releases.k8s.io/HEAD/docs/user-guide/labels.md */
    @XmlElement(name = "labels", type=Object.class, required=false)
    private Object labels;
    
    /**
     * map of string keys and values that can be used by external 
     * tooling to store and retrieve arbitrary metadata about objects; 
     * see http://releases.k8s.io/HEAD/docs/user-guide/annotations.md */
    @XmlElement(name = "annotations", type=Object.class, required=false)
    private Object annotations;

    public ObjectMeta() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenerateName() {
        return generateName;
    }

    public void setGenerateName(String generateName) {
        this.generateName = generateName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public Date getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Date getDeletionTimestamp() {
        return deletionTimestamp;
    }

    public void setDeletionTimestamp(Date deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
    }

    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public Object getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Object annotations) {
        this.annotations = annotations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.generateName);
        hash = 37 * hash + Objects.hashCode(this.namespace);
        hash = 37 * hash + Objects.hashCode(this.selfLink);
        hash = 37 * hash + Objects.hashCode(this.uid);
        hash = 37 * hash + Objects.hashCode(this.resourceVersion);
        hash = 37 * hash + this.generation;
        hash = 37 * hash + Objects.hashCode(this.creationTimestamp);
        hash = 37 * hash + Objects.hashCode(this.deletionTimestamp);
        hash = 37 * hash + Objects.hashCode(this.labels);
        hash = 37 * hash + Objects.hashCode(this.annotations);
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
        final ObjectMeta other = (ObjectMeta) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.generateName, other.generateName)) {
            return false;
        }
        if (!Objects.equals(this.namespace, other.namespace)) {
            return false;
        }
        if (!Objects.equals(this.selfLink, other.selfLink)) {
            return false;
        }
        if (!Objects.equals(this.uid, other.uid)) {
            return false;
        }
        if (!Objects.equals(this.resourceVersion, other.resourceVersion)) {
            return false;
        }
        if (this.generation != other.generation) {
            return false;
        }
        if (!Objects.equals(this.creationTimestamp, other.creationTimestamp)) {
            return false;
        }
        if (!Objects.equals(this.deletionTimestamp, other.deletionTimestamp)) {
            return false;
        }
        if (!Objects.equals(this.labels, other.labels)) {
            return false;
        }
        if (!Objects.equals(this.annotations, other.annotations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<metadata>");
        builder.append("<name>").append(name != null ? name : "NULL").append("</name>");
        builder.append("<generateName>")
                .append(generateName != null ? generateName : "NULL").append("</generateName>");
        builder.append("<namespace>").append(namespace != null ? namespace : "NULL").append("</namespace>");
        builder.append("<selfLink>").append(selfLink != null ? selfLink : "NULL").append("</selfLink>");
        builder.append("<uid>").append(uid != null ? uid : "NULL").append("</uid>");
        builder.append("<resourceVersion>").append(resourceVersion != null ? resourceVersion : "NULL")
                .append("</resourceVersion>");
        builder.append("<generation>").append(generation > 0 ? generation : "ZERO").append("</generation>");
        builder.append("<creationTimestamp>").append(creationTimestamp != null ? creationTimestamp : "NULL")
                .append("</creatiionTimestamp>");
        builder.append("<deletionTimestamp>").append(deletionTimestamp != null ? deletionTimestamp : "NULL")
                .append("</deletionTimestamp>");
        builder.append("<labels>").append(labels != null ? labels : "NULL").append("</labels>");
        builder.append("<annotations>").append(annotations != null ? annotations : "NULL").append("</annotations>");
        
        builder.append("</metadata>");
        
        return builder.toString();
    }
}
