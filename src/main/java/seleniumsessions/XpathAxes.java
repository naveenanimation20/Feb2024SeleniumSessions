package seleniumsessions;

public class XpathAxes {

	public static void main(String[] args) {

		
		//parent to child:
		//direct child : /
		//direct+indirect child: //
		
		//div[@id='content']//form//input
		
		//div[@id='content']/div -- 1
		//div[@id='content']//div -- 7
		
		//select[@id='Form_getForm_Country']/option -- 233
		//select[@id='Form_getForm_Country']//option -- 233
		
		// (//div[@class='form-group'])[1]/input
		// (//div[@class='form-group'])[2]/a
		
		//child to parent:
		//input[@id='input-email']/../../../../../../../../../..
		//input[@id='input-email']/..
		//input[@id='input-email']/parent::div
		//option[@value='Albania']/parent::select
		//input[@id='input-email']/ancestor::form
		
		
		
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
		
		
		//a[text()='Mustafa Hanif']/parent::td/preceding-sibling::td/child::input[@type='checkbox']
		//a[text()='neha sharma']/parent::td/following-sibling::td/a[@context='company']
	}

}
