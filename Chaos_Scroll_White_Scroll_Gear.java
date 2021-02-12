import java.util.Scanner;

import javax.swing.JOptionPane;

public class Chaos_Scroll_White_Scroll_Gear {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int item = 1;
		int num;
		int fsSlots;
		int scgSlots;
		int bfcSlots;
		int gogglesSlots;
		int pickScroll;
		int wa;
		int ws;
		int SCG;
		int BFC;
		int FS;
		int ROA = 1;
		int Goggles;
		int str;
		int dex;
		int INT;
		int luk;
		int speed;

		while (item != 0) {
			item = Integer.parseInt(JOptionPane.showInputDialog(null, "Which item Would you like to Scroll?\nSCG --> 1\nBFC --> 2\nFS ----> 3\nROA --> 4\nGoggles --> 5\nTo Exit --> 0"));
			//System.out.println("\nWhich item Would you like to Scroll?\nSCG --> 1\nBFC --> 2\nFS ---> 3\nROA --> 4\nTo Exit --> 0");
			//item = s.nextInt();

			switch (item) {

			case 1:   //    ***** SCG *****
				SCG = 5;
				scgSlots = 5;
				pickScroll = 0;
				ws = 0;

				do {
					num = 0;
					pickScroll = Integer.parseInt(JOptionPane.showInputDialog(null, "Which scroll do you want to use on the SCG?\nChaos Scroll --> 1\nGlove For Attack 30% --> 2\nGlove For Attack 10% --> 3"));
					//System.out.println(
							//"\nWhich scroll do you want to use on the SCG?\nChaos Scroll --> 1\nGlove For Attack 30% --> 2\nGlove For Attack 10% --> 3");
					//pickScroll = s.nextInt();
					if (pickScroll <= 0) {
						return;
					}
					if (pickScroll == 1) { //   **** Chaos Scroll ******
						ws = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to use White Scroll?\n Yes --> 1\nNo --> 2"));
						//System.out.println("\nDo you want to use White Scroll?\n Yes --> 1\nNo --> 2");
						//ws = s.nextInt();
						num = (int) (Math.random() * (100) + 1);
						if (num > 60) {
							
						//	JOptionPane.showMessageDialog(null, "Failed");
							//System.out.println("Failed");
							if (ws != 1) {
								scgSlots--;
							}
							JOptionPane.showMessageDialog(null, "Failed\nSCG Stats: " + SCG + " ATK, Slots: " + scgSlots);
							//System.out.println("SCG Stats: " + SCG + " ATK, Slots: " + scgSlots);
						} else {
							scgSlots--;
							wa = (int) (Math.random() * (12) - 6);
							SCG += wa;
							if (wa >=0) {
								JOptionPane.showMessageDialog(null,"+"+wa+" ATK\nSCG Stats: " + SCG + " ATK, Slots: " + scgSlots);
								//System.out.println("+"+wa+" ATK");

							}else {
								JOptionPane.showMessageDialog(null, wa+" ATK\nSCG Stats: " + SCG + " ATK, Slots: " + scgSlots );
								//System.out.println(wa+" ATK");
							}
							//System.out.println("SCG Stats: " + SCG + " ATK, Slots: " + scgSlots);

						}

					} else if (pickScroll == 2) { //  GFA **** 30%
						ws = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to use White Scroll?\n Yes --> 1\nNo --> 2"));

						//System.out.println("\nDo you want to use White Scroll?\n Yes --> 1\nNo --> 2");
					//	ws = s.nextInt();
						num = (int) (Math.random() * (100) + 1);
						int BOOM = (int) (Math.random() * (100) + 1);
						if (num > 30 && BOOM > 50) {
							JOptionPane.showMessageDialog(null, "Destroyed !");
							//System.out.println("Destroyed\n");
							return;
						} else if (num > 30 && BOOM < 50) {
							//System.out.println("Failed");
							if (ws != 1) {
								scgSlots--;
							}
							JOptionPane.showMessageDialog(null, "Failed\nSCG Stats: " + SCG + " ATK, Slots: " + scgSlots);
							//System.out.println("SCG Stats: " + SCG + " ATK, Slots: " + scgSlots);

						} else if (num <= 30) {
							scgSlots--;
							SCG += 3;
							JOptionPane.showMessageDialog(null,"+"+3+" ATK\nSCG Stats: " + SCG + " ATK, Slots: " + scgSlots);
							//System.out.println("+"+3+" ATK");

							//System.out.println("SCG Stats: " + SCG + " ATK, Slots: " + scgSlots);

						}

					} else if (pickScroll == 3) { //   GFA **** 10%
						ws = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to use White Scroll?\n Yes --> 1\nNo --> 2"));

						//System.out.println("\nDo you want to use White Scroll?\n Yes --> 1\nNo --> 2");
						//ws = s.nextInt();
						num = (int) (Math.random() * (100) + 1);
						if (num > 10) {
						//	System.out.println("Failed");
							if (ws != 1) {
								scgSlots--;
							}
							JOptionPane.showMessageDialog(null, "Failed\nSCG Stats: " + SCG + " ATK, Slots: " + scgSlots);

							//System.out.println("SCG Stats: " + SCG + " ATK, Slots: " + scgSlots);

						} else {
							scgSlots--;
							SCG += 3;
							JOptionPane.showMessageDialog(null,"+"+3+" ATK\nSCG Stats: " + SCG + " ATK, Slots: " + scgSlots);

						//	System.out.println("+"+3+" ATK");
						//	System.out.println("SCG Stats: " + SCG + " ATK, Slots: " + scgSlots);

						}
					}

				} while (scgSlots > 0);
				break;
			case 2:  //    ***** BFC *****
				BFC = 5;
				bfcSlots = 5;
				pickScroll = 0;
				ws = 0;
				
				do {
					num = 0;
					pickScroll = Integer.parseInt(JOptionPane.showInputDialog(null, "Which scroll do you want to use on the BFC?\nChaos Scroll --> 1"));
					//System.out.println(
						//	"\nWhich scroll do you want to use on the BFC?\nChaos Scroll --> 1\n");
					//pickScroll = s.nextInt();
					if (pickScroll <= 0) {
						return;
					}
					if (pickScroll == 1) { //   ***** Chaos Scroll ******
						ws = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to use White Scroll?\n Yes --> 1\nNo --> 2"));

						//System.out.println("\nDo you want to use White Scroll?\n Yes --> 1\nNo --> 2");
						//ws = s.nextInt();
						num = (int) (Math.random() * (100) + 1);
						if (num > 60) {
						//	System.out.println("Failed");
							if (ws != 1) {
								bfcSlots--;
							}
							JOptionPane.showMessageDialog(null, "Failed\nBFC Stats: " + BFC + " ATK, Slots: " + bfcSlots);

							//System.out.println("BFC Stats: " + BFC + " ATK, Slots: " + bfcSlots);
						} else {
							bfcSlots--;
							wa = (int) (Math.random() * (12) - 6);
							BFC += wa;
							if (wa >=0) {
								JOptionPane.showMessageDialog(null, "+"+wa+" ATK\nBFC Stats: " + BFC + " ATK, Slots: " + bfcSlots);
								//System.out.println("+"+wa+" ATK");

							}else {
								JOptionPane.showMessageDialog(null, wa+" ATK\nBFC Stats: " + BFC + " ATK, Slots: " + bfcSlots);

								//System.out.println(wa+" ATK");
							}
							//System.out.println("BFC Stats: " + BFC + " ATK, Slots: " + bfcSlots);

						}
					}
				}while (bfcSlots > 0);
				break;
				
			case 3:
				FS = 2;
				fsSlots = 5;
				pickScroll = 0;
				ws = 0;
				
				do {
					num = 0;
					pickScroll = Integer.parseInt(JOptionPane.showInputDialog(null, "Which scroll do you want to use on the FS?\nChaos Scroll --> 1"));

					//System.out.println(
							//"\nWhich scroll do you want to use on the FS?\nChaos Scroll --> 1\n");
					//pickScroll = s.nextInt();
					if (pickScroll <= 0) {
						return;
					}
					if (pickScroll == 1) { //   ***** Chaos Scroll ******
						ws = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to use White Scroll?\n Yes --> 1\nNo --> 2"));

					//	System.out.println("\nDo you want to use White Scroll?\n Yes --> 1\nNo --> 2");
					//	ws = s.nextInt();
						num = (int) (Math.random() * (100) + 1);
						if (num > 60) {
							//System.out.println("Failed");
							if (ws != 1) {
								fsSlots--;
							}
							JOptionPane.showMessageDialog(null, "Failed\nFS Stats: " + FS + " ATK, Slots: " + fsSlots);
							//System.out.println("FS Stats: " + FS + " ATK, Slots: " + fsSlots);
						} else {
							fsSlots--;
							wa = (int) (Math.random() * (12) - 6);
							FS += wa;
							if (wa >=0) {
								//System.out.println("+"+wa+" ATK");
								JOptionPane.showMessageDialog(null, "+"+wa+" ATK\nFS Stats: " + FS + " ATK, Slots: " + fsSlots);

							}else {
								//System.out.println(wa+" ATK");
								JOptionPane.showMessageDialog(null, wa+" ATK\nFS Stats: " + FS + " ATK, Slots: " + fsSlots);

							}
							//System.out.println("FS Stats: " + FS + " ATK, Slots: " + fsSlots);

						}
					}
				}while (fsSlots > 0);
				break;
			case 4:
				for (int i = 0; i < ROA; i++) {

					str = 1;
					dex = 1;
					INT = 1;
					luk = 1;
					num =0;
					num = (int) (Math.random() * (100) + 1);
					int diceStr = (int) (Math.random() * (12) - 6);
					int diceDex = (int) (Math.random() * (12) - 6);
					int diceInt = (int) (Math.random() * (12) - 6);
					int diceLuk = (int) (Math.random() * (12) - 6);

					if (diceStr < 0) {
						diceStr = -1;
					}
					if (diceDex < 0) {
						diceDex = -1;
					}
					if (diceInt < 0) {
						diceInt = -1;
					}
					if (diceLuk < 0) {
						diceLuk = -1;
					}

					str += diceStr;
					dex += diceDex;
					INT += diceInt;
					luk += diceLuk;

					if (num > 60) {
						JOptionPane.showMessageDialog(null, "Ring of Alchemist\nFailed !\nSTR: 1\nDEX: 1\nINT: 1\nLUK: 1\n" );
						//System.out.println("Failed :(\nSTR: 1\nDEX: 1\nINT: 1\nLUK: 1\n");
					} else {
						JOptionPane.showMessageDialog(null, "Ring of Alchemist\nSTR: " + str + "\nDEX: " + dex + "\nINT:  " + INT + "\nLUK: " + luk + "\n");
						//System.out.println("STR: " + str + "\nDEX: " + dex + "\nINT: " + INT + "\nLUK: " + luk + "\n");
					}
				}
				break;
			case 5:
				gogglesSlots = 3;
				str = 2;
				dex = 2;
				speed = 2;
				int diceStr;
				int diceDex;
				int diceSpeed;
				pickScroll = 0;
				ws = 0;
				num = 0;
				
				do {
					if (str < 0) {
						str = 0;
					}
					if (dex < 0) {
						dex = 0;
					}
					if (speed < 0) {
						speed = 0;
					}
					JOptionPane.showMessageDialog(null, "Goggles Stats:\nSTR: "+str+"\nDEX: "+dex+"\nSpeed: "+speed+"\nSlots: "+gogglesSlots);
					ws = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to use White Scroll?\nYes --> 1\n No --> 2"));
					num = (int)(Math.random()*100+1);
					
					if (num > 60) {
						if (ws != 1) {
							gogglesSlots--;
						}
						if (str < 0) {
							str = 0;
						}
						if (dex < 0) {
							dex = 0;
						}
						if (speed < 0) {
							speed = 0;
						}
						JOptionPane.showMessageDialog(null, "Falied !\nGoggles Stats:\n STR: "+str+"\nDEX: "+dex+"\nSpeed: "+speed+"\nSlots: "+gogglesSlots);
					} else if (num <= 60) {
						gogglesSlots--;
						if (str > 0) {
						diceStr = (int)(Math.random()*12-6);
						str += diceStr;
						} else {
							str = 0;
						}
						if (dex > 0) {
						diceDex = (int)(Math.random()*12-6);
						dex += diceDex;
						} else {
							dex = 0;
						}
						if (speed > 0) {
						diceSpeed = (int)(Math.random()*12-6);
						speed += diceSpeed;
						} else {
							speed = 0;
						}
						JOptionPane.showMessageDialog(null, "Successful !\nGoggles Stats:\nSTR: "+str+"\nDEX: "+dex+"\nSpeed: "+speed+"\nSlots: "+gogglesSlots);
					}
					
				}while (gogglesSlots > 0);
				

			}
		}

	}

}
