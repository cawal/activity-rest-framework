package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

public class FileRepresentation {
	private final String name;
	private final String content;
	private final String contentType;

	public FileRepresentation(String name, String content, String contentType) {
		this.name = name;
		this.content = content;
		this.contentType = contentType;
	}

	public String getName() {
		return this.name;
	}

	public String getContent() {
		return this.content;
	}

	public String getContentType() {
		return this.contentType;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof FileRepresentation)) return false;
		final FileRepresentation other = (FileRepresentation) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final Object this$content = this.getContent();
		final Object other$content = other.getContent();
		if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
		final Object this$contentType = this.getContentType();
		final Object other$contentType = other.getContentType();
		if (this$contentType == null ? other$contentType != null : !this$contentType.equals(other$contentType))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof FileRepresentation;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $content = this.getContent();
		result = result * PRIME + ($content == null ? 43 : $content.hashCode());
		final Object $contentType = this.getContentType();
		result = result * PRIME + ($contentType == null ? 43 : $contentType.hashCode());
		return result;
	}

	public String toString() {
		return "FileRepresentation(name=" + this.getName() + ", content=" + this.getContent() + ", contentType=" + this.getContentType() + ")";
	}
}

