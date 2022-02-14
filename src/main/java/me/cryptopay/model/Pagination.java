// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class Pagination {
    @SerializedName("total")
    private Integer total;

    @SerializedName("has_more")
    private Boolean hasMore;

    /** Creates a new instance of Pagination. */
    public Pagination() {}

    /**
     * Get total.
     *
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Set total.
     *
     * @param total total
     */
    public void setTotal(final Integer total) {
        this.total = total;
    }

    /**
     * Get hasMore.
     *
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    /**
     * Set hasMore.
     *
     * @param hasMore hasMore
     */
    public void setHasMore(final Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pagination(");
        sb.append("total=").append(total).append(", ");
        sb.append("hasMore=").append(hasMore);
        sb.append(")");
        return sb.toString();
    }
}
