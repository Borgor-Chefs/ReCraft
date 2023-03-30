
//To-Do: We might want to make our own Ingots/Ores/Dust etc..
//It'll let us have a consistant Texture Style and would make AlmostUnified do a better job as well

WorldgenEvents.remove(event => {
    event.removeFeatureById('underground_ores', [
        "electrodynamics:orelead",
        "electrodynamics:oreuraninite",
        "electrodynamics:oresulfer",
        "electrodynamics:orefluorite",
        "electrodynamics:oreniter",
        "electrodynamics:oresilver",
        "electrodynamics:oretin",
        "mekanism:ore_tin_large",
        "mekanism:ore_tin_large_retrogen",
        "mekanism:ore_tin_small",
        "mekanism:ore_tin_small_retrogen",
        "mekanism:ore_lead_normal",
        "mekanism:ore_lead_normal_retrogen",
        "immersiveengineering:bauxite",
        "immersiveengineering:silver",
        "immersiveengineering:lead",
        "immersiveengineering:uranium",
        "immersiveengineering:nickel",
        "occultism:silver_ore",
        "occultism:silver_ore_deepslate",
        "bigreactors:yellorite_ore",
        "bigreactors:yellorite_deepslate_ore"
    ])
})