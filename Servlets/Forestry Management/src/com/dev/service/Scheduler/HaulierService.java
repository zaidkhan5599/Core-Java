package com.dev.service.Scheduler;

import java.util.List;

import com.dev.beans.*;

public interface HaulierService {
	public boolean addHaulier(Haulier h);
	public Haulier deleteHaulier(Integer haulierId);
	public Haulier assignedHaulier();
	public List<Haulier> displayAll();
	
	

}
