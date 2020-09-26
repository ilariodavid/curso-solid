package coesao.exemplo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {

	Funcionario funcionarioDBA;
	Funcionario funcionarioTester;
	Funcionario funcionarioDesenvolvedor;

	CalculadoraDeSalario calculadora;

	@BeforeEach
	public void setUp() {
		funcionarioDBA = new Funcionario();
		funcionarioDBA.setCargo(Cargo.DBA);

		funcionarioTester = new Funcionario();
		funcionarioTester.setCargo(Cargo.TESTER);

		funcionarioDesenvolvedor = new Funcionario();
		funcionarioDesenvolvedor.setCargo(Cargo.DESENVOLVEDOR);

		calculadora = new CalculadoraDeSalario();
	}

	@Test
	public void deveCalcularSalarioMenos10PorCentoAte3000ParaDesenvolvedor() {
		funcionarioDesenvolvedor.setSalarioBase(3000);
		double salario = calculadora.calcula(funcionarioDesenvolvedor);

		assertEquals(2700, salario);
	}

	@Test
	public void deveCalcularSalarioMenos20PorCentoAcimaDe3000ParaDesenvolvedor() {
		funcionarioDesenvolvedor.setSalarioBase(4000);
		double salario = calculadora.calcula(funcionarioDesenvolvedor);

		assertEquals(3200, salario);
	}
	
	@Test
	public void deveCalcularSalarioMenos15PorCentoAte2000ParaDBA() {
		funcionarioDBA.setSalarioBase(2000);
		double salario = calculadora.calcula(funcionarioDBA);
		
		assertEquals(1700, salario);		
	}
	
	@Test
	public void deveCalcularSalarioMenos25PorCentoAcimaDe2000ParaDBA() {
		funcionarioDBA.setSalarioBase(10000);
		double salario = calculadora.calcula(funcionarioDBA);
		
		assertEquals(7500, salario);		
	}
	
	@Test
	public void deveCalcularSalarioMenos15PorCentoAte2000ParaTester() {
		funcionarioTester.setSalarioBase(2000);
		double salario = calculadora.calcula(funcionarioTester);
		
		assertEquals(1700, salario);		
	}
	
	@Test
	public void deveCalcularSalarioMenos25PorCentoAcimaDe2000ParaTester() {
		funcionarioTester.setSalarioBase(10000);
		double salario = calculadora.calcula(funcionarioTester);
		
		assertEquals(7500, salario);		
	}

}
