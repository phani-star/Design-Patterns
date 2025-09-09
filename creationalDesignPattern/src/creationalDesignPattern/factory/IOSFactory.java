package creationalDesignPattern.factory;

import creationalDesignPattern.factory.button.Button;
import creationalDesignPattern.factory.button.IOSButton;
import creationalDesignPattern.factory.dropdown.Dropdown;
import creationalDesignPattern.factory.dropdown.IOSDropdown;
import creationalDesignPattern.factory.menu.IOSMenu;
import creationalDesignPattern.factory.menu.Menu;

public class IOSFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new IOSButton();
	}

	@Override
	public Dropdown createDropdown() {
		return new IOSDropdown();
	}

	@Override
	public Menu createMenu() {
		return new IOSMenu();
	}

}
