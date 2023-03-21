package app;

import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo {//define uma classe pública
	private static Application configureApplication() { // Define um método estático privado chamado "configureApplication" que retorna um objeto da classe "Application"
		Application app;// declara uma variável
		GUIFactory factory;// declara uma variável
		String osName = System.getProperty("os.name").toLowerCase(); // recupera o valor da propriedade de sistema e atribui a uma variável chamada "osName"
		if (osName.contains("mac")) {
			factory = new MacOSFactory();  // cria uma nova instância da classe "MacOSFactory" e a atribui à variável "factory".
		} else {
			factory = new WindowsFactory(); // caso a condição anterior do if não seja alcançada, vai para uma nova instância da classe "WindowsFactory"
		}
		app = new Application(factory);
		return app;
	}
	
	public static void main(String[] args) { // realiza a iniciação do código 
		Application app = configureApplication(); // cria uma nova instância da classe "Application" chamando o método "configureApplication" e atribui essa instância à variável "app".
		app.paint(); // chama o método "paint" da instância da classe "Application" que foi criada anteriormente e atribuída à variável "app".
	}
}
