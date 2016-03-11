package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.*;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Media implements Serializable {

    private static final long serialVersionUID = 69550139319470210L;

    @JsonIgnore
    public boolean localVersion = false; // Set to true by client if Object was manually created (not part of data returned by the API)

    @JsonIgnore
    public String localFileLocation; //Set by client when uploading media.

    @JsonIgnore
    public boolean isSelected = false;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("uid")
    protected String uid;

    @JsonProperty("src")
    protected String source;

    @JsonProperty("width")
    protected int width;

    @JsonProperty("height")
    protected int height;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("metadata")
    protected MediaMetaData mediaMetaData = new MediaMetaData();

    @JsonProperty("url")
    protected String url;

    @JsonProperty("state")
    protected String state;

    @JsonProperty("formats")
    protected List<MediaFormat> formats;

    @JsonProperty("format")
    protected String format;

    @JsonProperty("license_id")
    protected Long licenseId;

    @JsonIgnore
    protected LinkedHashMap<String, ImageSize> imagesForTypeImage;

    @JsonIgnore
    protected ArrayList<ImageSize> imagesForTypeVideo;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Media items are the equal if:
     * UIDs match, IDs match, or URLs match.
     */
    @Override
    @SuppressWarnings("SimplifiableIfStatement")
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || ((Object) this).getClass() != that.getClass()) return false;

        Media media = (Media) that;
        if (StringUtils.isNotBlank(uid)) {
            return uid.equals(media.getUid());
        } else if (StringUtils.isNotBlank(id)) {
            return id.equals(media.getId());
        } else if (StringUtils.isNotBlank(url)) {
            return StringUtils.equalsIgnoreCase(url, media.getUrl());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(11, 47);
        if (StringUtils.isNotBlank(uid)) {
            hashCodeBuilder.append(uid);
        } else if (StringUtils.isNotBlank(id)) {
            hashCodeBuilder.append(id);
        } else if (StringUtils.isNotBlank(url)) {
            hashCodeBuilder.append(url);
        }
        return hashCodeBuilder.toHashCode();
    }

    /**
     * Image type will either be a dictionary or an array (dict for images, array for videos).
     * based on the type we populate either <code>imagesForTypeImage</code> or <code>imagesForTypeVideo</code>.
     */
    @SuppressWarnings("unchecked")
    public void setImages(Object images) {
        if (images instanceof LinkedHashMap) {
            imagesForTypeImage = new LinkedHashMap<>();
            LinkedHashMap<String, Object> temp = (LinkedHashMap<String, Object>) images;
            for (java.util.Map.Entry<String, Object> entry : temp.entrySet()) {
                LinkedHashMap<String, Object> imgData = (LinkedHashMap<String, Object>) entry.getValue();
                ImageSize imgSize = constructImageSizeFromData(imgData);
                imagesForTypeImage.put(entry.getKey(), imgSize);
            }
        } else if (images instanceof ArrayList) {
            imagesForTypeVideo = new ArrayList<>();
            ArrayList<Object> temp = (ArrayList<Object>) images;
            for (Object obj : temp) {
                LinkedHashMap<String, Object> imgData = (LinkedHashMap<String, Object>) obj;
                ImageSize imgSize = constructImageSizeFromData(imgData);
                imagesForTypeVideo.add(imgSize);
            }
        }
    }

    protected ImageSize constructImageSizeFromData(LinkedHashMap<String, Object> imgData) {
        ImageSize imgSize = new ImageSize();
        imgSize.setUrl(imgData.get("url").toString());
        imgSize.setWidth(imgData.get("width").toString());

        if (imgData.containsKey("height")) {
            imgSize.setHeight(imgData.get("height").toString());
        }
        if (imgData.containsKey("length")) {
            imgSize.setLength(imgData.get("length").toString());
        }
        return imgSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public MediaMetaData getMediaMetaData() {
        return mediaMetaData;
    }

    public void setMediaMetaData(MediaMetaData mediaMetaData) {
        this.mediaMetaData = mediaMetaData;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<MediaFormat> getFormats() {
        return formats;
    }

    public void setFormats(List<MediaFormat> formats) {
        this.formats = formats;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
    }

    public LinkedHashMap<String, ImageSize> getImagesForTypeImage() {
        return imagesForTypeImage;
    }

    public void setImagesForTypeImage(LinkedHashMap<String, ImageSize> imagesForTypeImage) {
        this.imagesForTypeImage = imagesForTypeImage;
    }

    public ArrayList<ImageSize> getImagesForTypeVideo() {
        return imagesForTypeVideo;
    }

    public void setImagesForTypeVideo(ArrayList<ImageSize> imagesForTypeVideo) {
        this.imagesForTypeVideo = imagesForTypeVideo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
