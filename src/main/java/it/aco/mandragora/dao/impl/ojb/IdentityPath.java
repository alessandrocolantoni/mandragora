package it.aco.mandragora.dao.impl.ojb;

import org.apache.ojb.broker.Identity;


public class IdentityPath {
    private Identity identity;
    private String path;

    public IdentityPath(Identity identity, String path) {
        this.identity = identity;
        this.path = path;
    }

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
