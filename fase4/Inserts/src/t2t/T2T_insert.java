package t2t;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class T2T_insert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {	    	 
	    	File fXmlFile = new File("schema_db.xmi");
	    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    	Document doc = dBuilder.parse(fXmlFile);	     
	    	doc.getDocumentElement().normalize();	     
	    	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());	
	    	NodeList nList = doc.getElementsByTagName("SimpleRDBMS:Table");	     
	    	System.out.println(nList.getLength());
	    	for (int temp = 0; temp < nList.getLength(); temp++) {	     
	    		Node nNode = nList.item(temp);
	    		System.out.println("\nCurrent Element :" + nNode.getNodeName());
	    		if (nNode.getNodeType() == Node.ELEMENT_NODE) {	     
	    			Element eElement = (Element) nNode;	     
	    			for (int j = 0; j<eElement.getElementsByTagName("cols").getLength(); j++)
	    				{	    			
	    				System.out.println("\t"+
	    						eElement.getElementsByTagName("cols").item(j).getAttributes().getNamedItem("name").getNodeValue()
	    						);
	    				}
	    			System.out.println("\tFKEY:"+eElement.getElementsByTagName("fkeys").getLength());
	    			for (int j = 0; j<eElement.getElementsByTagName("fkeys").getLength(); j++)
	    				{	    			
	    				System.out.println("\t \t"+
	    						eElement.getElementsByTagName("fkeys").item(j).getAttributes().getNamedItem("references").getNodeValue()+
	    						" with "+
	    						eElement.getElementsByTagName("fkeys").item(j).getAttributes().getNamedItem("cols").getNodeValue()
	    						);
	    				}	    			
	    			}
	    		}	
	        } 
	    catch (Exception e) {
	    	e.printStackTrace();
	        }
	    }
	}