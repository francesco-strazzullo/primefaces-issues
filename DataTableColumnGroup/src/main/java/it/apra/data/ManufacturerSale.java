package it.apra.data;

public class ManufacturerSale {

	private Integer thisYearSale;
	private Integer lastYearSale;
	private Integer thisYearProfit;
	private Integer lastYearProfit;
	private String manufacturer;
	
	public ManufacturerSale(String manufacturer, int thisYearSale, int lastYearSale,int thisYearProfit, int lastYearProfit) {
		this.manufacturer = manufacturer;
		this.lastYearProfit = lastYearProfit;
		this.lastYearSale = lastYearSale;
		this.thisYearProfit = thisYearProfit;
		this.thisYearSale = thisYearSale;
	}

	public Integer getThisYearSale() {
		return thisYearSale;
	}

	public void setThisYearSale(Integer thisYearSale) {
		this.thisYearSale = thisYearSale;
	}

	public Integer getLastYearSale() {
		return lastYearSale;
	}

	public void setLastYearSale(Integer lastYearSale) {
		this.lastYearSale = lastYearSale;
	}

	public Integer getThisYearProfit() {
		return thisYearProfit;
	}

	public void setThisYearProfit(Integer thisYearProfit) {
		this.thisYearProfit = thisYearProfit;
	}

	public Integer getLastYearProfit() {
		return lastYearProfit;
	}

	public void setLastYearProfit(Integer lastYearProfit) {
		this.lastYearProfit = lastYearProfit;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
