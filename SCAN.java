import java.util.ArrayList;
import java.util.List;

/**
 * This class will implement the SCAN 
 * disk scheduling algorithm.
 *
 * FROM TEXTBOOK
 *
 * In the SCAN algorithm, the disk arm starts at one end of the disk and moves
 * toward the other end, servicing requests as it reaches each cylinder, until it gets
 * to the other end of the disk. At the other end, the direction of head movement
 * is reversed, and servicing continues. The head continuously scans back and
 * forth across the disk. The SCAN algorithm is sometimes called the elevator
 * algorithm, since the disk arm behaves just like an elevator in a building, first
 * servicing all the requests going up and then reversing to service requests the
 * other way.
 * Let’s return to our example to illustrate. Before applying SCAN to schedule
 * the requests on cylinders 98, 183, 37, 122, 14, 124, 65, and 67, we need to know
 * the direction of head movement in addition to the head’s current position.
 * Assuming that the disk arm is moving toward 0 and that the initial head
 * position is again 53, the head will next service 37 and then 14. At cylinder 0,
 * the arm will reverse and will move toward the other end of the disk, servicing
 * the requests at 65, 67, 98, 122, 124, and 183 (Figure 11.7). If a request arrives in
 * the queue just in front of the head, it will be serviced almost immediately; a
 * request arriving just behind the head will have to wait until the arm moves to
 * the end of the disk, reverses direction, and comes back.
 * Assuming a uniform distribution of requests for cylinders, consider the
 * density of requests when the head reaches one end and reverses direction. At
 * this point, relatively few requests are immediately in front of the head, since
 * these cylinders have recently been serviced. The heaviest density of requests
 * is at the other end of the disk. These requests have also waited the longest, so
 * why not go there first? That is the idea of the next algorithm
 *
 *
 *
 * 
 * @author ...
 */
public class SCAN implements IDiskAlgorithm {
	private Integer totalHeadMovement = 0;
	private Boolean direction = true;

	@Override
	public int calculateDistance(List<DiskRequest> requests, int headPosition) {

		// TODO Auto-generated method stub
		//elevator
		//while array insn't empty
		//move by 1 until you get to first request.
		//remove request from list
		//add distance traveled to total head movement
		//continue moving in same direction until hitting 4999
		//now move to 0 stopping at requests.


		//DIRECTION true = up and false = down
		while(!requests.isEmpty()){
			totalHeadMovement += 1;
			if (headPosition == 4999)

				direction = false;
			if (headPosition == 0)
				direction = true;
			//System.out.println(headPosition);
			//System.out.println(totalHeadMovement);

			if(direction){
				headPosition += 1;
				for (int i = requests.size() - 1; i >= 0; i--) {
					DiskRequest request = requests.get(i);
					if (request.getTimeOfArrival() < totalHeadMovement && headPosition == request.getTrack()) {
						System.out.printf("Request Removed: TA: %s, Track: %s\n", requests.get(i).getTimeOfArrival(), requests.get(i).getTrack());
						requests.remove(i);
					}
				}
			}
			else{
				headPosition -= 1;
				for (int i = requests.size() - 1; i >= 0; i--) {
					DiskRequest request = requests.get(i);
					if (request.getTimeOfArrival() < totalHeadMovement && headPosition == request.getTrack()) {
						System.out.printf("Request Removed: TA: %s, Track: %s\n", requests.get(i).getTimeOfArrival(), requests.get(i).getTrack());
						requests.remove(i);
					}
				}
			}
		}

		return totalHeadMovement;
	}


}
