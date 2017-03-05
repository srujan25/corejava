package springPractise;

/**
 * Created by SG0221519 on 2/22/2017.
 */
public class TextEditor {

    private ISpellChecker spellChecker;

    public void setSpellChecker(ISpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void checkSpelling() {
        spellChecker.checkSpelling();
    }
}
