package Hotel;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frontofficestaff fos1 = new frontofficestaff("sahil", 21, 5);
		frontofficestaff fos2 = new frontofficestaff("pandu", 22, 3);
		frontofficestaff fos3 = new frontofficestaff("pablo", 23, 1);
		
		multitaskingstaff mts1 = new multitaskingstaff("sherlock", 22, 1);
		multitaskingstaff mts2 = new multitaskingstaff("watson", 22, 10);
		multitaskingstaff mts3 = new multitaskingstaff("mycroft", 24, 6);
		
		customers ctm1 = new customers("mikhail", 25);
		customers ctm2 = new customers("fischer", 26);
		customers ctm3 = new customers("vishy", 27);
		
		
		Integer leaves;
		
		
		
		
		staff[] st = {fos1, fos2, fos3, mts1, mts2, mts3};
		
		user[] us = {ctm1, ctm2, ctm3, fos1, fos2, fos3, mts1, mts2, mts3};
		
		leaves = staff.totleaves(st);
		
		System.out.print("total number of leaves taken by the staff = "+leaves);

		customers.listage(us);
	}

}
