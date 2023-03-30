

ServerEvents.recipes(event => {

    let ingotTags = global.auTags.filter(function (val) {
        return /forge:ingots/.test(val)
    })

    console.log(ingotTags)


})