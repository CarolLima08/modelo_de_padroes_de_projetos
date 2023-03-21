package factories;

import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;


//Criação da classe WindowsFactory e implementação da interface GUIFactory. 
public class WindowsFactory implements GUIFactory {
//Garantia de que está sobrescrevendo um método.		
		@Override
//Criar e retornar uma instância da WindowsButton, Criação de um botão especificamente para o sistema operacional Windows. 
		public Button createButton() {
			return new WindowsButton();
		}
//Garantia de que está sobrescrevendo um método.		
		@Override
//Criar e retornar uma instância da WindowsCheckbox, Criação de um Checkbox especificamente para o sistema operacional Windows. 
		public Checkbox createCheckbox() {
			return new WindowsCheckbox();
	}
}
