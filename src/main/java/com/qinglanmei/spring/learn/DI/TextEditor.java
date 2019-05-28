package com.qinglanmei.spring.learn.DI;

/**
 * @Author: qinglanmei
 * @Description:
 * @Date: 19:16 2019/5/28
 */
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
