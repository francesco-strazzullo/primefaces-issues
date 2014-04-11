package it.apra.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Components;
import org.primefaces.component.outputpanel.OutputPanel;

@ManagedBean(name = "data")
@ViewScoped
public class DataBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private OutputPanel opn;

	public OutputPanel getOpn() {
		return opn;
	}

	public void setOpn(OutputPanel opn) {
		this.opn = opn;
	}

	private final static String[] manufacturers;
	
	static {
		manufacturers = new String[10];
		manufacturers[0] = "Mercedes";
		manufacturers[1] = "BMW";
		manufacturers[2] = "Volvo";
		manufacturers[3] = "Audi";
		manufacturers[4] = "Renault";
		manufacturers[5] = "Opel";
		manufacturers[6] = "Volkswagen";
		manufacturers[7] = "Chrysler";
		manufacturers[8] = "Ferrari";
		manufacturers[9] = "Ford";
	}


	private List<ManufacturerSale> sales;

	public DataBean() {
		populateRandomSales();
	}

	private int getRandomSale() {
		return (int) (Math.random() * 100000);
	}

	private int getRandomProfit() {
		return (int) (Math.random() * 100);
	}

	public List<ManufacturerSale> getSales() {
		return sales;
	}

	private void populateRandomSales() {
		sales = new ArrayList<ManufacturerSale>();

		for (int i = 0; i < 10; i++) {
			sales.add(new ManufacturerSale(manufacturers[i], getRandomSale(),
					getRandomSale(), getRandomProfit(), getRandomProfit()));
		}
	}

	public int getLastYearTotal() {
		int total = 0;

		for (ManufacturerSale sale : getSales()) {
			total += sale.getLastYearSale();
		}

		return total;
	}

	public int getThisYearTotal() {
		int total = 0;

		for (ManufacturerSale sale : getSales()) {
			total += sale.getThisYearSale();
		}

		return total;
	}

	public void test(ActionEvent event) {
		System.out.println("testBean...");
	}
	
	public void addDatatable(ActionEvent event) {
		System.out.println("Add...");
		String uniqueId = FacesContext.getCurrentInstance().getViewRoot().createUniqueId();
		CcDatatable ccDatatable = (CcDatatable) Components.includeCompositeComponent(opn, "", "ccDatatable.xhtml",uniqueId);
		ccDatatable.setSales(sales);
		System.out.println(ccDatatable);
	}
}