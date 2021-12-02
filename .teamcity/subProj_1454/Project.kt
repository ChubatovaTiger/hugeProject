package subProj_1454

import subProj_1454.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1454")
    name = "subProj 1454"

    buildType(subProj_bt_1454_5)
    buildType(subProj_bt_1454_4)
    buildType(subProj_bt_1454_1)
    buildType(subProj_bt_1454_0)
    buildType(subProj_bt_1454_3)
    buildType(subProj_bt_1454_2)
})
