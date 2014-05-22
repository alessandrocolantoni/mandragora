package it.aco.mandragora.bd.context;

import org.apache.commons.chain.Context;
import it.aco.mandragora.exception.ApplicationException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

/**
 * This interface deals with the methods having the same  names of the methods  of the interface {@link it.aco.mandragora.bd.BD}, but as attribute, having only an instance
 * of the class {@link Context}. So for each one of the distinct names <code>methodName</code> of the methods of the interface {@link it.aco.mandragora.bd.BD}
 * there will be a method <code>methodName(Context context)</code> in this interface. The behavior of such method wil be the same of
 * one of the methods in {@link it.aco.mandragora.bd.BD} having the same name; which one, if there is more than one, will depend on the same parameter <code>context</code>.
 * The parameters <code>context</code> of a method of this interface must have as keys the strings holding the parameters names of the corresponding
 * methods (the ones with the same name) of {@link it.aco.mandragora.bd.BD} (all or a part of them). Depending on which ones of such keys are mapped to
 * not null values in the <code>context</code>, the method behavior will be the same o the correpsondent signature .</br>
 *
 */
public interface ContextBD {
    /**
     * This method looks for an object of a class specified in the <code>context</code> input parameter, by a primary key
     * specified in the <code>context</code> too.<br/>
     * The class of the object to look up is specified by the value mapped to the key <code>"realClass"</code> in the <code>context</code>.<br/>
     * If the realClass is null a {@link ApplicationException} is thrown.
     * The primary key is specified by three attributes of the context: <code>"pkValue", "pkValues", "pkFieldNames"</code>, even if they are
     * not used all together: if the value mapped to the key <code>"pkValue"</code> is not null, it will be considered the primary key value, and the behavior will be the same of
     * the method {@link it.aco.mandragora.bd.BD#findByPrimaryKey(Class realClass, Object pkValue)}.<br/>
     * If the value relative to <code>"pkValue"</code> is null, it will looked in the context for a value mapped to <code>"pkValues"</code>.
     * If it is null too, a a {@link ApplicationException} is thrown.<br/>
     * If it is not null, it will be looked for the value mapped to "pkFieldNames" too. If it is null the behavior will be the same of the method
     * {@link it.aco.mandragora.bd.BD#findByPrimaryKey(Class realClass, Object[] pkValues)}, while if it is not null the behavior will be the same of the method {@link it.aco.mandragora.bd.BD#findByPrimaryKey(Class realClass, String[] pkFieldNames, Object[] pkValues)}
     *
     * @param context It must hold the key <code>"realClass"</code> with not null value. If not, a {@link ApplicationException} is thrown.<br/>
     * It must hold at least one of attributes <code>"pkValue", "pkValues"</code>. If not a {@link ApplicationException} is thrown.<br/>
     * If both are hold , only the <code>"pkValue"</code> will be considered.<br/>
     * Optionally it could hold the attribute <code>"pkFieldNames"</code>.<br/>
     * Optionally this input parameter can have some entry to be used to manage connections, transaction isolation and do on. How these parameters
     * are used depends on the implementation.<br>
     *
     * @return the instance of class specified in the <code>context</code> whose primary key is specified in the <code>context</code> too.
     * @throws ApplicationException -
     *      If the value mapped to the key <code>"realClass"</code> in the <code>context</code> is null.<br/>
     *      If both values mapped to the keys <code>"pkValue"</code> and <code>"pkValues"</code> in the <code>context</code> are null.<br/>
     *
     */
    public Object findByPrimaryKey(Context context)throws ApplicationException;




    /**
     * This method looks in the in put parameter <code>context</code> for the object templateVO.</br>
     * The object templateVO is the one mapped in the <code>context</code> to key <code>"templateVO"</code>.</br>
     * If templateVO is not found (context.get("templateVO")==null) a ApplicationException is thrown.</br>
     * Once got the object templateVO from the <code>context</code> the behavior of this
     * method is the same of {@link it.aco.mandragora.bd.BD#findCollectionByTemplate(Object templateVO)}.</br>
     *
     * @param context It must hold the key <code>"templateVO"</code> with not null value. If not, a {@link ApplicationException} is thrown.<br/>
     * Optionally this input parameter can have some entry to be used to manage connections, transaction isolation and do on. How these parameters
     * are used depends on the implementation.<br>
     * @return the first object according to the object value of the entry  with the key <code>"templateVO"</code> in the <code>context</code>
     * @throws ApplicationException -
     *      If the value mapped to the key <code>"templateVO"</code> in the <code>context</code> is null.<br/>
     */
    public Object findObjectByTemplate(Context context) throws ApplicationException;

