package loggerII;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentAction {
	
	@Autowired
	@Qualifier(value = "fileLogger")
	private ILogger logger;

	@Autowired
	@Qualifier(value = "serverLogger")
	private ILogger logger2;

	public void pay(BigDecimal payValue) {
		logger.log("pay begin, payValue is " + payValue);
		logger2.log("pay end");
	}
}

