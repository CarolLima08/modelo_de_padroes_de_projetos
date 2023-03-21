package factories;
import button.Button;
import checkbox.Checkbox;
//Criação da interface,os métodos createButton e createCheckbox devem ser implementados por qualquer classe que implemente a GUIFactory..
public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox(); 
}
