package com.company;

import com.company.memento.Editor;
import com.company.memento.History;

public class MementoMain {

    public static void run() {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.restore(history.pop());
        editor.restore(history.pop());
        editor.restore(history.pop());


        System.out.println(editor.getContent());

    }
}
