

global['auTags'] = []

ServerEvents.recipes(event =>{
    global.auTags = AlmostUnified.getTags()
    
})