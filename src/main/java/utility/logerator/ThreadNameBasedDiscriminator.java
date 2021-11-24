package utility.logerator;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.Discriminator;

public class ThreadNameBasedDiscriminator implements Discriminator<ILoggingEvent> {

	private static final String Key = "threadName";
	private boolean started;

	@Override
	public String getDiscriminatingValue(ILoggingEvent iLoggingEvent) {
		return Thread.currentThread().getName();
	}

	@Override
	public String getKey() {
		return Key;
	}

	@Override
	public void start() {
		started = true;
	}

	@Override
	public void stop() {
		started = false;

	}

	@Override
	public boolean isStarted() {
		return started;
	}
}
