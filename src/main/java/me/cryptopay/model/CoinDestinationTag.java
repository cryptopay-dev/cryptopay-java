// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class CoinDestinationTag {
    @SerializedName("required")
    private Boolean required;

    @SerializedName("name")
    private String name;

    /** Creates a new instance of CoinDestinationTag. */
    public CoinDestinationTag() {}

    /**
     * Get required.
     *
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * Set required.
     *
     * @param required required
     */
    public void setRequired(final Boolean required) {
        this.required = required;
    }

    /**
     * Get name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     *
     * @param name name
     */
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoinDestinationTag(");
        sb.append("required=").append(required).append(", ");
        sb.append("name=").append(name);
        sb.append(")");
        return sb.toString();
    }
}
