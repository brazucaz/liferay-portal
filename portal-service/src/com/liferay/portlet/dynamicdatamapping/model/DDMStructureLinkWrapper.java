/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.dynamicdatamapping.model;

/**
 * <p>
 * This class is a wrapper for {@link DDMStructureLink}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       DDMStructureLink
 * @generated
 */
public class DDMStructureLinkWrapper implements DDMStructureLink {
	public DDMStructureLinkWrapper(DDMStructureLink ddmStructureLink) {
		_ddmStructureLink = ddmStructureLink;
	}

	public Class<?> getModelClass() {
		return DDMStructureLink.class;
	}

	public String getModelClassName() {
		return DDMStructureLink.class.getName();
	}

	/**
	* Returns the primary key of this d d m structure link.
	*
	* @return the primary key of this d d m structure link
	*/
	public long getPrimaryKey() {
		return _ddmStructureLink.getPrimaryKey();
	}

	/**
	* Sets the primary key of this d d m structure link.
	*
	* @param primaryKey the primary key of this d d m structure link
	*/
	public void setPrimaryKey(long primaryKey) {
		_ddmStructureLink.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the structure link ID of this d d m structure link.
	*
	* @return the structure link ID of this d d m structure link
	*/
	public long getStructureLinkId() {
		return _ddmStructureLink.getStructureLinkId();
	}

	/**
	* Sets the structure link ID of this d d m structure link.
	*
	* @param structureLinkId the structure link ID of this d d m structure link
	*/
	public void setStructureLinkId(long structureLinkId) {
		_ddmStructureLink.setStructureLinkId(structureLinkId);
	}

	/**
	* Returns the fully qualified class name of this d d m structure link.
	*
	* @return the fully qualified class name of this d d m structure link
	*/
	public java.lang.String getClassName() {
		return _ddmStructureLink.getClassName();
	}

	/**
	* Returns the class name ID of this d d m structure link.
	*
	* @return the class name ID of this d d m structure link
	*/
	public long getClassNameId() {
		return _ddmStructureLink.getClassNameId();
	}

	/**
	* Sets the class name ID of this d d m structure link.
	*
	* @param classNameId the class name ID of this d d m structure link
	*/
	public void setClassNameId(long classNameId) {
		_ddmStructureLink.setClassNameId(classNameId);
	}

	/**
	* Returns the class p k of this d d m structure link.
	*
	* @return the class p k of this d d m structure link
	*/
	public long getClassPK() {
		return _ddmStructureLink.getClassPK();
	}

	/**
	* Sets the class p k of this d d m structure link.
	*
	* @param classPK the class p k of this d d m structure link
	*/
	public void setClassPK(long classPK) {
		_ddmStructureLink.setClassPK(classPK);
	}

	/**
	* Returns the structure ID of this d d m structure link.
	*
	* @return the structure ID of this d d m structure link
	*/
	public long getStructureId() {
		return _ddmStructureLink.getStructureId();
	}

	/**
	* Sets the structure ID of this d d m structure link.
	*
	* @param structureId the structure ID of this d d m structure link
	*/
	public void setStructureId(long structureId) {
		_ddmStructureLink.setStructureId(structureId);
	}

	public boolean isNew() {
		return _ddmStructureLink.isNew();
	}

	public void setNew(boolean n) {
		_ddmStructureLink.setNew(n);
	}

	public boolean isCachedModel() {
		return _ddmStructureLink.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_ddmStructureLink.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _ddmStructureLink.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_ddmStructureLink.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _ddmStructureLink.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_ddmStructureLink.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _ddmStructureLink.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_ddmStructureLink.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new DDMStructureLinkWrapper((DDMStructureLink)_ddmStructureLink.clone());
	}

	public int compareTo(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink ddmStructureLink) {
		return _ddmStructureLink.compareTo(ddmStructureLink);
	}

	public int hashCode() {
		return _ddmStructureLink.hashCode();
	}

	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink toEscapedModel() {
		return new DDMStructureLinkWrapper(_ddmStructureLink.toEscapedModel());
	}

	public java.lang.String toString() {
		return _ddmStructureLink.toString();
	}

	public java.lang.String toXmlString() {
		return _ddmStructureLink.toXmlString();
	}

	public com.liferay.portlet.dynamicdatamapping.model.DDMStructure getStructure()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddmStructureLink.getStructure();
	}

	public DDMStructureLink getWrappedDDMStructureLink() {
		return _ddmStructureLink;
	}

	public void resetOriginalValues() {
		_ddmStructureLink.resetOriginalValues();
	}

	private DDMStructureLink _ddmStructureLink;
}