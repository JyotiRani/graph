// You can use this file to load the air-routes graph from the Gremlin Console
//
// To execute use the console command ":load load-air-routes-graph.groovy"
//

conf = new BaseConfiguration()
conf.setProperty("gremlin.tinkergraph.vertexIdManager","LONG")
conf.setProperty("gremlin.tinkergraph.edgeIdManager","LONG")
graph = TinkerGraph.open(conf)

// Change the path below to point to wherever you put the graphml file
graph.io(graphml()).readGraph('C:/Users/IBM_ADMIN/Desktop/Graphdb/work/travel-process.graphml')

g=graph.traversal()
:set max-iteration 1000     