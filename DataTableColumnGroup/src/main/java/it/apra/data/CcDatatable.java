package it.apra.data;

import java.util.List;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UINamingContainer;
import javax.faces.event.ActionEvent;

@FacesComponent(value=CcDatatable.COMPONENT_TYPE)
public class CcDatatable extends UIComponentBase implements NamingContainer {

	public static final String COMPONENT_TYPE = "ccDatatable.xhtml";
	
	public String getFamily() {
		return UINamingContainer.COMPONENT_FAMILY;
	}
	
	public  List<ManufacturerSale> getSales(){
		return ( List<ManufacturerSale>) this.getStateHelper().eval(PropertyKeys.sales);
	}

	public void setSales( List<ManufacturerSale> sales) {
		this.getStateHelper().put(PropertyKeys.sales, sales);
	}


	public void test(ActionEvent event) {
		System.out.println("Test...");
	}

	public void textListener() {
		System.out.println("textListener...");
	}

	protected enum PropertyKeys {
		sales;
	}

}

