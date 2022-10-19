import crafttweaker.api.data.MapData;
import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;

# Utility functions
# because if functions didnt exist i think i would lose all sanity
function plankToWood(name as string, logs as IIngredient, planks as IItemStack) as void {
    craftingTable.removeRecipe(planks);
    craftingTable.addShapeless(name, planks * 2, [logs]);
}

# create early game but expensive lmao
function createSawmill(name as string, strippedLog as IIngredient, planks as IItemStack) as void {
    <recipetype:create:cutting>.removeRecipe(planks);
    <recipetype:create:cutting>.addRecipe(name, planks * 4, strippedLog);
}

# thermal go mid game, then we do MEKANISM
function thermalSawmill(name as string, ingredient as IIngredient, planks as IItemStack) as void {
    <recipetype:thermal:sawmill>.removeRecipe([planks, <item:thermal:sawdust>]);
    <recipetype:thermal:sawmill>.addRecipe(name, [
        planks % 400, <item:thermal:sawdust> % 25
    ], ingredient, 1000);
}

# Minecraft
var logPlanks as IIngredient[IItemStack] = {
    <item:minecraft:oak_planks>     : <tag:items:minecraft:oak_logs>.asIIngredient(),
    <item:minecraft:spruce_planks>  : <tag:items:minecraft:spruce_logs>.asIIngredient(),
    <item:minecraft:birch_planks>   : <tag:items:minecraft:birch_logs>.asIIngredient(),
    <item:minecraft:jungle_planks>  : <tag:items:minecraft:jungle_logs>.asIIngredient(),
    <item:minecraft:acacia_planks>  : <tag:items:minecraft:acacia_logs>.asIIngredient(),
    <item:minecraft:dark_oak_planks>: <tag:items:minecraft:dark_oak_logs>.asIIngredient(),
    <item:minecraft:crimson_planks> : <tag:items:minecraft:crimson_stems>.asIIngredient(),
    <item:minecraft:warped_planks>  : <tag:items:minecraft:warped_stems>.asIIngredient(),

    # Ars nouveau
    <item:ars_nouveau:archwood_planks>: <tag:items:forge:logs/archwood>.asIIngredient(),

    # Botania
    <item:botania:livingwood_planks>: <tag:items:botania:livingwood>.asIIngredient()
};

# WHY CREATE WHY
var strippedPlanks as IItemStack[IItemStack] = {
    <item:minecraft:oak_planks>     : <item:minecraft:stripped_oak_log>,
    <item:minecraft:spruce_planks>  : <item:minecraft:stripped_spruce_log>,
    <item:minecraft:birch_planks>   : <item:minecraft:stripped_birch_log>,
    <item:minecraft:jungle_planks>  : <item:minecraft:stripped_jungle_log>,
    <item:minecraft:acacia_planks>  : <item:minecraft:stripped_acacia_log>,
    <item:minecraft:dark_oak_planks>: <item:minecraft:stripped_dark_oak_log>,
    <item:minecraft:crimson_planks> : <item:minecraft:stripped_crimson_stem>,
    <item:minecraft:warped_planks>  : <item:minecraft:stripped_warped_stem>,

};

for plank, log in logPlanks {
    var itemStr as string = (plank as MapData).getAt("item").getString().split(":")[1];
    plankToWood(itemStr + "_2wood", log, plank);
    # Thermal do be pretty nice
    thermalSawmill(itemStr + "_thermal_sawmill", log, plank);
}

for plank, stripped in strippedPlanks {
    createSawmill((plank as MapData).getAt("item").getString().split(":")[1] + "create_sawmill", stripped, plank);
}

# Botania dreamwood cuz it dont have tags :(
craftingTable.removeRecipe(<item:botania:dreamwood_planks>);
craftingTable.addShapeless("dreamwood_2planks", <item:botania:dreamwood_planks> * 2, [
    <item:botania:dreamwood>
]);
