/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.library;

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;

/**
 *
 * @author BPS
 */
public class CmdExit extends Command{

    public CmdExit(String exit, IDrive drive) {
        super(exit, drive);
    }
    
    public boolean cek_jml_param(int jml_param){
        return jml_param == 0;
    }
    
    public boolean cek_param_value(IOutputter outputter) {
        return true;
    }    

    @Override
    public void execute(IOutputter outputter) {
    }
    
}
