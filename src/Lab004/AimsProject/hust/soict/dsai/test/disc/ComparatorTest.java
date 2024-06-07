package Lab004.AimsProject.hust.soict.dsai.test.disc;


import Lab004.AimsProject.hust.soict.dsai.aims.media.Media;
import Lab004.AimsProject.hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import Lab004.AimsProject.hust.soict.dsai.aims.media.MediaComparatorByTitleCost;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {

        List<Media> media = new ArrayList<Media>();
        Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

        Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
        for (Media m : media) {
            System.out.println(m.toString());
        }

        media.sort(COMPARE_BY_COST_TITLE);
        for (Media m : media) {
            System.out.println(m.toString());
        }


    }
}
