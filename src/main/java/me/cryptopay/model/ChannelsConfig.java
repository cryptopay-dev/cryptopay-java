// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class ChannelsConfig {
    @SerializedName("enabled")
    private Boolean enabled;

    /** Creates a new instance of ChannelsConfig. */
    public ChannelsConfig() {}

    /**
     * Get enabled.
     *
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Set enabled.
     *
     * @param enabled enabled
     */
    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChannelsConfig(");
        sb.append("enabled=").append(enabled);
        sb.append(")");
        return sb.toString();
    }
}
