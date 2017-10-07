package org.openmrs.module.cchereports.web.controller;

import org.openmrs.module.cchereports.util.CleanReportingTablesAndRegisterAllReports;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CCHERegisterRemoveAllReportsFormController {
	
	@RequestMapping("/module/cchereports/register_allReports")
	public ModelAndView registerAllReports() throws Exception {
		CleanReportingTablesAndRegisterAllReports.registerReports();
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/remove_allReports")
	public ModelAndView removeAllReports() throws Exception {
		CleanReportingTablesAndRegisterAllReports.cleanTables();
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
}
