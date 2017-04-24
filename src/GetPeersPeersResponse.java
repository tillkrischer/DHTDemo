
public class GetPeersPeersResponse extends Response {
	String type;
	byte[] id;
	PeerInfo[] values;
	
	public GetPeersPeersResponse(byte[] id) {
		type = "get_peers_peers";
		this.id = id;
		values = new PeerInfo[Node.maxPeerResponseCount];
	}
}
