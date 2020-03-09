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

			current.setNextOffice(of);
		}

	}

	public Office searchOffice(String code) throws Exception {

		Office o = firstOffice;

		if (o.getNextOffice() == null) {
			throw new Exception();
		} else if (o.getCode().equals(code)) {

			return o;

		} else {
			o = o.getNextOffice();
			while (!o.getCode().equals(code)) {
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

	public void sortByCode() {

		if (firstOffice != null) {
			if (firstOffice.getNextOffice() != null) {
				boolean change;
				do {

					Office current = firstOffice;
					Office previousOffice = null;
					Office nextOffice = firstOffice.getNextOffice();
					change = false;
					while (nextOffice != null) {
						if (current.getCode().compareTo(nextOffice.getCode()) > 0) {
							change = true;
							if (previousOffice != null) {
								Office sig = nextOffice.getNextOffice();
								previousOffice.setNextOffice(nextOffice);
								nextOffice.setNextOffice(current);
								current.setNextOffice(sig);
							} else {
								Office sig = nextOffice.getNextOffice();
								firstOffice = nextOffice;
								nextOffice.setNextOffice(current);
								current.setNextOffice(sig);
							}
							previousOffice = nextOffice;
							nextOffice = current.getNextOffice();
						} else {
							previousOffice = current;
							current = nextOffice;
							nextOffice = nextOffice.getNextOffice();
						}
					}
				} while (change);
			}
		}

	}

	public String report() {
		String s = "";

		Office current = firstOffice;
		while (current != null) {
			s += current.getCode() + " ";
			current = current.getNextOffice();
		}

		return s;
	}

}