package factories;

import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;


//Cria��o da classe WindowsFactory e implementa��o da interface GUIFactory. 
public class WindowsFactory implements GUIFactory {
//Garantia de que est� sobrescrevendo um m�todo.		
		@Override
//Criar e retornar uma inst�ncia da WindowsButton, Cria��o de um bot�o especificamente para o sistema operacional Windows. 
		public Button createButton() {
			return new WindowsButton();
		}
//Garantia de que est� sobrescrevendo um m�todo.		
		@Override
//Criar e retornar uma inst�ncia da WindowsCheckbox, Cria��o de um Checkbox especificamente para o sistema operacional Windows. 
		public Checkbox createCheckbox() {
			return new WindowsCheckbox();
	}
}
