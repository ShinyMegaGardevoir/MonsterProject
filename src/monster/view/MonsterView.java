package monster.view;

import javax.swing.JOptionPane;

import monster.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "I made a monster.");
		JOptionPane.showMessageDialog(null, "His name is " + baseController.getMyMonster().getName() +".");
		JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getNumberofLegs() +" legs.");
		JOptionPane.showMessageDialog(null, "He loves using his " + baseController.getMyMonster().getNumberofLegs() +" arms.");
		JOptionPane.showMessageDialog(null, "He can see through all " + baseController.getMyMonster().getEyeCount() +" of his eyes.");
		JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getNoseCount() +" nose(s).");
		JOptionPane.showMessageDialog(null, "He is quite hairy. He has " + baseController.getMyMonster().getHairCount() +" hairs.");
		JOptionPane.showMessageDialog(null, "The fact that he has a Belly Button is " + baseController.getMyMonster().hasBellyButton() +".");
	}

}
