craftingTable.removeRecipe(<item:agricraft:crop_sticks_wood>);
createShaped("agricraft_cropsticks", <item:agricraft:crop_sticks_wood>, [
    [<tag:items:forge:rods/wooden>.asIIngredient(), <tag:items:forge:rods/wooden>.asIIngredient()],
    [<tag:items:forge:rods/wooden>.asIIngredient(), <tag:items:forge:rods/wooden>.asIIngredient()],
]);

createShaped("agricraft_ironcropsticks", <item:agricraft:crop_sticks_iron>, [
    [<tag:items:forge:rods/iron>.asIIngredient(), <tag:items:forge:rods/iron>.asIIngredient()],
    [<tag:items:forge:rods/iron>.asIIngredient(), <tag:items:forge:rods/iron>.asIIngredient()]
]);

createShaped("agricraft_obsidiancropsticks", <item:agricraft:crop_sticks_obsidian>, [
    [<item:minecraft:obsidian>],
    [<item:minecraft:obsidian>]
]);
