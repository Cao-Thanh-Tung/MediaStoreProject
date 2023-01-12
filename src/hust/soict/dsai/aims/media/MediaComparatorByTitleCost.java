package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();
        int sComp = title1.compareTo(title2);
        if (sComp != 0) {
            return sComp;
        }
        float cost1 = o1.getCost();
        float cost2 = o2.getCost();
        if(cost1 < cost2) {
        	return -1;
        }else if(cost2 == cost2) {
        	return 0;
        }else {
        	return 1;
        }
	}

}
