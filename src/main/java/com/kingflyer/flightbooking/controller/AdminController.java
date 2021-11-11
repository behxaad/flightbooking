package com.kingflyer.flightbooking.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kingflyer.flightbooking.entity.Location;
import com.kingflyer.flightbooking.services.AdminService;


//@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	Location locationMaster=new Location();
	
	@RequestMapping("admin_locationMaster")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		String city_name=request.getParameter("city_name");
		String code=request.getParameter("code");
		String airportName=request.getParameter("airport_name");
		String country=request.getParameter("country");
		if(validate(city_name,code,airportName,country))
		{
			locationMaster.setLocationId(2345);
			locationMaster.setCode(code);locationMaster.setCountry(country);locationMaster.setAirportName(airportName);
			locationMaster.setName(city_name);
			if(adminService.addLocation(locationMaster))
				return null;
		}	
		return new ModelAndView("admin_locationMaster");
	}


/*	@RequestMapping("admin_locationMaster/view")
	public ModelAndView view(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView model=new ModelAndView("flightResult");
		List<LocationMaster> list=new ArrayList();
		list=adminService.getAllLocationDetail();
		if(list.size()>0)
		{
			return new ModelAndView("admin_locationMaster");
		}
		else
		{
			return new ModelAndView("admin_locationMaster");
		}
	}

	
*/	
	private boolean validate(String...values) {
		for(String data:values)
		{
			if(data.trim().length()<3)
				return false;
		}
		return true;
	}
	
}