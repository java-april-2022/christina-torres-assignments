package CareSoft;

class Physician extends User implements CompliantUser {

	Physician(Integer id) {
		super(id);
	}

	@Override
	public boolean assignPin(int e) {
		boolean status = (e > 1000 && pin < 10000) ? true : false;
		System.out.println(status);
		if (status) this.pin = e;
		return status;
	}

	@Override
	public boolean accessAuthorized(Integer e) {	
		boolean status = (this.id == e) ? true : false;
		return status;
	}

}
