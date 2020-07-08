package com.stric.spring.provider;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.stereotype.Component;

/**
 * @author sajeer
 * @date 09/07/20
 */
@Component
public class PromptProvider implements org.springframework.shell.jline.PromptProvider {
    @Override
    public AttributedString getPrompt() {
        return new AttributedString("stric :> ",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.BLUE));
    }
}
