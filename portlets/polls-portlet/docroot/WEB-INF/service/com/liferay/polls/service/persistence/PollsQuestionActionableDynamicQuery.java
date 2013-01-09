/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.polls.service.persistence;

import com.liferay.polls.model.PollsQuestion;
import com.liferay.polls.service.PollsQuestionLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Juan Fernï¿½ndez
 * @generated
 */
public abstract class PollsQuestionActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public PollsQuestionActionableDynamicQuery() throws SystemException {
		setBaseLocalService(PollsQuestionLocalServiceUtil.getService());
		setClass(PollsQuestion.class);

		setClassLoader(com.liferay.polls.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("pollsQuestionId");
	}
}