
package ascenter;

public class AsassignCancelled extends AbstractEvent {

    private Long id;
    private String status; //호출,호출중,호출확정,호출취소
    private String asmanid;
    private String asman;
    private String asmantel;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAsmanid() {
		return asmanid;
	}

	public void setAsmanid(String asmanid) {
		this.asmanid = asmanid;
	}

	public String getAsman() {
		return asman;
	}

	public void setAsman(String asman) {
		this.asman = asman;
	}

	public String getAsmantel() {
		return asmantel;
	}

	public void setAsmantel(String asmantel) {
		this.asmantel = asmantel;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
