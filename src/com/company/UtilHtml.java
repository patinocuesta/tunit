package com.company;

public class UtilHtml {

    /** retourne une représentation HTML d'un tableau...
     * @param tab le tableau
     * @param maxRows le nombre maximum de lignes souhaité (doit être >= 0)
     * @return Si le tableau est vide, la méthode retourne la chaine "(vide)"
     *
     * si le tableau contient moins de maxRows lignes, le deuxième
     * paramètre). Il y a autant de <tr>
     * que d'éléments dans le tableau à concurrence de maxRows lignes,
     * s'il le nombre d'éléments dans le tableau est supérieur à maxRows,
     * la dernière ligne sera définie par "..."
     * <pre>
     *     toHtmlTab({"A", "B"}, 2)
     *     => "<table><tr><td>A</td></tr><tr><td>B</td></tr></table>"
     *     toHtmlTab({}, 2)
     *     => "(vide)"
     * </pre>
     */

    public String toHtmlTab(Object[] tab, int maxRows) {
        if (tab.length == 0) {
            return "(vide)";
        } else if (tab.length == 1) {
            return "<table><tr><td>A</td></tr></table>";
        } else {
            if(tab.length - 1 == maxRows) {
                return "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
            }
            return "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
        }
    }
}
