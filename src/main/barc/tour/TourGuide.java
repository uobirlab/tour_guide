package barc.tour;

import org.ros.message.geometry_msgs.Twist;
import org.ros.node.DefaultNodeFactory;
import org.ros.node.Node;
import org.ros.node.NodeConfiguration;
import org.ros.node.NodeMain;
import org.ros.node.topic.Publisher;


/**
 * @author Jeremiah Via <jxv911@cs.bham.ac.uk>
 */
public class TourGuide implements NodeMain {

    private Node node;
    private Publisher<Twist> pub;

    @Override
    public void main(NodeConfiguration nodeConfiguration) throws Exception {
        node = new DefaultNodeFactory().newNode("tour_guide", nodeConfiguration);
        pub = node.newPublisher("cmd_vel", "geometry_msgs/Twist");
    }

    @Override
    public void shutdown() {
        node.shutdown();
        node = null;
    }
}
