package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;


public class LinkRepresentation {
    private final String rel;
    private final String uri;

    public LinkRepresentation(String rel, String uri) {
        this.rel = rel;
        this.uri = uri;
    }

    public String getRel() {
        return this.rel;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LinkRepresentation)) return false;
        final LinkRepresentation other = (LinkRepresentation) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$rel = this.getRel();
        final Object other$rel = other.getRel();
        if (this$rel == null ? other$rel != null : !this$rel.equals(other$rel)) return false;
        final Object this$uri = this.getUri();
        final Object other$uri = other.getUri();
        if (this$uri == null ? other$uri != null : !this$uri.equals(other$uri)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LinkRepresentation;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $rel = this.getRel();
        result = result * PRIME + ($rel == null ? 43 : $rel.hashCode());
        final Object $uri = this.getUri();
        result = result * PRIME + ($uri == null ? 43 : $uri.hashCode());
        return result;
    }

    public String toString() {
        return "LinkRepresentation(rel=" + this.getRel() + ", uri=" + this.getUri() + ")";
    }
}
