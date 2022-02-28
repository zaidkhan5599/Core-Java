package com.dev.dao.Scheduler;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;

import com.dev.beans.Client;
import com.dev.beans.Contract;
import com.dev.beans.Haulier;
import com.dev.repo.ClientRepo;
import com.dev.repo.HaulierRepo;
public class HaulierImpl implements HaulierDao {
 HaulierRepo haulier = new HaulierRepo();
Haulier haul ;
ResourcesImpl res = new ResourcesImpl();
ClientRepo repo = new ClientRepo();
Scanner sc = new Scanner(System.in);
	@Override
	public boolean addHaulier(Haulier h) {
		if(h!=null)
		{
			haulier.map.put(h.getHaulier_id(), h);
			return true;
		}
		return false;
	}

	

	@Override
	public Haulier deleteHaulier(Integer haulierId) {
		Iterator it = haulier.map.values().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		if(haulier.map.containsKey(haulierId))
		{
		if(haulier.map.get(haulierId).getStatus().equalsIgnoreCase("Reserved"))
		{
			System.out.println("Haulier you are trying to delete is assigned for job");
			return haulier.map.get(haulierId);
		}
		else {
			haul = haulier.map.get(haulierId);
			haulier.map.remove(haulierId);
			return haul;
			
		}
	
		
		}
		else
		{
			System.out.println("Haulier id is incorrect");
			return null;
		}
		
	}

	@Override
	public List<Haulier> displayAll() {
		Iterator<Haulier> it = haulier.map.values().iterator();
		List<Haulier> ls = new ArrayList<Haulier>();
		while(it.hasNext())
		{
			ls.add(it.next());
		}
		return ls;
	}



	@Override
	public Haulier assignedHaulier() {
	 Iterator<Client> it = repo.map.values().iterator();
	 List<Client>ls = new ArrayList<Client>();
	 while(it.hasNext())
	 {
		 ls.add(it.next());
	 }
	 System.out.println(ls);
	 Iterator<Haulier>it2 = haulier.map.values().iterator();
	 while(it2.hasNext())
	 {
		 System.out.println(it2.next());
	 }
		for(int i=0;i<ls.size();i++)
		{
			Client c= ls.get(i);
			if(c.getCon()!=null)
			{
				if(c.getCon().getHaulier()==null)
				{
					System.out.println("Set haulier according to id shown above in the table");
					Integer haulierId = Integer.parseInt(sc.nextLine());
					haul=haulier.map.get(haulierId);
					c.getCon().setHaulier(haul);
					System.out.println("Enter the delivery days it will take");
                    Integer day = Integer.parseInt(sc.nextLine());
                    String oldate = c.getCon().getPlacedondate();
                    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
                    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
                    Calendar cal = Calendar.getInstance();
                    
                    try {
						cal.setTime(sdf1.parse(oldate));
					} catch (ParseException e) {
						
						e.printStackTrace();
					}
                    System.out.println(cal.getTime());
                    cal.add(Calendar.DAY_OF_MONTH, +day);
                    System.out.println(cal.getTime());
                    String newDate = sdf1.format(cal.getTime());
                    c.getCon().setDelivery_date(newDate);
					repo.map.put(c.getId(), c);
					haul.setStatus("Reserved");
					haulier.map.put(haul.getHaulier_id(), haul);
					
					return haul;
				}
				else
				{
					System.out.println("For particular client haulier is already reserved");
					return c.getCon().getHaulier();
				}
			}
			else
			{
				System.out.println("Haulier cannot be assigned to particular contract as contract is not assigned");
				return null;
			}
		}
		return null;

	}
	

}
