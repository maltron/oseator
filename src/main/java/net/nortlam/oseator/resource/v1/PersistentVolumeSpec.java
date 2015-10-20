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
 *
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
@XmlRootElement(name="spec")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder={"kind","apiVersion", "metada", "spec", "status"})
public class PersistentVolumeSpec implements Serializable {
    
    /**
     * a description of the persistent volume’s resources and capacityr; 
     * see http://releases.k8s.io/HEAD/docs/user-guide/persistent-volumes.md#capacity */
    @XmlElement(name="capacity", type=int.class, required=false)
    private int capacity;

    /**
     * GCE disk resource provisioned by an admin; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#gcepersistentdisk */
    @XmlElement(name="gcePersistentDisk", type=GCEPersistentDiskVolumeSource.class, required=false)
    private GCEPersistentDiskVolumeSource gcePersistentDisk;
    
    /**
     * AWS disk resource provisioned by an admin; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#awselasticblockstore */
    @XmlElement(name="awsElasticBlockStore", type=AWSElasticBlockStoreVolumeSource.class, required=false)
    private AWSElasticBlockStoreVolumeSource awsElasticBlockStore;
    
    /**
     * a HostPath provisioned by a developer or tester; for development use only; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#hostpath */
    @XmlElement(name="hostPath", type=HostPath.class, required=false)
    private HostPath hostPath;
    
    /**
     * Glusterfs volume resource provisioned by an admin; 
     * 
     * see http://releases.k8s.io/HEAD/examples/glusterfs/README.md */
    @XmlElement(name="glusterfs", type=GlusterfsVolumeSource.class, required=false)
    private GlusterfsVolumeSource glusterfs;

    /**
     * NFS volume resource provisioned by an admin; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/volumes.md#nfs */
    @XmlElement(name="nfs", type=NFSVolumeSource.class, required=false)
    private NFSVolumeSource nfs;
    
    private RBDVolumeSource rbd;
    private ISCSIVolumeSource iscsi;
    private CephFSVolumeSource cephfs;
    private Object accessModes;
    
    /**
     * when bound, a reference to the bound claim; 
     * 
     * see http://releases.k8s.io/HEAD/docs/user-guide/persistent-volumes.md#binding */
    @XmlElement(name="claimRef", type=ObjectReference.class, required=false)
    private ObjectReference claimRef;
    
    public static final String PERSISTENT_VOLUME_RECLAIM_POLICY_RETAIN = "Retain";
    public static final String PERSISTENT_VOLUME_RECLAIM_POLICY_RECYCLE = "Recycle";
    /**
     * what happens to a volume when released from its claim; 
     * Valid options are Retain (default) and Recycle. 
     * Recyling must be supported by the volume plugin underlying 
     * this persistent volume. 
     * 
     * See http://releases.k8s.io/HEAD/docs/user-guide/persistent-volumes.md#recycling-policy */
    @XmlElement(name="persistentVolumeReclaimPolicy", type=String.class, required=false)
    private String persistentVolumeReclaimPolicy;
}
