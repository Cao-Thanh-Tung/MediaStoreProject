package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
        float cost1 = o1.getCost();
        float cost2 = o1.getCost();
        if(cost1 > cost2) {
        	return 1;
        }else if(cost1 == cost2) {
            String title1 = o1.getTitle();
            String title2 = o2.getTitle();
            return title1.compareTo(title2);
        }else {
        	return -1;
        }


	}

}
