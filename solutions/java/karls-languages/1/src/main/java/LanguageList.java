import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();
    private final String[] excitingLanguages = {"Java", "Kotlin"};

    /**
     * Returns whether the languages list is empty.
     *
     * @return true if the languages list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return this.languages.isEmpty();
    }

    /**
     * Adds a language to the languages list.
     * @param language the language to add to the languages list.
     */
    public void addLanguage(String language) {
        this.languages.add(language);
    }

    /**
     * Removes a language from the languages list.
     * @param language the language to remove from the languages list.
     */
    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    /**
     * Returns the first language in the languages list if the list is not empty.
     * @return the String representing the first language in the languages list.
     */
    public String firstLanguage() {
        return !this.languages.isEmpty() ? this.languages.getFirst() : "[INFO] No languages available. Please add languages first.";
    }

    /**
     * Returns the number of languages in the languages list.
     * @return an int representing the number of languages in the languages list.
     */
    public int count() {
        return this.languages.size();
    }

    /**
     * Returns a boolean representing whether the current languages list contain the specified language.
     * @param language the language to check for in the languages list.
     * @return a boolean representing whether the current languages list contain the specified language.
     */
    public boolean containsLanguage(String language) {
        return this.languages.contains(language);
    }

    /**
     * Returns a boolean representing whether the current languages list contain any of the exciting languages.
     * @return true if the current languages list contain any of the exciting languages, false otherwise.
     */
    public boolean isExciting() {
        for(String excitingLanguage : this.excitingLanguages) {
           if(this.languages.contains(excitingLanguage)) {
               return true;
           }
        }
        return false;
    }
}
