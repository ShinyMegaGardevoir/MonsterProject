package monster.controller;

import monster.model.MashmallowMonster;
import monster.view.MonsterView;

public class MonsterAppController
{
	
	private MonsterView myAppView;
	private MashmallowMonster myMonster;
	private MashmallowMonster otherMonster;
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MashmallowMonster("Bob", 4.0, 4.0, 6, 1, 3, true);
		otherMonster = new MashmallowMonster("Bobthepotatoman", 1.625, 3.2, 1, 2, 1, true);
		
	}
	
	public MashmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	public void start()
	{
		myAppView.displayInformation();
			
	}

}