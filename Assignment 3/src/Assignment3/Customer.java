package Assignment3;

public class Customer {
		private String customerName;
		private Address residentialAddress;
		private Address officialAddress;

		public Customer() {

		}

		public Customer(String customerName, Address residentialAddress, Address officialAddress) {
			this.customerName = customerName;
			this.residentialAddress = residentialAddress;
			this.officialAddress = officialAddress;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public Address getResidentialAddress() {
			return residentialAddress;
		}

		public void setResidentialAddress(Address residentialAddress) {
			this.residentialAddress = residentialAddress;
		}

		public Address getOfficialAddress() {
			return officialAddress;
		}
		public String getCustomerDetails() {
			return "CustomerName:" +customerName + "residentialAddress:"+residentialAddress + "officialAddress:"+officialAddress;
		}

		private String customerName(String string, String string2) {
			// TODO Auto-generated method stub
			return null;
		}


}
