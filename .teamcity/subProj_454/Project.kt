package subProj_454

import subProj_454.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_454")
    name = "subProj 454"

    buildType(subProj_bt_454_3)
    buildType(subProj_bt_454_4)
    buildType(subProj_bt_454_1)
    buildType(subProj_bt_454_2)
    buildType(subProj_bt_454_5)
    buildType(subProj_bt_454_0)
})
