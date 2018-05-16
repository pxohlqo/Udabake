package com.cracky_axe.pxohlqo.udabake.model

import com.squareup.moshi.Json

data class Recipe(
        @Json(name = "id") val id: Int,
        @Json(name = "name") val name: String,
        @Json(name = "ingredients") val ingredients: List<Ingredient>,
        @Json(name = "steps") val steps: List<Step>,
        @Json(name = "servings") val servings: Int,
        @Json(name = "image") val image: String
) {
    data class Ingredient(
            @Json(name = "quantity") val quantity: Double,
            @Json(name = "measure") val measure: String,
            @Json(name = "ingredient") val ingredient: String
    )

    data class Step(
            @Json(name = "id") val id: Int,
            @Json(name = "shortDescription") val shortDescription: String,
            @Json(name = "description") val description: String,
            @Json(name = "videoURL") val videoURL: String,
            @Json(name = "thumbnailURL") val thumbnailURL: String
    )
}