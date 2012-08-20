package it.aco.mandragora.dao.impl.jpa;


public class EntityPath {
    private Object entity;
    private String path;

    public EntityPath(Object entity, String path) {
        this.entity = entity;
        this.path = path;
    }

	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

    
}