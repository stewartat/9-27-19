
public class DecrementHottubTemperature implements  Command{
	Hottub hottub;
	
	public DecrementHottubTemperature(Hottub hottub) {
		this.hottub = hottub;
	}
	
	public void execute() {
		hottub.DecrementHottubTemperature();
	}

}
