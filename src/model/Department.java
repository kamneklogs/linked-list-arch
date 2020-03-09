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


		//modelo estandar de ordenamiento natural para listas 
		//sencillamente enlazadas usando bubble sort mejorado
		//se debe calcular leght de la lista previamente.

	/* 	if (length > 1) {
			boolean cambio;
			do {
				Materia actual = first;
				Materia anterior = null;
				Materia siguiente = first.siguiente;
				cambio = false;
				while (siguiente != null) {
					if (actual.getNombre().compareTo(siguiente.getNombre()) > 0) {
						cambio = true;
						if (anterior != null) {
							Materia sig = siguiente.siguiente;
							anterior.siguiente = siguiente;
							siguiente.siguiente = actual;
							actual.siguiente = sig;
						} else {
							Materia sig = siguiente.siguiente;
							first = siguiente;
							siguiente.siguiente = actual;
							actual.siguiente = sig;
						}
						anterior = siguiente;
						siguiente = actual.siguiente;
					} else {
						anterior = actual;
						actual = siguiente;
						siguiente = siguiente.siguiente;
					}
				}
			} while (cambio);
		} */
	}

}