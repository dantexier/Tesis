package t2t;

//http://www.hdfgroup.org/projects/hdf5_aip/hdf5_aip_wp.html
//http://hul.harvard.edu/mets/doc/
	
import java.io.FileInputStream;

import edu.harvard.hul.ois.mets.*;
import edu.harvard.hul.ois.mets.helper.*;



/*
import org.eclipse.emf.common.util.TreeIterator; 
import org.eclipse.emf.common.util.URI; 
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl; 
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl; 
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

 
*/

public class test {

public static void main(String[] args){
	
	try {
		FileInputStream in = new FileInputStream ("mets.xml");
		Mets mets = Mets.reader (new MetsReader (in));
		in.close ();
		System.out.println(mets.getOBJID());
		
/*		System.out.println();
		
		FileInputStream in1 = new FileInputStream ("mets.xml");		
		XmlData xml = new XmlData(new MetsReader (new FileInputStream ("mets.xml")));
		
		xml = XmlData.reader()
		= DmdSec.reader(new MetsReader (in1));
		in1.close ();
		System.out.println(dmd.getID());
*/		
		mets.validate (new MetsValidator ());
		System.out.println(mets);
		
	}
	catch (Exception e) {
		e.printStackTrace ();
	}
/*
// create resource set and resource 
try{ 
	
	ResourceSet resourceSet = new ResourceSetImpl(); 
	// Register XML resource factory 
	
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("SimpleRDBMS", new XMIResourceFactoryImpl()); 
	
	URI uri = org.eclipse.emf.common.util.URI.createURI("schema_db.xmi"); 
	Resource resource = resourceSet.createResource(uri); 
	TreeIterator ti = resource.getAllContents(); 
	while (ti.hasNext()){ 
		System.out.println(ti.getClass().getSimpleName()); 
		} 
	}// end of try 
	catch (NullPointerException e){ 
		e.getStackTrace(); 
		}	 
*/	
} 
} 