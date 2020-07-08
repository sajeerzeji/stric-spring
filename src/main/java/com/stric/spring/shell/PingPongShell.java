package com.stric.spring.shell;

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
public class PingPongShell {
    @Autowired
    ShellHelper shellHelper;

    @ShellMethod("Ping Pong")
    public void ping() {
        shellHelper.print("Pong");
        return;
    }

    @ShellMethod("Name")
    public void hiIAm(@ShellOption({"-N", "--name"}) String ping) {
        shellHelper.print(String.format("Hello %s", ping));
        return;
    }
}
