
public class IncrementHottubTemperature implements  Command{
	Hottub hottub;
	
	public IncrementHottubTemperature(Hottub hottub) {
		this.hottub = hottub;
	}
	
	public void execute() {
		hottub.IncrementHottubTemperature();
	}

}
