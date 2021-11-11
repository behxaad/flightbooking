package com.kingflyer.flightbooking.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.management.AttributeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.kingflyer.flightbooking.dao.LocationDao;
import com.kingflyer.flightbooking.entity.Location;



@Configuration
@RestController
@RequestMapping("/api/admin")
public class LocationController {

	@Autowired
	LocationDao repo;
	
	@RequestMapping("/all_loc")
	@ResponseBody
public List<Location> getloc() {
		
		return repo.findAll();
	}
	
	@PostMapping("/add_loc")
	public Location home1(Location  location) {
		repo.save(location);
		return location;
	}
	
	
	@PutMapping("/modify_loc")
	public Location update( Location  location) {
		repo.save(location);
		return location;
	}
	
	@DeleteMapping("/delete_loc/{locid}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "locid") int locid)
         throws AttributeNotFoundException {
		Location  location = 	repo.findById(locid)
       .orElseThrow(() -> new AttributeNotFoundException("Location not found for this id :: " + locid));

    	repo.delete(location);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