    /**
     * This method looks in the in put parameter <code>context</code> for the object templateVO, the String orderingField and the Boolean asc.</br>
     * The object templateVO is the one mapped in the <code>context</code> to key <code>"templateVO"</code>, the string orderingField is the one
     * mapped in the <code>context</code> to the key <code>"orderingField"</code> while the Boolean asc is the one mapped in the <code>context</code> to the key
     * <code>"asc"</code></br>.
     * If templateVO is not found (context.get("templateVO")==null) a ApplicationException is thrown.</br>
     * If orderingField is not found (context.get("orderingField")==null), or  it is an empty string or a string of blank characters, the behavior of this
     * method is the same of {@link it.aco.mandragora.bd.BD#findCollectionByTemplate(Object templateVO)}, otherwise the behavior will be the same of
     * {@link it.aco.mandragora.bd.BD#findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc)}.</br>
     *
     * @param context It must hold the key <code>"templateVO"</code> with not null value. If not, a {@link ApplicationException} is thrown.<br/>
     * Optionally it could hold the key <code>"orderingField"</code> and  <code>"asc"</code>.</br>
     * Optionally this input parameter can have some entry to be used to manage connections, transaction isolation and do on. How these parameters
     * are used depends on the implementation.<br>
     * @return a collection of objects according to <code>templateVO</code> not null field values where <code>templateVO</code> is hold by the <code>context</code>
     * @throws ApplicationException  -
     *      If the value mapped to the key <code>"templateVO"</code> in the <code>context</code> is null.<br/>
     */
    public Collection findCollectionByTemplate(Context context)  throws ApplicationException;


