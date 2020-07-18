
public class CoffeeTouchscreenAdapter implements ICoffeMachine {

	OldCoffeMachine theMachine;

	public CoffeeTouchscreenAdapter(OldCoffeMachine newMachine) {
		theMachine = newMachine;
	}
	
	public void chooseFirstSelection() {
		theMachine.selectA();
	}
	
	public void chooseSecondSelection() {
		theMachine.selectB();
}

}
