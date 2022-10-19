import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;

function createShaped(name as string, output as IItemStack, ingredients as IIngredient[][]) as void {
    craftingTable.addShaped(name, output, ingredients);
    <recipetype:create:mechanical_crafting>.addRecipe(name, output, ingredients);
}
