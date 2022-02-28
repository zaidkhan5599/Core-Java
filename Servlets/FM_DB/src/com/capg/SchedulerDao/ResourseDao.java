package com.capg.SchedulerDao;

import java.util.List;

import com.capg.beans.*;

public interface ResourseDao {
	public boolean addResources(Resources res);
	public boolean stockManagement(Integer resource_id,long required_quantity);
	public boolean updateResources(Integer resource_id,long resources_quantity);
	public Resources deleteResources(Integer resource_id);
	public boolean find(Integer resource_id);
	public Resources search(Integer resource_id);
	public List<Resources> displayAll();
	
	
	

}
