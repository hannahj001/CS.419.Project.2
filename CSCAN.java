import java.util.List;

/**
 * This class will implement the C-SCAN
 * disk scheduling algorithm.
 *FROM TEXTBOOK
 *
 * Circular SCAN (C-SCAN ) scheduling is a variant of SCAN designed to provide
 * a more uniform wait time. Like SCAN, C-SCAN moves the head from one end of
 * the disk to the other, servicing requests along the way. When the head reaches
 * the other end, however, it immediately returns to the beginning of the disk
 * without servicing any requests on the return trip.
 * Let’s return to our example to illustrate. Before applying C-SCAN to schedule
 * the requests on cylinders 98, 183, 37, 122, 14, 124, 65, and 67, we need to
 * know the direction of head movement in which the requests are scheduled.
 * Assuming that the requests are scheduled when the disk arm is moving from
 * 0 to 199 and that the initial head position is again 53, the request will be served
 * as depicted in Figure 11.8. The C-SCAN scheduling algorithm essentially treats
 * the cylinders as a circular list that wraps around from the final cylinder to the
 * first one.
 *
 * @author ...
 */

//
public class CSCAN implements IDiskAlgorithm {

    @Override
    public int calculateDistance(List<DiskRequest> requests, int headPosition) {
        // TODO Auto-generated method stub
        //while array insn't empty
        //move by 1 until you get to first request.
        //remove request from list
        //add distance traveled to total head movement
        //continue moving in same direction until hitting 4999
        //now teleport back to 0 and restart with new new requests.
        //dont forget to add back 4,999 to the head movement.
        return 0;
    }

}
