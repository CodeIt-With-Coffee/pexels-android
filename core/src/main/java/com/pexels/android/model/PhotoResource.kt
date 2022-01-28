package com.pexels.android.model

/**
 * PhotoResource
 *
 * Photo data class to hold photo from Pexels API
 */
data class PhotoResource(
    /**
     * The id of the photo.
     */
    val id: Int,

    /**
     * The real width of the photo in pixels.
     */
    val width: Int,

    /**
     * The real height of the photo in pixels.
     */
    val height: Int,

    /**
     * The Pexels URL where the photo is located.
     */
    val url: String,

    /**
     * The name of the photographer who took the photo.
     */
    val photographer: String,

    /**
     * The URL of the photographer's Pexels profile.
     */
    val photographerUrl: String,

    /**
     * The id of the photographer.
     */
    val photographerId: Int,

    /**
     * The average color of the photo. Useful for a placeholder while the image loads.
     */
    val avgColor: String,

    /**
     * An assortment of different image sizes that can be used to display this `Photo`.
     */
    val src: PhotoSource,

    /**
     * Text description of the photo for use in the alt attribute.
     */
    val alt: String,
    val liked: Boolean,
)
