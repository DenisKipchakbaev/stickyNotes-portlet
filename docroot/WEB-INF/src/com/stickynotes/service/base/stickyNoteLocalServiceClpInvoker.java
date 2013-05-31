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

package com.stickynotes.service.base;

import com.stickynotes.service.stickyNoteLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class stickyNoteLocalServiceClpInvoker {
	public stickyNoteLocalServiceClpInvoker() {
		_methodName0 = "addstickyNote";

		_methodParameterTypes0 = new String[] { "com.stickynotes.model.stickyNote" };

		_methodName1 = "createstickyNote";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletestickyNote";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletestickyNote";

		_methodParameterTypes3 = new String[] { "com.stickynotes.model.stickyNote" };

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchstickyNote";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getstickyNote";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getstickyNotes";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getstickyNotesCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updatestickyNote";

		_methodParameterTypes14 = new String[] {
				"com.stickynotes.model.stickyNote"
			};

		_methodName15 = "updatestickyNote";

		_methodParameterTypes15 = new String[] {
				"com.stickynotes.model.stickyNote", "boolean"
			};

		_methodName36 = "getBeanIdentifier";

		_methodParameterTypes36 = new String[] {  };

		_methodName37 = "setBeanIdentifier";

		_methodParameterTypes37 = new String[] { "java.lang.String" };

		_methodName42 = "addstickyNote";

		_methodParameterTypes42 = new String[] {
				"com.stickynotes.model.stickyNote", "long"
			};

		_methodName43 = "deletestickyNote";

		_methodParameterTypes43 = new String[] { "long" };

		_methodName44 = "deletestickyNote";

		_methodParameterTypes44 = new String[] {
				"com.stickynotes.model.stickyNote"
			};

		_methodName45 = "getStickyNotesByGroup";

		_methodParameterTypes45 = new String[] { "long" };

		_methodName46 = "getStickyNotesByGroupAndUser";

		_methodParameterTypes46 = new String[] { "long", "long" };

		_methodName47 = "getStickyNotesByPlid";

		_methodParameterTypes47 = new String[] { "long" };

		_methodName48 = "getStickyNotesByPlidAndUser";

		_methodParameterTypes48 = new String[] { "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return stickyNoteLocalServiceUtil.addstickyNote((com.stickynotes.model.stickyNote)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return stickyNoteLocalServiceUtil.createstickyNote(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return stickyNoteLocalServiceUtil.deletestickyNote(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return stickyNoteLocalServiceUtil.deletestickyNote((com.stickynotes.model.stickyNote)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return stickyNoteLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return stickyNoteLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return stickyNoteLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return stickyNoteLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return stickyNoteLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return stickyNoteLocalServiceUtil.fetchstickyNote(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getstickyNote(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getstickyNotes(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getstickyNotesCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return stickyNoteLocalServiceUtil.updatestickyNote((com.stickynotes.model.stickyNote)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return stickyNoteLocalServiceUtil.updatestickyNote((com.stickynotes.model.stickyNote)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			stickyNoteLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return stickyNoteLocalServiceUtil.addstickyNote((com.stickynotes.model.stickyNote)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return stickyNoteLocalServiceUtil.deletestickyNote(((Long)arguments[0]).longValue());
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return stickyNoteLocalServiceUtil.deletestickyNote((com.stickynotes.model.stickyNote)arguments[0]);
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getStickyNotesByGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getStickyNotesByGroupAndUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getStickyNotesByPlid(((Long)arguments[0]).longValue());
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return stickyNoteLocalServiceUtil.getStickyNotesByPlidAndUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
}