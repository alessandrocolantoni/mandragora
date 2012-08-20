package it.aco.mandragora.dao.impl.jpa;

import java.util.ArrayList;
import java.util.Collection;


public class EntityPaths {

	private Object entity;
    private Collection paths;

    public EntityPaths() {
    }

    public EntityPaths(Object entity) {
        this.entity = entity;
    }

    public EntityPaths(Object entity, Collection paths) {
        this.entity = entity;
        this.paths = paths;
    }

    public EntityPaths(Object entity, String path) {
        this.entity = entity;
        this.paths = new ArrayList();
        this.paths.add(path);
    }

    public EntityPaths(EntityPath entityPath) {
        this.entity = entityPath.getEntity();
        this.paths = new ArrayList();
        this.paths.add(entityPath.getPath());

    }

	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}

	public Collection getPaths() {
		return paths;
	}

	public void setPaths(Collection paths) {
		this.paths = paths;
	}

    
    
    
}
