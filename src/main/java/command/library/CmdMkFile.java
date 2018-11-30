/*
 * DOSBox, Scrum.org, Professional Scrum Developer Training
 * Authors: Rainer Grau, Daniel Tobler, Zuehlke Technology Group
 * Copyright (c) 2013 All Right Reserved
 */
package command.library;

import interfaces.IDrive;
import interfaces.IOutputter;
import command.framework.Command;
import filesystem.File;
import java.sql.Timestamp;

class CmdMkFile extends Command {

    public CmdMkFile(String cmdName, IDrive drive) {
        super(cmdName, drive);
    }

    @Override
    public void execute(IOutputter outputter) {
        String fileContent = "";
        String fileName = this.getParameterAt(0);
        if (this.getParameterCount() > 1) {
            
        System.out.println(this.getParameterCount());
            fileContent = this.getParameterAt(1);
        } 
        File newFile = new File(fileName, fileContent);
        this.getDrive().getCurrentDirectory().add(newFile);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("File has been created at :"+timestamp);        
    }
}
