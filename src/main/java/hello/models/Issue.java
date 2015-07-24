package hello.models;

import java.util.Date;

@Entity
@Table(name = "Issues")
public class Issue {

	@Id
    private String id;
	@Column
    private String desc;
	private Date startDate;
	private Date endDate;
	@Column
	private String severity;
	private boolean highlight;
	private String module;
	private String version;

    public Issue(String id, String desc, Date startDate) {
        this.id = id;
        this.desc = desc;
		this.startDate = startDate;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }
	
	public Date getStartDate(){
		return startDate;
	}
}