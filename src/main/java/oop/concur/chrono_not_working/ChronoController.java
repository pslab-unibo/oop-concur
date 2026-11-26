package oop.concur.chrono_not_working;

public class ChronoController implements Controller {

	private ChronoCount counter;
	private ChronoView view;
	private volatile boolean stopped;
	
	public ChronoController(ChronoCount counter) {
		this.counter = counter;
	}
	
	public void attachView(ChronoView view) {
		this.view = view;
	}
	
	@Override
	public void notifyStarted() {
		stopped = false;
		while (!stopped) {
			counter.inc();
			view.updateCount(counter.getValue());
			// System.out.println(counter.getValue());
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
			}
		}
	}

	@Override
	public void notifyStopped() {
		stopped = true;
	}

	@Override
	public void notifyReset() {
		counter.reset();
		view.updateCount(counter.getValue());
	}
}