    /**
     * @deprecated use {@link #findCollectionByTemplate(Context context)}
     */
    public Collection findOrderedCollectionByTemplate(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#findCollectionByNullFields(Class realClass, String[] nullFields)}
     * where  <code>realClass</code>  and <code>nullFields</code> are the values mapped to the keys
     * <code>"realClass"</code> and <code>"nullFields"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"realClass"</code> and <code>"nullFields"</code>
     * @return The collection of all instances of <code>realClass</code> realClass whose fields in the array <code>nullFields</code> are null
     * @throws ApplicationException - If the values mapped to the keys <code>"valueobjectOrCollection"</code> or <code>"path"</code> are null. </br>
     */
    public Collection findCollectionByNullFields(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#findCollectionByLogicCondition(Class realClass, it.aco.mandragora.query.LogicCondition logicCondition,String orderingField, Boolean asc, Integer startAtIndex, Integer endAtIndex)}
     * where  <code>realClass</code>, <code>logicCondition</code>, <code>orderingField</code>, <code>asc</code>, <code>startAtIndex</code> and <code>endAtIndex</code>, are the values mapped to the keys
     * <code>"realClass"</code>, <code>"logicCondition"</code>, <code>"orderingField"</code>, <code>"asc"</code>, <code>"startAtIndex"</code> and <code>"endAtIndex"</code>  in <code>context</code>.<br/>
     * Not that if the values mapped to the keys <code>"orderingField"</code>, <code>"startAtIndex"</code> and <code>"endAtIndex"</code> are all null
     * the behavior is the same of {@link it.aco.mandragora.bd.BD#findCollectionByLogicCondition(Class realClass, it.aco.mandragora.query.LogicCondition logicCondition)}
     * <br/>
     * @param context must hold the keys <code>"realClass"</code>, <code>"logicCondition"</code>, <code>"orderingField"</code>, <code>"asc"</code>, <code>"startAtIndex"</code> and <code>"endAtIndex"</code>
     * @return  The collection of all instances of class realClass that satisfy the condition in the <code>context</code>
     * @throws ApplicationException - if the values mapped to the keys <code>realClass</code> or  <code>logicCondition</code> are null
     */
    public Collection findCollectionByLogicCondition(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection)}
     * where  <code>realClass</code>, <code>pAttributeName</code>,  and <code>valuesCollection</code>, are the values mapped to the keys
     * <code>"realClass"</code>, <code>"pAttributeName"</code> and  <code>"valuesCollection"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"realClass"</code>, <code>"pAttributeName"</code> and <code>"valuesCollection"</code>
     * @return all instances of  <code>realClass</code>, which field <code>pAttributeName</code> have one of the values contained in <code>valuesCollection</code>
     * @throws ApplicationException - if the values mapped to the keys <code>realClass</code> or  <code>pAttributeName</code> are null
     */
    public Collection findCollectionByOrValues(Context context)throws ApplicationException;


    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>realClass</code>, <code>pAttributeNames</code>,  and <code>valuesArray</code>, are the values mapped to the keys
     * <code>"realClass"</code>, <code>"pAttributeNames"</code> and  <code>"valuesArray"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"realClass"</code>, <code>"pAttributeNames"</code> and <code>"valuesArray"</code>
     * @return all instances of realClass where <code>properties[i]!=values[i]</code> for all i.
     * @throws ApplicationException   for any trouble.
     */
    public Collection findCollectionByFieldsNotEqualsToValues(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray) }
     * where  <code>realClass</code>, <code>pAttributeNames</code>,  <code>operators</code> and <code>valuesArray</code>, are the values mapped to the keys
     * <code>"realClass"</code>, <code>"pAttributeNames"</code>, <code>"operators"</code> and <code>"valuesArray"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"realClass"</code>, <code>"pAttributeNames"</code>, <code>"operators"</code> and <code>"valuesArray"</code>
     * @return  a collection of instances of realClass which satisfy <code>pAttributeNames[i] operators[i] valuesArray[i]</code> for each i
     * @throws ApplicationException  for any trouble.
     */
    public Collection findCollectionByAndFieldsOperatorValues(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix ) }
     * where  <code>realClass</code>, <code>pAttributeNames</code>,  <code>operators</code> and <code>valuesMatrix</code>, are the values mapped to the keys
     * <code>"realClass"</code>, <code>"pAttributeNames"</code>, <code>"operators"</code> and <code>"valuesMatrix"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"realClass"</code>, <code>"pAttributeNames"</code>, <code>"operators"</code> and <code>"valuesMatrix"</code>
     * @return  a collection of instances of <code>realClass</code> which satisfy and AND OR conditions.
     * @throws ApplicationException for any trouble.
     */
    public Collection findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context) throws ApplicationException;



    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#findCollectionByFieldInCollection(Class realClass,String pAttributeName,Collection valuesCollection) }
     * where  <code>realClass</code>, <code>pAttributeName</code> and <code>valuesCollection</code>, are the values mapped to the keys
     * <code>"realClass"</code>, <code>"pAttributeName"</code>, and <code>"valuesCollection"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context context must hold the keys <code>"realClass"</code>, <code>"pAttributeName"</code> and <code>"valuesCollection"</code>
     * @return  all instances of <code>realClass</code> which <code>valuesCollection</code> of field pAttributeName is equal to one contained in <code>values</code>.
     * @throws ApplicationException   for any trouble.
     */
    public Collection findCollectionByFieldInCollection(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#searchValueInFields(Class realClass,String[] pAttributeNames, Object value)}
     * where  <code>realClass</code>, <code>pAttributeNames</code> and <code>value</code>, are the values mapped to the keys
     * <code>"realClass"</code>, <code>"pAttributeNames"</code>, and <code>"value"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"realClass"</code>, <code>"pAttributeNames"</code> and <code>"valuesMatrix"</code>
     * @return all instances of <code>realClass</code>  that satisfy <code>instance.pAttributeNames[i] Like %value%</code> for at list one i.
     * @throws ApplicationException  if the values mapped to the keys <code>realClass</code> or  <code>pAttributeNames</code> are null
     */
    public Collection searchValueInFields(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName)}
     * where  <code>pInstance</code>  and <code>pAttributeName</code>, are the values mapped to the keys
     * <code>"realClass"</code> and <code>"pAttributeName"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context context must hold the keys <code>"realClass"</code> and <code>"pAttributeName"</code>
     * @return  the collection of instances of the item class of <code>pInstance.pAttributeName</code> related to <code>pInstance</code> in the media store, but not present in the collection <code>pInstance.pAttributeName</code>.
     * @throws ApplicationException - If the value mapped to the key  <code>"pInstance"</code> is null or the value mapped to the key <code>"pAttributeName"</code> is null or empty or blank characters string.
     */
    public Collection getCollectionOfStoredItemsNotInBean(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#getStoredCollection(Object pInstance, String pAttributeName)}
     * where  <code>pInstance</code>  and <code>pAttributeName</code>, are the values mapped to the keys
     * <code>"realClass"</code> and <code>"pAttributeName"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context context must hold the keys <code>"realClass"</code> and <code>"pAttributeName"</code>
     * @return  he collection of instances of the item class of <code>pInstance.pAttributeName</code> related to <code>pInstance</code> in the media store.
     * @throws ApplicationException - If the value mapped to the key  <code>"pInstance"</code> is null or the value mapped to the key <code>"pAttributeName"</code> is null or empty or blank characters string.
     */
    public Collection getStoredCollection(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#getReportQueryIterator(Class realClass, it.aco.mandragora.query.LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy)}
     * where  <code>realClass</code>, <code>logicCondition</code>, <code>pAttributeNames</code>  and <code>groupBy</code>, are the values mapped to the keys
     * <code>"realClass"</code>, <code>"logicCondition"</code>, <code>"pAttributeNames"</code> and <code>"groupBy"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context  context must hold the keys <code>"realClass"</code>, <code>"logicCondition"</code>, <code>"pAttributeNames"</code> and <code>"groupBy"</code>
     * @return  this method returns an Iterator over a Collection of Object[n] of the attributes
     * @throws ApplicationException- if in <code>context</code> the values mapped to the key  <code>"realClass"</code> or  <code>"logicCondition"</code> are null, or the value mapped to the key <code>"pAttributeNames"</code> is null or empty.
     */
    public Iterator getReportQueryIterator(Context context) throws ApplicationException;



    /**
     * This method has the same behavior of {@link it.aco.mandragora.bd.BD#retrieveReference(Object pInstance, String pAttributeName)}
     * where  <code>pInstance</code>  and <code>pAttributeName</code> are the values mapped to the keys
     * <code>"pInstance"</code> and <code>"pAttributeName"</code> in <code>context</code>.<br/>
     * @param context must hold the input parameters
     * @throws ApplicationException - If the values mapped to the keys <code>"pInstance"</code> or <code>"pAttributeName"</code> are null. </br>
     */
    public void retrieveReference(Context context)throws ApplicationException;


    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName)}
     * where  <code>valueObjectsCollection</code>  and <code>pAttributeName</code> are the values mapped to the keys
     * <code>"valueObjectsCollection"</code> and <code>"pAttributeName"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys  <code>"valueObjectsCollection"</code> and <code>"pAttributeName"</code>
     * @throws ApplicationException - If the values mapped to the keys <code>"valueObjectsCollection"</code> or <code>"pAttributeName"</code> are null. </br>
     */
    public void retrieveReferenceInCollection(Context context) throws ApplicationException;


    /**
     * This method has the same behavior of {@link it.aco.mandragora.bd.BD#retrieveAllReferences(Object pInstance)}
     * where  <code>pInstance</code>  is the value mapped to the key
     * <code>"pInstance"</code> in <code>context</code>.<br/>
     * @param context must hold the key <code>"pInstance"</code>
     * @throws ApplicationException -
     *      If the value mapped to the key <code>"pInstance"</code> is null
     */
    public void retrieveAllReferences(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#retrieveAllReferencesInCollection(Collection valueObjectsCollection)}
     * where  <code>valueObjectsCollection</code>  is the value mapped to the key
     * <code>"valueObjectsCollection"</code> in <code>context</code>.<br/>
     * @param context ust hold the key <code>"valueObjectsCollection"</code>
     * @throws ApplicationException -
     *      If the value mapped to the key <code>"valueObjectsCollection"</code> is null
     */
    public void retrieveAllReferencesInCollection(Context context) throws ApplicationException;


    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#retrieveNullReference(Object pInstance, String pAttributeName)}
     * where  <code>pInstance</code>  and <code>pAttributeName</code> are the values mapped to the keys
     * <code>"pInstance"</code> and <code>"pAttributeName"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"pInstance"</code> and <code>"pAttributeName"</code>
     * @throws ApplicationException  - If the values mapped to the keys <code>"pInstance"</code> or <code>"pAttributeName"</code> are null. </br>
     */
    public void retrieveNullReference(Context context)throws ApplicationException;


    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#retrieveAllNullReferences(Object pInstance) }
     * where  <code>pInstance</code>  is the values mapped to the key
     * <code>"pInstance"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the key <code>"pInstance"</code>.
     * @throws ApplicationException  - If the values mapped to the keys <code>"pInstance"</code> is null. </br>
     */
    public void retrieveAllNullReferences(Context context)throws ApplicationException;


    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#retrievePathReference(Object valueobjectOrCollection, String path)}
     * where  <code>valueobjectOrCollection</code>  and <code>path</code> are the values mapped to the keys
     * <code>"valueobjectOrCollection"</code> and <code>"path"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"valueobjectOrCollection"</code> and <code>"path"</code>
     * @throws ApplicationException for any trouble.
     */
    public void retrievePathReference(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link it.aco.mandragora.bd.BD#retrieveNullPathReference(Object valueobjectOrCollection, String path)}
     * where  <code>valueobjectOrCollection</code>  and <code>path</code> are the values mapped to the keys
     * <code>"valueobjectOrCollection"</code> and <code>"path"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"valueobjectOrCollection"</code> and <code>"path"</code>
     * @throws ApplicationException  for any trouble.
     */
    public void retrieveNullPathReference(Context context) throws ApplicationException;


    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#delete(Object deleteVO)}
     * where  <code>deleteVO</code> is the values mapped to the key
     * <code>"deleteVO"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"deleteVO"</code>
     * @throws ApplicationException  for any trouble.
     */
    public void delete(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#deleteCollection(Collection deleteVOs)}
     * where  <code>deleteVOs</code> is the values mapped to the key
     * <code>"deleteVOs"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context  context must hold the keys <code>"deleteVOs"</code>
     * @throws ApplicationException for any trouble.
     */
    public void deleteCollection(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection) }
     * where  <code>left</code>, <code>leftFieldName</code> and <code>rightCollection</code> are  values mapped to the keys
     * <code>"left"</code>, <code>"leftFieldName"</code> and <code>"rightCollection"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context   context must hold the keys <code>"left"</code>, <code>"leftFieldName"</code> and <code>"rightCollection"</code>
     * @throws ApplicationException  if value <code>leftFieldName</code> is null or empty or blank characters string, or any other trouble .
     */
    public void deleteMToNRelationshipCollection(Context context)  throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)}
     * where  <code>rootVO</code>, <code>path</code>, <code>applyDeletePathCascade</code>, <code>ifM2NDeleteOnlyRelationship</code> and <code>deleteOneToOne</code> are  values mapped to the keys
     * <code>"rootVO"</code>, <code>"path"</code>, <code>"applyDeletePathCascade"</code>, <code>"ifM2NDeleteOnlyRelationship"</code> and <code>"deleteOneToOne"</code> in <code>context</code>.<br/>
     * <br/>
     * If <code>applyDeletePathCascade</code> is null it will be considered true.<br/>
     * If <code>ifM2NDeleteOnlyRelationship</code> is null it will be considered true.<br/>
     * If <code>deleteOneToOne</code> is null it will be considered false.<br/>
     * @param context context must hold the keys <code>"rootVO"</code>, <code>"path"</code>, <code>"applyDeletePathCascade"</code>, <code>"ifM2NDeleteOnlyRelationship"</code> and  <code>"deleteOneToOne"</code>
     * @throws ApplicationException for any trouble.
     */
    public void deleteItemsNotInCollectionsInPath(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)}
     * where  <code>rootVO</code>, <code>paths</code>, <code>applyDeletePathCascade</code>, <code>ifM2NDeleteOnlyRelationship</code> and <code>deleteOneToOne</code> are  values mapped to the keys
     * <code>"rootVO"</code>, <code>"paths"</code>, <code>"applyDeletePathCascade"</code>, <code>"ifM2NDeleteOnlyRelationship"</code> and <code>"deleteOneToOne"</code> in <code>context</code>.<br/>
     * <br/>
     * If <code>applyDeletePathCascade</code> is null it will be considered true.<br/>
     * If <code>ifM2NDeleteOnlyRelationship</code> is null it will be considered true.<br/>
     * If <code>deleteOneToOne</code> is null it will be considered false.<br/>
     * @param context context must hold the keys <code>"rootVO"</code>, <code>"paths"</code>, <code>"applyDeletePathCascade"</code>, <code>"ifM2NDeleteOnlyRelationship"</code> and  <code>"deleteOneToOne"</code>
     * @throws ApplicationException for any trouble.
     */
    public void deleteItemsNotInCollectionsInPaths(Context context)  throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) }
     * where  <code>parentVO</code>, <code>path</code>, <code>ifM2NDeleteOnlyRelationship</code> and <code>deleteOneToOne</code> are  values mapped to the keys
     * <code>"parentVO"</code>, <code>"path"</code>, <code>"ifM2NDeleteOnlyRelationship"</code> and <code>"deleteOneToOne"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context context must hold the keys <code>"parentVO"</code>, <code>"path"</code>,  <code>"ifM2NDeleteOnlyRelationship"</code> and  <code>"deleteOneToOne"</code>
     * @throws ApplicationException for any trouble.
     */
    public void deletePathCascade(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)}
     * where  <code>parentVO</code>, <code>paths</code>, <code>ifM2NDeleteOnlyRelationship</code> and <code>deleteOneToOne</code> are  values mapped to the keys
     * <code>"parentVO"</code>, <code>"paths"</code>, <code>"ifM2NDeleteOnlyRelationship"</code> and <code>"deleteOneToOne"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context  context must hold the keys <code>"parentVO"</code>, <code>"paths"</code>,  <code>"ifM2NDeleteOnlyRelationship"</code> and  <code>"deleteOneToOne"</code>
     * @throws ApplicationException for any trouble.
     */
    public void deletePathsCascade(Context context) throws ApplicationException;



    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#insert(Object storeVO)}
     * where  <code>storeVO</code> is the values mapped to the key
     * <code>"storeVO"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"storeVO"</code> which value has to be stored
     * @return   The same inserted object
     * @throws ApplicationException for any trouble.
     */
    public Object insert(Context context) throws ApplicationException;


    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#update(Object storeVO)}
     * where  <code>storeVO</code> is the values mapped to the key
     * <code>"storeVO"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"storeVO"</code> which value has to be updated
     * @return   The same updated object
     * @throws ApplicationException for any trouble.
     */
    public Object update(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#updateCollection(Collection storeVOs)}
     * where  <code>storeVOs</code> is the values mapped to the key
     * <code>"storeVOs"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"storeVOs"</code>
     * @throws ApplicationException  for any trouble.
     */
    public void updateCollection(Context context) throws ApplicationException;



    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#updateCollectionReference(Object storeVO, String pAttributeName)}
     * where  <code>storeVO</code> and <code>pAttributeName</code>  are the values mapped to the key
     * <code>"storeVO"</code> and <code>"pAttributeName"</code> in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"storeVO"</code> and  <code>"pAttributeName"</code>
     * @return  the same storeVO
     * @throws ApplicationException for any trouble.
     */
    public Object updateCollectionReference(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#updateCollectionReferences(Object storeVO) }
     * where  <code>storeVO</code> is the value mapped to the key
     * <code>"storeVO"</code>  in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the key <code>"storeVO"</code>
     * @return  storeVO
     * @throws ApplicationException for any trouble.
     */
    public Object updateCollectionReferences(Context context) throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#storePathCascade(Object storeVO, String path) }
     * where  <code>storeVO</code> and  <code>path</code> are the values mapped to the keys
     * <code>"storeVO"</code>  and  <code>"path"</code>  in <code>context</code>.<br/>
     * <br/>
     * @param context  must hold the keys <code>"storeVO"</code> and  <code>"path"</code>
     * @throws ApplicationException for any trouble.
     */
    public void storePathCascade(Context context)throws ApplicationException;

    /**
     * This method must have the same behavior of {@link  it.aco.mandragora.bd.BD#storePathsCascade(Object storeVO,Collection paths, Boolean pathsHasToBeSorted, Boolean  storeVOHasToBeStored) }
     * where  <code>storeVO</code>, <code>paths</code>, <code>pathsHasToBeSorted</code>, <code>storeVOHasToBeStored</code>are the values mapped to the keys
     * <code>"storeVO"</code>, <code>"paths"</code>, <code>"pathsHasToBeSorted"</code>, <code>"storeVOHasToBeStored"</code>  in <code>context</code>.<br/>
     * <br/>
     * @param context   must hold the keys <code>"storeVO"</code>,  <code>"paths"</code> , <code>"pathsHasToBeSorted"</code>, <code>"storeVOHasToBeStored"</code>
     * @throws ApplicationException  for any trouble.
     */
    public void storePathsCascade(Context context)throws ApplicationException;

    /**
     * This method must have the same behavior of one of the two methods </br>
     * {@link  it.aco.mandragora.bd.BD#updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)}</br>
     * where  <code>storeVO</code>, <code>trees</code>,   <code>storeVOHasToBeUpdated</code>, <code>applyDeletePathCascade</code>, <code>ifM2NDeleteOnlyRelationship</code> and <code>deleteOneToOne</code> are the values mapped to the keys
     * <code>"storeVO"</code>, <code>"trees"</code>,  <code>"storeVOHasToBeUpdated"</code>, <code>"applyDeletePathCascade"</code>, <code>"ifM2NDeleteOnlyRelationship"</code> and  <code>"deleteOneToOne"</code>  in <code>context</code>.<br/>
     * <br/>
     * @param context must hold the keys <code>"storeVO"</code>, <code>"trees"</code>, <code>"storeVOHasToBeUpdated"</code>, <code>"applyDeletePathCascade"</code>, <code>"ifM2NDeleteOnlyRelationship"</code> and  <code>"deleteOneToOne"</code>
     * @return the same storeVO
     * @throws ApplicationException  for any trouble.
     */
    public Object updateCreateTrees(Context context) throws ApplicationException;



/***********************************************************************/



    /**
     * This method has the same behavior of one of the methods whose name is <code>buildMap</code> in the interface {@link it.aco.mandragora.bd.BD}
     * depending on which input parameters are not null in the <code>context</code> context
     * @param context  must hold the input parameters
     * @return  a new created Map
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Context context) throws ApplicationException;

    /**
     * @deprecated use {@link #buildMap(Context context) }
     */
    public HashMap buildHashMap(Context context) throws ApplicationException;







    /**
     * This method has the same behavior of one of the other methods  whose name is <code>addToMap</code> in the interface {@link it.aco.mandragora.bd.BD}
     * depending on which input parameters are not null in the <code>context</code> context
     * @param context  must hold the input parameters
     * @return  the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException
     */
    public Map addToMap(Context context) throws ApplicationException;

    /**
     * @deprecated use {@link #addToMap(Context context)}
     */
    public HashMap addToHashMap(Context context) throws ApplicationException;


    public void updateCollectionWithMap(Context context)throws ApplicationException;

    /**
     *  @deprecated use {@link it.aco.mandragora.common.utils.BeanCollectionUtils#getTreeLeaves(Object valueobjectOrCollection, String path)}
     * @param context
     * @return
     * @throws ApplicationException
     */
    public Collection getTreeLeaves(Context context) throws ApplicationException;

    public Collection retrieveTreeLeaves(Context context) throws ApplicationException;

    /**
     * @deprecated use {@link #retrieveTreeLeaves(Context context)}
     */
    public Collection getCollectionOfRelatedMToNElements(Context context) throws ApplicationException;

    public Collection retrieveNullPathTreeLeaves(Context context) throws ApplicationException ;








    public void addToRetainInCollectionTreeLeaves(Context context) throws ApplicationException;


    public void addToRetainInCollectionTreeNodes(Context context) throws ApplicationException;

    /**
     * @deprecated use {@link #addToRetainInCollectionTreeNodes(Context context)}
     */
    public void align(Context context) throws ApplicationException;


    public void createValueObjectsTreeWithCollection(Context context) throws ApplicationException;


    public void addToValueObjectsTreeWithCollection(Context context) throws ApplicationException;


    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Context context)}
     */
    public void createMissingRelationshipElement(Context context)throws ApplicationException;

    public void addToRelationshipCollectionMissingElements(Context context) throws ApplicationException;

    public void createRelationshipCollection(Context context) throws ApplicationException;

    public void createRelationshipCollectionByOrValues(Context context)throws ApplicationException;


    /**
     *
     * @deprecated use {@link #createRelationshipCollectionByOrValues(Context context)}
     */
    public void setRelationshipElementWithQueryByOrValues(Context context)throws ApplicationException;


    public void createRelationshipCollectionBySearchValueInFields(Context context)throws ApplicationException;

    /**
     *
     * @deprecated use {@link #createRelationshipCollectionBySearchValueInFields( Context context)}
     */
    public void setRelationshipElementWithQueryBySearchValueInFields(Context context)throws ApplicationException;


    public boolean addToCollection(Context context) throws ApplicationException;


    /**
     * @deprecated use {@link #addToCollection(Context context)}
     */
    public boolean addElementToCollectionReference(Context context) throws ApplicationException;



    /**
     * @deprecated use {@link #addAllToCollection(Context context)}
     */
    public Object addCollectionToCollectionReference(Context context) throws ApplicationException;




    /**
     * @deprecated use {@link #addAllToCollection(Context context)}
     */
    public Collection addCollectionFromCollection(Context context) throws ApplicationException;





    /**
     * @deprecated use {@link #addAllToCollection(Context context)}
     */
    public Collection mergeTwoCollections(Context context) throws ApplicationException;



    /**
     * This method has the same behavior of one of the methods which name is <code>addAllToCollection</code> in the interface {@link it.aco.mandragora.bd.BD}; which one is called depends on the input parameters
     * found in <code>context</code>.</br>
     * If in the <code>context</code> there are two keys <code>"pInstance"</code> and <code>"pAttributeName"</code>) both mapped to not null values the method called will be : </br>
     * {@link it.aco.mandragora.bd.BD#addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)} </br>
     * and the third parameter <code>valueObjectsCollectionToAdd</code> will be looked  in the context as well.</br>
     * If such condition is not verified, and in the <code>context</code> the key <code>"pAttributeNameMapKey"</code>  is mapped to a not null value, the method called will be :</br>
     * {@link it.aco.mandragora.bd.BD#addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey)} </br>
     * The other parameters will be looked  in the context as well.</br>
     * If such condition is not verified too, and if the key <code>"realClass"</code>  is mapped to a not null value,  the method called will be :</br>
     * {@link it.aco.mandragora.bd.BD#addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass)} </br>
     * The other parameters will be looked  in the context as well.</br>
     * If such condition is not verified too, and if the key <code>"pAttributeNames"</code>  is mapped to a not null value and key <code>"valuesArray"</code>  is mapped to a  null value ,  the method called will be :</br>
     * {@link it.aco.mandragora.bd.BD#addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames)} </br>
     * The other parameters will be looked  in the context as well.</br>
     * If such condition is not verified too, at the end , it will be called the method:</br>
     * {@link it.aco.mandragora.bd.BD#addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames)} </br>
     * The other parameters will be looked  in the context as well.</br>
     *
     * @param context  must hold the input parameters
     * @return  true  if some element is added, false otherwise
     * @throws ApplicationException - if <code>valueObjectsCollection</code> is null
     */
    public boolean addAllToCollection(Context context) throws ApplicationException;





    /**
     * This method has the same behavior of one of the methods which name is <code>retainAllInCollection</code> in the interface {@link it.aco.mandragora.bd.BD}; which one is called depends on the input parameters
     * found in <code>context</code>.</br>
     * If in the <code>context</code> there are two keys <code>"pInstance"</code> and <code>"pAttributeName"</code> both mapped to not null values the method called will be : </br>
     * {@link it.aco.mandragora.bd.BD#retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection)} </br>
     * and the third parameter <code>toRetainValueObjectsCollection</code> will be looked  in the context as well.</br>
     * If such condition is not verified, and in the <code>context</code> the key <code>"pAttributeNameMapKey"</code>  is mapped to a not null value, the method called will be :</br>
     * {@link it.aco.mandragora.bd.BD#retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey)} </br>
     * The other parameters will be looked  in the context as well.</br>
     * If such condition is not verified too, and if the key <code>"realClass"</code>  is mapped to a not null value,  the method called will be :</br>
     * {@link it.aco.mandragora.bd.BD#retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass)} </br>
     * The other parameters will be looked  in the context as well.</br>
     * If such condition is not verified too, at the end , it will be called the method:</br>
     * {@link it.aco.mandragora.bd.BD#retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames)} </br>
     * The other parameters will be looked  in the context as well.</br>
     *
     * @param context  must hold the input parameters
     * @return true if some element is removed, and false otherwise.</br>
     * @throws ApplicationException
     */
    public boolean retainAllInCollection(Context context) throws ApplicationException;

    /**
     * @deprecated use {@link #retainAllInCollection(Context context)}
     */
    public void removeFromCollectionElementsNotInMap(Context context) throws ApplicationException;


    /**
     * This method has the same behavior of applying in sequence the two methods :</br>
     * {@link #retainAllInCollection(Context context)}
     * </br>
     * {@link #addAllToCollection(Context context)}
     * </br>
     *
     * @param context must hold the input parameters
     * @return  true if some element is removed or added, and false otherwise
     * @throws ApplicationException
     */
    public boolean addToRetainInCollection(Context context)throws ApplicationException;


    /**
     * @deprecated use {@link #addToRetainInCollection(Context context)}
     *
     */
    public void refreshCollectionWithOtherCollectionUsingMapAsRelation(Context context) throws ApplicationException;


    /**
     * This method has the same behavior of one of the methods which name is <code>removeFromCollection</code> in the interface {@link it.aco.mandragora.bd.BD}; which one is called depends on the input parameters
     * found in <code>context</code>.</br>
     * If in the <code>context</code> there are two keys <code>"pInstance"</code> and <code>"pAttributeName"</code> both mapped to not null values the method called will be : </br>
     * {@link it.aco.mandragora.bd.BD#removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) } </br>
     * and the third parameter <code>toRemovePInstance</code> will be looked  in the context as well.</br>
     * Otherwise it will be called the method :</br>
     * {@link it.aco.mandragora.bd.BD#removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance) } </br>
     * which parameters will be looked in <code>context</code>.
     * @param context kust hold the input parameters.
     * @return true if an element is removed, false if not
     * @throws ApplicationException
     */
    public boolean removeFromCollection(Context context) throws ApplicationException;


    
    /**
     * @deprecated use {@link #removeFromCollection(Context context)}
     */
    public boolean removeElementFromCollectionReference(Context context) throws ApplicationException;


    /**
     * This method has the same behavior of {@link it.aco.mandragora.bd.BD#removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) }</br>
     * where the parameters <code>pInstance</code>, <code>pAttributeName</code> and <code>valueObjectsCollectionToRemove</code> are the value mapped with the keys
     * <code>"pInstance"</code>, <code>"pAttributeName"</code> and <code>"valueObjectsCollectionToRemove"</code>  in <code>context</code>.</br>
     * @param context must hold the keys <code>"pInstance"</code>, <code>"pAttributeName"</code> and <code>"valueObjectsCollectionToRemove"</code>
     * @return true if  some element is removed from <code>valueObjectsCollection</code>, false otherwise.
     * @throws ApplicationException
     */
    public boolean removeAllFromCollection(Context context) throws ApplicationException;





    /**
     * This method has the same behavior of one of the methods which name is <code>createVOfromVO</code> in the interface {@link it.aco.mandragora.bd.BD} ; which one is called depends on the input parameters
     * found in <code>context</code>.</br>
     * If in the <code>context</code> there are two keys <code>"sourceRealClass"</code> and <code>"pkFieldNames"</code> both mapped to not null values the method called will be: </br>
     * {@link it.aco.mandragora.bd.BD#createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)} </br>
     * If just the keys <code>"sourceRealClass"</code> is mapped to a not null value the method called will be: </br>
     * {@link it.aco.mandragora.bd.BD#createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)} </br>
     *
     * @param context  must hold the input parameters
     * @return  a new instance of <code>targetRealClass</code>
     * @throws ApplicationException
     */
    public Object createVOfromVO(Context context) throws ApplicationException;


    /**
     * @deprecated use {@link #addTreeToTree(Context context)}
     * */
    public Object addTreesToTrees(Context context) throws ApplicationException;


    /**
     * This method has the same behavior of one the methods:
     * {@link it.aco.mandragora.bd.BD#addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection)}</br>
     * {@link it.aco.mandragora.bd.BD#addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)} </br>
     * {@link it.aco.mandragora.bd.BD#addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray )}</br>
     * depending on which parameters are found in the <code>context</code>.</br>
     * If in the <code>context</code> both keys  <code>"sourceTreePaths"</code> and <code>"targetTreePaths"</code> are mapped to not null values, the method
     * {@link it.aco.mandragora.bd.BD#addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray )}</br>
     * will be called, and the remaining parameters are looked in the context as well.</br>
     * If in the <code>context</code> both keys  <code>"sourceTreePath"</code> and <code>"targetTreePath"</code> are mapped to not null values,
     * and if one of the keys <code>"nodeSourcePAttributeNamesCollection"</code> and <code>"nodeTargetPAttributeNamesCollection"</code> are mapped to not null values, or
     * both the keys <code>"nodePAttributeNamesCollection"</code> and <code>"nodeValuesArrayCollection"</code> are mapped to not null values, the method
     * {@link it.aco.mandragora.bd.BD#addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection)}</br>
     * will be called, and the remaining parameters are looked in the context as well.</br>
     *
     * If in the <code>context</code> both keys  <code>"sourceTreePath"</code> and <code>"targetTreePath"</code> are mapped to not null values,
     * and if one of the keys <code>"nodeSourcePAttributeNames"</code> and <code>"nodeTargetPAttributeNames"</code> are mapped to not null values, or
     * both the keys <code>"nodePAttributeNames"</code> and <code>"nodeValuesArray"</code> are mapped to not null values, the method
     * {@link it.aco.mandragora.bd.BD#addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)}</br>
     * will be called, and the remaining parameters are looked in the context as well.</br>
     *
     * If If in the <code>context</code> both keys  <code>"sourceTreePath"</code> and <code>"targetTreePath"</code> are mapped to not null values, and the keys
     * <code>"nodeSourcePAttributeNamesCollection"</code>, <code>"nodeTargetPAttributeNamesCollection"</code>, <code>"nodePAttributeNamesCollection"</code>, <code>"nodeValuesArrayCollection"</code>,
     * <code>"nodeSourcePAttributeNames"</code>, <code>"nodeTargetPAttributeNames"</code>, <code>"nodePAttributeNames"</code> and <code>"nodeValuesArray"</code> are all mapped to not null values
     * which one of the two methods </br>
     * {@link it.aco.mandragora.bd.BD#addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection)}</br>
     * {@link it.aco.mandragora.bd.BD#addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)} </br>
     * will be called is not important, as in such  conditions their behavior is exactly the same.</br>
     *
     * @param context  must hold the input parameters.
     * @return  true id some elements is added to the tree of root <code>targetRootVO</code>, false otherwise.</br>
     * @throws ApplicationException -
     *      If <code>"sourceTreePaths"</code> and <code>"targetTreePaths"</code> are not both mapped to not null values, and <code>"sourceTreePath"</code> and <code>"targetTreePath"</code> are not both mapped to not null values.</br>
     *      If all the keys <code>"nodeSourcePAttributeNamesCollection"</code>, <code>"nodeTargetPAttributeNamesCollection"</code>, <code>"nodeSourcePAttributeNames"</code> and <code>"nodeTargetPAttributeNames"</code> are mapped to not null values
     *          and in one of the two couples of keys <code>"nodePAttributeNamesCollection"</code>, <code>"nodeValuesArrayCollection"</code> and  <code>"nodeSourcePAttributeNames"</code>, <code>"nodeTargetPAttributeNames"</code> only one is
     *          mapped to a not null value.</br>
     */
    public boolean addTreeToTree(Context context) throws ApplicationException;


}
