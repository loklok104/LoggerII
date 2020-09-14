package loggerII;

import org.springframework.stereotype.Component;

@Component(value = "fileLogger")
public class FileLogger implements ILogger {
	public void log(String info) {
		System.out.println(info);
	}
}

