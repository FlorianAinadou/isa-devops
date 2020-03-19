package commands;

import api.PublicAPI;
import cli.framework.Command;

public class initDatabase extends Command<PublicAPI> {
    @Override
    public String identifier() {
        return "init";
    }

    @Override
    public void execute() throws Exception {
        shell.system.planningWebService.initDatabase();
    }

    @Override
    public String describe() {
        return null;
    }
}
