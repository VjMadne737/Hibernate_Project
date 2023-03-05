package client;

import crudoperation.entities.Admin;
import crudoperation.entities.Collage;
import crudoperation.entities.Placement;
import crudoperation.service.AdminSer;
import crudoperation.service.AdminSerImpl;
import crudoperation.service.CollageSer;
import crudoperation.service.CollageSerImpl;
import crudoperation.service.PlacementSer;
import crudoperation.service.PlacementSerImpl;
import crudoperation.service.StudentSer;
import crudoperation.service.StudentSerImpl;

public class CrudTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSer ss=new StudentSerImpl();
		CollageSer cs=new CollageSerImpl();
		PlacementSer ps=new PlacementSerImpl();
		AdminSer as=new AdminSerImpl();
		/*Admin a1 = new Admin();
		//Update Operation
				a1.setId(255);
				as.updateAdmin(a1);
				System.out.println("Row updated");
				//System.out.println(a1);
			*/	
	/*	//retrive operation
		Placement p1 =new Placement();
		p1= ps.findPlacementById(5050);
		System.out.println("ID "+p1.getPlaceId());
		*/
			
		
		//Delete Operation
		
		Collage clg1=new Collage();
		cs.removeCollage(clg1);
		
		System.out.println("row Deleted");
		

	}

}
