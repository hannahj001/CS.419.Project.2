import java.util.List;

/**
 * This class will implement the First Come First Serve 
 * disk scheduling algorithm.
 *
 * FROM THE TEXT BOOK
 * 98, 183, 37, 122, 14, 124, 65, 67,
 * in that order. If the disk head is initially at cylinder 53, it will first move from
 * 53 to 98, then to 183, 37, 122, 14, 124, 65, and finally to 67, for a total head
 * movement of 640 cylinders. This schedule is diagrammed in Figure 11.6.
 * The wild swing from 122 to 14 and then back to 124 illustrates the problem
 * with this schedule. If the requests for cylinders 37 and 14 could be serviced
 * together, before or after the requests for 122 and 124, the total head movement
 * could be decreased substantially, and performance could be thereby improved.
 *
 *
 * @author ...
 */
public class FCFS implements IDiskAlgorithm {

	@Override
	public int calculateDistance(List<DiskRequest> requests, int headPosition) {
		// TODO Auto-generated method stub
		return 0;
	}

}
