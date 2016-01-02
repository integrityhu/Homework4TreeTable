package hu.infokristaly.homework.treetable.back;

import java.util.Date;

public class SubzoneDatasetView {
	@SuppressWarnings("serial")
	private long id;

	// Subzone or dataset name
	private String name;
	
	// Dataset type
	private String type;
	
	// Dataset's owner name
	private String owner;


	private Date creationTime;

	public SubzoneDatasetView() {
	}

	public SubzoneDatasetView(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public SubzoneDatasetView(long id, String name, String type, String owner) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.owner = owner;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getOwner() {
		return owner;
	}
}
