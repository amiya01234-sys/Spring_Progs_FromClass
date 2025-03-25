package sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		
		return oid+"order id order is assigned to BlueDart for delhivery";
		
	}

}
