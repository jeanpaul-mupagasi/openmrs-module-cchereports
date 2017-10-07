package org.openmrs.module.cchereports.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CCHESetupReportsFormController {
	
	public Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/module/cchereports/cchereports", method = RequestMethod.GET)
	public void manage() {
	}
	
	@RequestMapping("/module/cchereports/register_OR_Report")
	public ModelAndView registerORReport() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/remove_OR_Report")
	public ModelAndView removeORReport() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/register_Activity_Progress_Monitoring")
	public ModelAndView registerActivityProgressMonitoring() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/remove_Activity_Progress_Monitoring")
	public ModelAndView removeActivityProgressMonitoring() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/register_Ward_Report")
	public ModelAndView registerWardReport() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/remove_Ward_Report")
	public ModelAndView removeWardReport() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/register_OPD_Report")
	public ModelAndView registerOPDReport() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/remove_OPD_Report")
	public ModelAndView removeOPDReport() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/register_ED_Report")
	public ModelAndView registerEDReport() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
	@RequestMapping("/module/cchereports/remove_ED_Report")
	public ModelAndView removeEDReport() throws Exception {
		
		return new ModelAndView(new RedirectView("cchereports.form"));
	}
	
}
