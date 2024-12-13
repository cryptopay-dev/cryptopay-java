// Auto-generated file
// DO NOT EDIT

package me.cryptopay.model;


import com.google.gson.annotations.SerializedName;

public final class BeneficiaryAddress {
    @SerializedName("country")
    private String country;

    @SerializedName("city")
    private String city;

    @SerializedName("line_1")
    private String line1;

    @SerializedName("line_2")
    private String line2;

    @SerializedName("post_code")
    private String postCode;

    /** Creates a new instance of BeneficiaryAddress. */
    public BeneficiaryAddress() {}

    /**
     * Get country.
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set country.
     *
     * @param country country
     */
    public void setCountry(final String country) {
        this.country = country;
    }

    /**
     * Get city.
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set city.
     *
     * @param city city
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * Get line1.
     *
     * @return line1
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Set line1.
     *
     * @param line1 line1
     */
    public void setLine1(final String line1) {
        this.line1 = line1;
    }

    /**
     * Get line2.
     *
     * @return line2
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Set line2.
     *
     * @param line2 line2
     */
    public void setLine2(final String line2) {
        this.line2 = line2;
    }

    /**
     * Get postCode.
     *
     * @return postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Set postCode.
     *
     * @param postCode postCode
     */
    public void setPostCode(final String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BeneficiaryAddress(");
        sb.append("country=").append(country).append(", ");
        sb.append("city=").append(city).append(", ");
        sb.append("line1=").append(line1).append(", ");
        sb.append("line2=").append(line2).append(", ");
        sb.append("postCode=").append(postCode);
        sb.append(")");
        return sb.toString();
    }
}
