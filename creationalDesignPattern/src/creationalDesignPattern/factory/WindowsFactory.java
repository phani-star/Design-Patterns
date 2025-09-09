package creationalDesignPattern.factory;

import creationalDesignPattern.factory.button.Button;
import creationalDesignPattern.factory.button.WindowsButton;
import creationalDesignPattern.factory.dropdown.Dropdown;
import creationalDesignPattern.factory.dropdown.WindowsDropdown;
import creationalDesignPattern.factory.menu.Menu;
import creationalDesignPattern.factory.menu.WindowsMenu;

public class WindowsFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Dropdown createDropdown() {
		return new WindowsDropdown();
	}

	@Override
	public Menu createMenu() {
		return new WindowsMenu();
	}

}
