package subProj_997

import subProj_997.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_997")
    name = "subProj 997"

    buildType(subProj_bt_997_5)
    buildType(subProj_bt_997_0)
    buildType(subProj_bt_997_3)
    buildType(subProj_bt_997_4)
    buildType(subProj_bt_997_1)
    buildType(subProj_bt_997_2)
})
