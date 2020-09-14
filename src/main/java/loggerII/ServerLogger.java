package loggerII;

import org.springframework.stereotype.Component;

@Component(value = "serverLogger")
public class ServerLogger implements ILogger {
	public void log(String info) {
		System.out.println(info);
	}
}
