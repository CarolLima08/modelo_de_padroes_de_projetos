package button;
//Cria��o da classe MacOSFactory e implementa��o da interface GUIFactory. 

public class WindowsButton implements Button {
//Garantia de que est� sobrescrevendo um m�todo.		
	@Override
//// declara um m�todo em Java que define um m�todo p�blico chamado "paint" que n�o aceita argumentos e n�o retorna nenhum valor e Uma instru��o Java que usa o m�todo para imprimir a string especificada no console
	public void paint() {
		System.out.print("You have created WindowsButton");
	}
}
