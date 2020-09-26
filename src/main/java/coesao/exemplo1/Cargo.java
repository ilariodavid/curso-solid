package coesao.exemplo1;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()), DBA(new QuinzeOuVintePorCento()), TESTER(new QuinzeOuVintePorCento());

	private RegraDeCalculo regraDeCalculo;

	Cargo(RegraDeCalculo regraDeCalculo) {
		this.regraDeCalculo = regraDeCalculo;
	}

	public RegraDeCalculo getRegraDeCalculo() {
		return regraDeCalculo;
	}

}
