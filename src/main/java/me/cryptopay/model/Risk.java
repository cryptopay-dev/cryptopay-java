// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public final class Risk {
    @SerializedName("score")
    private BigDecimal score;

    @SerializedName("level")
    private RiskLevel level;

    @SerializedName("resource_name")
    private String resourceName;

    @SerializedName("resource_category")
    private String resourceCategory;

    /** Creates a new instance of Risk. */
    public Risk() {}

    /**
     * Get score.
     *
     * @return score
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * Set score.
     *
     * @param score score
     */
    public void setScore(final BigDecimal score) {
        this.score = score;
    }

    /**
     * Get level.
     *
     * @return level
     */
    public RiskLevel getLevel() {
        return level;
    }

    /**
     * Set level.
     *
     * @param level level
     */
    public void setLevel(final RiskLevel level) {
        this.level = level;
    }

    /**
     * Get resourceName.
     *
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Set resourceName.
     *
     * @param resourceName resourceName
     */
    public void setResourceName(final String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Get resourceCategory.
     *
     * @return resourceCategory
     */
    public String getResourceCategory() {
        return resourceCategory;
    }

    /**
     * Set resourceCategory.
     *
     * @param resourceCategory resourceCategory
     */
    public void setResourceCategory(final String resourceCategory) {
        this.resourceCategory = resourceCategory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Risk(");
        sb.append("score=").append(score).append(", ");
        sb.append("level=").append(level).append(", ");
        sb.append("resourceName=").append(resourceName).append(", ");
        sb.append("resourceCategory=").append(resourceCategory);
        sb.append(")");
        return sb.toString();
    }
}
