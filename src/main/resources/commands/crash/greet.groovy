package commands.crash

import org.crsh.cli.Command
import org.crsh.command.InvocationContext


class Greet {

    @Command
    def main(InvocationContext context) {
        beanFactory = context.attributes['spring.beanfactory']
        greeter = beanFactory.getBean("greeter")

        String out = "Available beans \n";
        String[] beanNames = beanFactory.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        out = String.join("\n- ", beanNames) + "\n\n" + greeter.getText() + " - greetings from shell";

        return out;
    }

}