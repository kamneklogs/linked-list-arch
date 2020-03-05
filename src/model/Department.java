package model;

public class Department {

	private Office firstOffice;

	public Department() {

	}

	public void addOffice(String code, int floor) {

		Office of = new Office(code, floor);

		if (firstOffice == null) {
			firstOffice = of;
		} else {
			Office current = firstOffice;
			while (current.getNextOffice() != null) {
				current = current.getNextOffice();
			}
		}

	}

	public Office searchOffice(String code) throws Exception {

		Office o = firstOffice;

		if (o.getNextOffice() == null) {
			throw new Exception();
		} else if (o.getCode().equals(code)) {

			return o;

		}else {
			o = o.getNextOffice();
			while(!o.getCode().equals(code)) {
				o = o.getNextOffice();
			}
		}
		

		return o;

	}

	public Office removeOffice(String code) {
		Office current = firstOffice;
		Office pre = null;

		while (current != null && !current.getCode().equals(code)) {
			pre = current;
			current = current.getNextOffice();

		}
		if (current != null) {
			if (current == firstOffice) {
				firstOffice = firstOffice.getNextOffice();

			} else {
				pre.setNextOffice(current.getNextOffice());
			}
		}

		return current;

	}

}