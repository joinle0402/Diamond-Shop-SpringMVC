package DiamondShopping.Entity;

public class Slide {

	private int id;
	private String image;
	private String caption;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Slide [id=").append(id).append(", image=").append(image).append(", caption=").append(caption)
				.append(", content=").append(content).append("]");
		return builder.toString();
	}

}
