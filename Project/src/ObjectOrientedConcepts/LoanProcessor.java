package ObjectOrientedConcepts;

public abstract class LoanProcessor {
	abstract boolean calculateEligibility();

	void validateDocuments() {
		System.out.println("Validating documents...");
	}

	void disburseLoan() {
		System.out.println("Disbursing loan...");
	}
}

class HomeLoanProcessor extends LoanProcessor {
	@Override
	boolean calculateEligibility() {
		System.out.println("Calculating eligibility for home loan...");
		return true;
	}
	@Override
	public String toString() {
	    return "HomeLoanProcessor: This object is processing Home Loan applications.";
	}


	public static void main(String[] args) {
		HomeLoanProcessor home = new HomeLoanProcessor();
		home.validateDocuments();
		home.disburseLoan();
		home.calculateEligibility();
		System.out.println(home);
	}
}
