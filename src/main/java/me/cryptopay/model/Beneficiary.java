// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class Beneficiary {
    @SerializedName("type")
    private BeneficiaryType type;

    @SerializedName("name")
    private String name;

    @SerializedName("address")
    private BeneficiaryAddress address;

    /** Creates a new instance of Beneficiary. */
    public Beneficiary() {}

    /**
     * Get type.
     *
     * @return type
     */
    public BeneficiaryType getType() {
        return type;
    }

    /**
     * Set type.
     *
     * @param type type
     */
    public void setType(final BeneficiaryType type) {
        this.type = type;
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

    /**
     * Get address.
     *
     * @return address
     */
    public BeneficiaryAddress getAddress() {
        return address;
    }

    /**
     * Set address.
     *
     * @param address address
     */
    public void setAddress(final BeneficiaryAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Beneficiary(");
        sb.append("type=").append(type).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("address=").append(address);
        sb.append(")");
        return sb.toString();
    }
}
