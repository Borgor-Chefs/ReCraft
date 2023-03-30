// priority: 0

ServerEvents.recipes((event) => {
  const modPlanks = Ingredient.of(
    /(ars_nouveau|biomesoplenty|blue_skies|botania|quark|twilightforest|undergarden|theabyss):.+_planks/
  );

  modPlanks.getItemIds().forEach((plank) => {
    event.recipes.minecraft.crafting_shaped(
      "minecraft:chest",
      ["WWW", "W W", "WWW"],
      {
        W: plank,
      }
    );
  });
});
