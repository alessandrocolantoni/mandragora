package it.aco.mandragora.dao.impl.ojb;

import org.apache.ojb.broker.Identity;

import java.util.Collection;
import java.util.ArrayList;


public class IdentityPaths {
    private Identity identity;
    private Collection paths;

    public IdentityPaths() {
    }

    public IdentityPaths(Identity identity) {
        this.identity = identity;
    }

    public IdentityPaths(Identity identity, Collection paths) {
        this.identity = identity;
        this.paths = paths;
    }

    public IdentityPaths(Identity identity, String path) {
        this.identity = identity;
        this.paths = new ArrayList();
        this.paths.add(path);
    }

    public IdentityPaths(IdentityPath identityPath) {
        this.identity = identityPath.getIdentity();
        this.paths = new ArrayList();
        this.paths.add(identityPath.getPath());

    }

    

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public Collection getPaths() {
        return paths;
    }

    public void setPaths(Collection paths) {
        this.paths = paths;
    }
}
