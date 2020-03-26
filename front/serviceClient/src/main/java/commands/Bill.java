package commands;

import api.PublicAPI;
import cli.framework.Command;

import java.util.List;

public class Bill extends Command<PublicAPI> {

	private String amount;

	@Override
	public String identifier() { return "bill"; }

	@Override
	public void load(List<String> args) {
		amount = args.get(0);
	}

	@Override
	public void execute() throws Exception {
		shell.system.billingWebService.sendBill(amount);
	}

	@Override
	public String describe() {
		return "Send a bill to the carrier, you should specify the amount of the bill : bill $Amount";
	}
}
