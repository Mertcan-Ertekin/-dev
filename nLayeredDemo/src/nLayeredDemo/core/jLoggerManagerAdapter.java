package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements ILoggerService{

	@Override
	public void LogToSystem(String message) {
		jLoggerManager manager = new jLoggerManager();
		manager.Log(message);
		
	}

}
