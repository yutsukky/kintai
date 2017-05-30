package com.kintai.input;

import com.kintai.Behind;
import com.kintai.Head;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ArgumentHead {
    public void correct(Head head, Behind behind){
        //String[]の先頭が適切かどうか判断する
        Command c = Command.get(head);
        c.function.accept(behind);
    }

    enum Command{
        input((behind) -> new KintaiInput().run(behind)),
        total((args) -> System.out.println("totalだよ"));

        final Consumer<Behind> function;

        Command(Consumer<Behind> function) {
            this.function = function;
        }

        public static Command get(Head command){
            return Stream
                    .of(Command.values())
                    .filter(v -> v.name().equals(command.getHead()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("入力値が不正です．"));

        }
    }


}
