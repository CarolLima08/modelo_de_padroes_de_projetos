package checkbox;

//Cria��o da classe MacOSCheckbox e implementa��o da interface Checkbox. 
public class MacOSCheckbox implements Checkbox {
//Garantia de que est� sobrescrevendo um m�todo.		
	@Override
//Imprimir uma mensagem(falando que MacOSCheckbox foi criado).
	public void paint() {
		System.out.print("You have created MacOSCheckbox");
	}
}
