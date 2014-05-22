package it.aco.mandragora.dao.impl.ojb;

import java.util.ArrayList;
import java.util.HashMap;


public class ValueObjectToLinkAndStoreMap {

    private Object valueObject;

    private HashMap<String,ArrayList<String>> toLinkMap;
    private HashMap<String,ArrayList<String>> toStoreMap;
    //private HashMap<String,ArrayList<String>> oneToNReferenceLinkCascadingStoreMap;

    public ValueObjectToLinkAndStoreMap() {
    }

    public ValueObjectToLinkAndStoreMap(Object valueObject, HashMap<String, ArrayList<String>> toLinkMap, HashMap<String, ArrayList<String>> toStoreMap) {
        this.valueObject = valueObject;
        this.toLinkMap = toLinkMap;
        this.toStoreMap = toStoreMap;
    }

    public ValueObjectToLinkAndStoreMap(Object valueObject, HashMap<String, ArrayList<String>> toLinkMap, HashMap<String, ArrayList<String>> toStoreMap1, HashMap<String, ArrayList<String>> toStoreMap2) {
        this.valueObject = valueObject;
        this.toLinkMap = toLinkMap;
        this.toStoreMap = new  HashMap<String, ArrayList<String>>();
        toStoreMap.putAll(toStoreMap1);
        toStoreMap.putAll(toStoreMap2);
    }

    public Object getValueObject() {
        return valueObject;
    }

    public void setValueObject(Object valueObject) {
        this.valueObject = valueObject;
    }

    public HashMap<String, ArrayList<String>> getToLinkMap() {
        return toLinkMap;
    }

    public void setToLinkMap(HashMap<String, ArrayList<String>> toLinkMap) {
        this.toLinkMap = toLinkMap;
    }

    public HashMap<String, ArrayList<String>> getToStoreMap() {
        return toStoreMap;
    }

    public void setToStoreMap(HashMap<String, ArrayList<String>> toStoreMap) {
        this.toStoreMap = toStoreMap;
    }
}
