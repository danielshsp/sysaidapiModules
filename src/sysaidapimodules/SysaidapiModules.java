/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysaidapimodules;



import sysaidapimodules.ApiServiceRequest;
import sysaidapimodules.SysaidApiService;
import com.ilient.server.*;


public class SysaidapiModules {

  
    public static void main(String[] args) {
       try{
             ApiCI ci= new ApiCI();
             ci.getSupplier();
             ci.getCustListField1()
             CI c=new CI();
             CI cc = CI.load(0, string);
             c.getCiName();
             c.getAddonFieldCaption("")
             ServiceRequest sr = new   ServiceRequest ();
             sr.setAddonFieldValue(string, c);
             sr.save(cnctn, lib)
             
             String userName="sysaid";
             String password="changeit";
             String accountId="selectivedorb";
             SysaidApiService service = new SysaidApiServiceService().getSysaidApiServicePort();
             long session=service.login(accountId, userName, password);
             System.out.println(session);
             ApiServiceRequest srApi=new ApiServiceRequest();
             srApi.setRequestUser("motorola");
             srApi.setCustomDateFields();
             srApi.setTitle("test");
             srApi.setCategory("test");
             Object numsr= service.save(session, srApi);
             System.out.println(numsr);
       }catch(Exception w){
           w.printStackTrace();
       }
    }
    
}
