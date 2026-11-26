package oop.concur.chrono_not_working;

public interface Controller {

	void attachView(ChronoView view);
	void notifyStarted();
	void notifyStopped();
	void notifyReset();

}
