package DiamondShopping.Entity;

public class NavigationBar {

	private int id;
	private String name;
	private String url;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NavigationBar [id=").append(id).append(", name=").append(name).append(", url=").append(url)
				.append("]");
		return builder.toString();
	}

}
