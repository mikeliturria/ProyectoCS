package com.google.code.tvrenamer.model.util;

public class Constants {
	public enum SWTMessageBoxType {
		OK, QUESTION, MESSAGE, WARNING, ERROR;
	}

	public enum FileCopyResult {
		SUCCESS, FAILURE;
	}

	public static final String APPLICATION_NAME = "TVRenamer";

	/** The version number, this should be aligned with build.properties */
	public static final String VERSION_NUMBER = "0.5b2";

	public static final String PREFERENCES_FILE = "settings.xml";

	public static final String FILE_SEPARATOR = System.getProperty("file.separator");

	public static final String DEFAULT_REPLACEMENT_MASK = "%S [%sx%e] %t";

	public static final String DEFAULT_DESTINATION_DIRECTORY = System.getProperty("user.home") + "/TV";

	public static final String DEFAULT_SEASON_PREFIX = "Season ";
}