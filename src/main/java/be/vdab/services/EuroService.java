package be.vdab.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import be.vdab.restclients.KoersenClient;

@Service
public class EuroService {

    private final KoersenClient koersenClient;

    public EuroService(@Qualifier("Yahoo") KoersenClient koersenClient) {
	this.koersenClient = koersenClient;
    }

    // te gebruiken bij setter injection
//    @Autowired
//    public void setKoersenClient(@Qualifier("ECB") KoersenClient koersenClient) {
//	this.koersenClient = koersenClient;
//    }
    
    public BigDecimal naarDollar(BigDecimal euro) {
	return euro.multiply(koersenClient.getDollarKoers())
		.setScale(2, RoundingMode.HALF_UP);
    }

}