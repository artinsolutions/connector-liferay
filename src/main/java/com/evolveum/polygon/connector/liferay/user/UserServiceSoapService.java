/**
 * UserServiceSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.user;

public interface UserServiceSoapService extends javax.xml.rpc.Service {
    public java.lang.String getPortal_UserServiceAddress();

    public com.evolveum.polygon.connector.liferay.user.UserServiceSoap getPortal_UserService() throws javax.xml.rpc.ServiceException;

    public com.evolveum.polygon.connector.liferay.user.UserServiceSoap getPortal_UserService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
