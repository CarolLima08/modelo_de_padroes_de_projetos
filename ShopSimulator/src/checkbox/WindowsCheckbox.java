package checkbox;

//Cria��o da classe WindowsCheckbox e implementa��o da interface Checkbox. 
public class WindowsCheckbox implements  Checkbox{
//Garantia de que est� sobrescrevendo um m�todo.		
	@Override
//Imprimir uma mensagem(falando que WindowsCheckbox foi criado).
	public void paint() {
		System.out.print("You have created WindowsCheckbox");
	}
}
