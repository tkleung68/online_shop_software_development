
public class AddToTrolley implements Command{

	@Override
	public void execute(String[] cmdParts) {

		try {
			if(cmdParts.length < 4) {
				throw new InsufficientParameterException();
			}
			ShopSystem shopSystem = ShopSystem.getInstance();
			int quantity = Integer.parseInt(cmdParts[3]);
			Company company = shopSystem.searchCompanyById(cmdParts[1]);
			Product product = shopSystem.searchProductInCompany(company, Integer.parseInt(cmdParts[2]));
			if(shopSystem.addItemToCustomerTrolley(product, quantity, company)) {
				System.out.println("Item successfully added to your trolley.");
			}
		} catch (Exception e) {
<<<<<<< HEAD
=======
			e.printStackTrace();
>>>>>>> 4b44343085b49e8eb524666701b05d46824dcd04
			System.out.println(e.getMessage());
		}
	}
}
