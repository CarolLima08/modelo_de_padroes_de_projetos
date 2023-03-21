package checkbox;

//Criação da classe WindowsCheckbox e implementação da interface Checkbox. 
public class WindowsCheckbox implements  Checkbox{
//Garantia de que está sobrescrevendo um método.		
	@Override
//Imprimir uma mensagem(falando que WindowsCheckbox foi criado).
	public void paint() {
		System.out.print("You have created WindowsCheckbox");
	}
}
