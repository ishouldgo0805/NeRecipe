package ru.netology.nerecipe.db

import ru.netology.nerecipe.db.entities.RecipeEntity
import ru.netology.nerecipe.dto.Categories
import ru.netology.nerecipe.dto.Recipe

internal fun RecipeEntity.toRecipe(): Recipe {
    return Recipe(
        id = id,
        title = title,
        recipeImgPath = recipeImgPath,
        ingredients = ingredients,
        steps = steps,
        tags = tags,
        isFavorite = isFave
    )
}

internal fun Recipe.toRecipeEntity(): RecipeEntity {
    return RecipeEntity(
        id = id,
        title = title,
        recipeImgPath = recipeImgPath,
        ingredients = ingredients,
        steps = steps,
        tags = tags,
        isFave = isFavorite
    )
}