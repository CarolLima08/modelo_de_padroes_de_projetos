package factories;

import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;
//Criação da classe MacOSFactory e implementação da interface GUIFactory. 
public class MacOSFactory implements GUIFactory {
//Garantia de que está sobrescrevendo um método.		
	@Override
//Criar botões especificamente para o sistema operacional MacOS
	public Button createButton() {
		return new MacOSButton();
	}
	@Override
//Criar um Checkbox especificamente para o sistema operacional MacOS
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}
