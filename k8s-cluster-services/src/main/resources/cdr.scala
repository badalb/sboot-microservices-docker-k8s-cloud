val data = sc.textFile("hdfs://localhost:9000/data/CDR.csv")
val transactions = data.map(_.split(","))
val keyvaluemap = transactions.map(x => (x(2),x(1).toInt))
val combineddata = keyvaluemap.combineByKey((v) => (v,1),(acc: (Int,Int),v) => (acc._1 + v,acc._2 + 1), (acc1: (Int,Int), acc2: (Int,Int)) => (acc1._1 + acc2._1,acc2._2 + acc2._2))
val averagedata = combineddata.map{ case(map,value) => (key,value._1 / value._2.toFloat) }
val	sortedaverage = averagedata.sortBy(_._2)
sortedaverage.take(10)