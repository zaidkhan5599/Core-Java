package com.dev.dao.Scheduler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import com.dev.beans.Resources;
import com.dev.beans.*;
import com.dev.repo.*;
public class ResourcesImpl implements ResourseDao {
   public   static ResourcesRepo res;
   public static Resources resource;
  public  ResourcesImpl()
   { 
	 res = new ResourcesRepo();  
   }
	@Override
	public boolean addResources(Resources res) {
		
		if(res==null)
		{
			return false;
		}
		else{
			this.res.map.put(res.getProduct_id(), res);
			return true;
		}
	}

	@Override
	public boolean updateResources(Integer resource_id,long resouces_quantity) {
		if(this.res.map.containsKey(resource_id))
		{
			Resources res=this.res.map.get(resource_id);
			res.setResource_quantity(resouces_quantity);
			this.res.map.put(resource_id, res);
			
		
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public Resources deleteResources(Integer resource_id) {
	    if(res.map.containsKey(resource_id))
	    {
	    	return null;
	    }
	    else
	    {
	    	resource=res.map.get(resource_id);
	    	res.map.remove(resource_id);
	    	return resource;
	    }
	
	}

	@Override
	public List<Resources> displayAll() {
		List<Resources>ls = new ArrayList<Resources>();
		Iterator<Resources> it =res.map.values().iterator();
		while(it.hasNext())
		{
			ls.add(it.next());
		}
		return ls;
		
	}

	
	
}
