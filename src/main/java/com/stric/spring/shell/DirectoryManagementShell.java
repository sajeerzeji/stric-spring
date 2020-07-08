package com.stric.spring.shell;

import com.stric.spring.config.global.Globals;
import com.stric.spring.helper.ShellHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * @author sajeer
 * @date 09/07/20
 */
@ShellComponent
public class DirectoryManagementShell {
    @Autowired
    ShellHelper shellHelper;

    @ShellMethod("Change to project directory")
    public void cd(@ShellOption({"-D", "--directory"}) String directory) {
        Globals.PROJECT_DIRECTORY = directory;
        shellHelper.print(String.format("This is directory: %s ", directory));
        return;
    }
}
