package org.openmrs.module.cchereports.reporting;

/**
 * Report Setup / teardown interface
 */
public interface SetupReport {
	
	public void setup() throws Exception;
	
	public void delete();
}
