package button;
//Criação da classe MacOSFactory e implementação da interface GUIFactory. 

public class WindowsButton implements Button {
//Garantia de que está sobrescrevendo um método.		
	@Override
//// declara um método em Java que define um método público chamado "paint" que não aceita argumentos e não retorna nenhum valor e Uma instrução Java que usa o método para imprimir a string especificada no console
	public void paint() {
		System.out.print("You have created WindowsButton");
	}
}
