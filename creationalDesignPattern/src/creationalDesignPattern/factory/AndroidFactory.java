package creationalDesignPattern.factory;

import creationalDesignPattern.factory.button.AndroidButton;
import creationalDesignPattern.factory.button.Button;
import creationalDesignPattern.factory.dropdown.AndroidDropdown;
import creationalDesignPattern.factory.dropdown.Dropdown;
import creationalDesignPattern.factory.menu.AndroidMenu;
import creationalDesignPattern.factory.menu.Menu;

public class AndroidFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new AndroidButton();
	}

	@Override
	public Dropdown createDropdown() {
		return new AndroidDropdown();
	}

	@Override
	public Menu createMenu() {
		return new AndroidMenu();
	}

}
