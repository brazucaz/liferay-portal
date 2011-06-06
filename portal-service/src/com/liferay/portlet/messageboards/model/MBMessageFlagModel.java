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

package com.liferay.portlet.messageboards.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MBMessageFlag service. Represents a row in the &quot;MBMessageFlag&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.messageboards.model.impl.MBMessageFlagModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.messageboards.model.impl.MBMessageFlagImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MBMessageFlag
 * @see com.liferay.portlet.messageboards.model.impl.MBMessageFlagImpl
 * @see com.liferay.portlet.messageboards.model.impl.MBMessageFlagModelImpl
 * @generated
 */
public interface MBMessageFlagModel extends BaseModel<MBMessageFlag> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a message boards message flag model instance should use the {@link MBMessageFlag} interface instead.
	 */

	/**
	 * Returns the primary key of this message boards message flag.
	 *
	 * @return the primary key of this message boards message flag
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this message boards message flag.
	 *
	 * @param primaryKey the primary key of this message boards message flag
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the message flag ID of this message boards message flag.
	 *
	 * @return the message flag ID of this message boards message flag
	 */
	public long getMessageFlagId();

	/**
	 * Sets the message flag ID of this message boards message flag.
	 *
	 * @param messageFlagId the message flag ID of this message boards message flag
	 */
	public void setMessageFlagId(long messageFlagId);

	/**
	 * Returns the user ID of this message boards message flag.
	 *
	 * @return the user ID of this message boards message flag
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this message boards message flag.
	 *
	 * @param userId the user ID of this message boards message flag
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this message boards message flag.
	 *
	 * @return the user uuid of this message boards message flag
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this message boards message flag.
	 *
	 * @param userUuid the user uuid of this message boards message flag
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the modified date of this message boards message flag.
	 *
	 * @return the modified date of this message boards message flag
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this message boards message flag.
	 *
	 * @param modifiedDate the modified date of this message boards message flag
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the thread ID of this message boards message flag.
	 *
	 * @return the thread ID of this message boards message flag
	 */
	public long getThreadId();

	/**
	 * Sets the thread ID of this message boards message flag.
	 *
	 * @param threadId the thread ID of this message boards message flag
	 */
	public void setThreadId(long threadId);

	/**
	 * Returns the message ID of this message boards message flag.
	 *
	 * @return the message ID of this message boards message flag
	 */
	public long getMessageId();

	/**
	 * Sets the message ID of this message boards message flag.
	 *
	 * @param messageId the message ID of this message boards message flag
	 */
	public void setMessageId(long messageId);

	/**
	 * Returns the flag of this message boards message flag.
	 *
	 * @return the flag of this message boards message flag
	 */
	public int getFlag();

	/**
	 * Sets the flag of this message boards message flag.
	 *
	 * @param flag the flag of this message boards message flag
	 */
	public void setFlag(int flag);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(MBMessageFlag mbMessageFlag);

	public int hashCode();

	public MBMessageFlag toEscapedModel();

	public String toString();

	public String toXmlString();
}