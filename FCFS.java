import java.util.List;

/**
 * This class will implement the First Come First Serve.
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

	private Integer totalHeadMovement = 0;

	@Override
	public int calculateDistance(List<DiskRequest> requests, int headPosition) {
		Integer size = requests.size();
		// TODO Auto-generated method stub

		//while array insn't empty
		//move by 1 until you get to first request.
		//remove request from list
		//add distance traveled to total head movement
		//move by 1 until next number and repeat till no requests left.
		//return total head movement at the end.

		// check when something gets here that we dont move until we need to

		while(!requests.isEmpty()){
			totalHeadMovement +=1;
			if (headPosition > requests.getFirst().getTrack()){
				headPosition -= 1;

			}else if (headPosition < requests.getFirst().getTrack()){
				headPosition +=1;
			}
			else if(headPosition == requests.getFirst().getTrack()){
				requests.removeFirst();
			}
		}
		return totalHeadMovement - size;
	}

}
