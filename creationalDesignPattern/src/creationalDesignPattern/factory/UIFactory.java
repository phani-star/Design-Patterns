package creationalDesignPattern.factory;

import creationalDesignPattern.factory.button.Button;
import creationalDesignPattern.factory.dropdown.Dropdown;
import creationalDesignPattern.factory.menu.Menu;

public interface UIFactory {

	public Button createButton();
	public Dropdown createDropdown();
	public Menu createMenu();
	
}
