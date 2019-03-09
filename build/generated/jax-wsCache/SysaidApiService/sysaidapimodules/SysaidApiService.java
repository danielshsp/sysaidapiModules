
package sysaidapimodules;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SysaidApiService", targetNamespace = "http://api.ilient.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SysaidApiService {


    /**
     * 
     * @param apiSysObj
     * @param sessionId
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.DeleteResponse")
    public void delete(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "apiSysObj", targetNamespace = "")
        ApiSysaidObject apiSysObj);

    /**
     * 
     * @param apiSysObj
     * @param sessionId
     * @return
     *     returns java.lang.Object
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "save", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.SaveResponse")
    public Object save(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "apiSysObj", targetNamespace = "")
        ApiSysaidObject apiSysObj);

    /**
     * 
     * @param accountId
     * @param password
     * @param userName
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.LoginResponse")
    public long login(
        @WebParam(name = "accountId", targetNamespace = "")
        String accountId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param sessionId
     */
    @WebMethod
    @RequestWrapper(localName = "logout", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.LogoutResponse")
    public void logout(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId);

    /**
     * 
     * @param sessionId
     * @param srId
     * @return
     *     returns java.util.List<sysaidapimodules.ApiServiceRequestAttachment>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getServiceRequestAttachmentsWithoutContent", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.GetServiceRequestAttachmentsWithoutContent")
    @ResponseWrapper(localName = "getServiceRequestAttachmentsWithoutContentResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.GetServiceRequestAttachmentsWithoutContentResponse")
    public List<ApiServiceRequestAttachment> getServiceRequestAttachmentsWithoutContent(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "srId", targetNamespace = "")
        int srId);

    /**
     * 
     * @param apiSysObj
     * @param sessionId
     * @param id
     * @return
     *     returns sysaidapimodules.ApiSysaidObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loadById", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.LoadById")
    @ResponseWrapper(localName = "loadByIdResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.LoadByIdResponse")
    public ApiSysaidObject loadById(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "apiSysObj", targetNamespace = "")
        ApiSysaidObject apiSysObj,
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param apiSysObj
     * @param sessionId
     * @param id
     * @return
     *     returns sysaidapimodules.ApiSysaidObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loadByStringId", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.LoadByStringId")
    @ResponseWrapper(localName = "loadByStringIdResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.LoadByStringIdResponse")
    public ApiSysaidObject loadByStringId(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "apiSysObj", targetNamespace = "")
        ApiSysaidObject apiSysObj,
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param apiSysObj
     * @param sessionId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getApiSysAidObjectActions", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.GetApiSysAidObjectActions")
    @ResponseWrapper(localName = "getApiSysAidObjectActionsResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.GetApiSysAidObjectActionsResponse")
    public String getApiSysAidObjectActions(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "apiSysObj", targetNamespace = "")
        ApiSysaidObject apiSysObj);

    /**
     * 
     * @param fileIds
     * @param sessionId
     * @param srId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteServiceRequestAttachments", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.DeleteServiceRequestAttachments")
    @ResponseWrapper(localName = "deleteServiceRequestAttachmentsResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.DeleteServiceRequestAttachmentsResponse")
    public void deleteServiceRequestAttachments(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "srId", targetNamespace = "")
        int srId,
        @WebParam(name = "fileIds", targetNamespace = "")
        List<String> fileIds);

    /**
     * 
     * @param sessionId
     * @param srId
     * @param fileId
     * @return
     *     returns sysaidapimodules.ApiServiceRequestAttachment
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getServiceRequestAttachment", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.GetServiceRequestAttachment")
    @ResponseWrapper(localName = "getServiceRequestAttachmentResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.GetServiceRequestAttachmentResponse")
    public ApiServiceRequestAttachment getServiceRequestAttachment(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "srId", targetNamespace = "")
        int srId,
        @WebParam(name = "fileId", targetNamespace = "")
        String fileId);

    /**
     * 
     * @param apiSysObj
     * @param actionParams
     * @param sessionId
     * @param actionName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeApiSysAidObjectAction", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.ExecuteApiSysAidObjectAction")
    @ResponseWrapper(localName = "executeApiSysAidObjectActionResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.ExecuteApiSysAidObjectActionResponse")
    public String executeApiSysAidObjectAction(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "apiSysObj", targetNamespace = "")
        ApiSysaidObject apiSysObj,
        @WebParam(name = "actionName", targetNamespace = "")
        String actionName,
        @WebParam(name = "actionParams", targetNamespace = "")
        List<Object> actionParams);

    /**
     * 
     * @param attachments
     * @param sessionId
     * @param srId
     */
    @WebMethod
    @RequestWrapper(localName = "addServiceRequestAttachments", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.AddServiceRequestAttachments")
    @ResponseWrapper(localName = "addServiceRequestAttachmentsResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.AddServiceRequestAttachmentsResponse")
    public void addServiceRequestAttachments(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "srId", targetNamespace = "")
        int srId,
        @WebParam(name = "attachments", targetNamespace = "")
        List<ApiServiceRequestAttachment> attachments);

    /**
     * 
     * @param sessionId
     * @param listName
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListCaptionForKey", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.GetListCaptionForKey")
    @ResponseWrapper(localName = "getListCaptionForKeyResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.GetListCaptionForKeyResponse")
    public String getListCaptionForKey(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "listName", targetNamespace = "")
        String listName,
        @WebParam(name = "key", targetNamespace = "")
        int key);

    /**
     * 
     * @param condition
     * @param apiSysObj
     * @param sessionId
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeSelectQuery", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.ExecuteSelectQuery")
    @ResponseWrapper(localName = "executeSelectQueryResponse", targetNamespace = "http://api.ilient.com/", className = "sysaidapimodules.ExecuteSelectQueryResponse")
    public List<String> executeSelectQuery(
        @WebParam(name = "sessionId", targetNamespace = "")
        long sessionId,
        @WebParam(name = "apiSysObj", targetNamespace = "")
        ApiSysaidObject apiSysObj,
        @WebParam(name = "condition", targetNamespace = "")
        String condition);

}
