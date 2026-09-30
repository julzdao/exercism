/// <reference path="./global.d.ts" />
// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */

export const cookingStatus = remainingTime => {
    return (remainingTime === 0) ? "Lasagna is done." 
        : (remainingTime > 0) ? "Not done, please wait."
        : "You forgot to set the timer.";
}

export const preparationTime = (layers, timePerLayer = 2) => {
    return layers.length * timePerLayer;
}

export const quantities = layers => {
    const quantitiesForMeal = {
        noodles: 0,
        sauce: 0
    }

    for (let i = 0; i < layers.length; i++) {
        if (layers[i] === "noodles") {
            quantitiesForMeal.noodles += 50;
        } else if (layers[i] === "sauce") {
            quantitiesForMeal.sauce += 0.2;
        }
    }

    return quantitiesForMeal;
}

export const addSecretIngredient = (myFriendList, myList) => { myList.push(myFriendList[myFriendList.length - 1]) };

export const scaleRecipe = (recipe, portions) => {
    const scaledRecipe = {};
    Object.entries(recipe).forEach(([key, value]) => {
        scaledRecipe[key] = (value / 2) * portions;
    })
    return scaledRecipe;
}