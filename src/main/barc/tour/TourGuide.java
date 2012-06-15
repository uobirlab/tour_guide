package barc.tour;

import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;


/**
 * @author Jeremiah Via <jxv911@cs.bham.ac.uk>
 */
public class TourGuide extends AbstractNodeMain {
    @Override
    public GraphName getDefaultNodeName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onStart(ConnectedNode connectedNode) {
        super.onStart(connectedNode);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
