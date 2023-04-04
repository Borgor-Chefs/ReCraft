// priority: 0

console.info('Hello, World! (You will see this line every time client resources reload)')



JEIEvents.hideItems(event => {
	event.hide('mysticalagriculture:yellorium_essence')
	event.hide('mysticalagriculture:yellorium_seeds')
	event.hide('planttech2:yellorium_seeds')
	event.hide('planttech2:yellorium_particles')
	event.hide('yellorium_particles')
	event.hide('bigreactors:yellorium_nugget')
	event.hide('bigreactors:yellorium_block')
})