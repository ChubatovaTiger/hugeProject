package subProj_1997

import subProj_1997.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1997")
    name = "subProj 1997"

    buildType(subProj_bt_1997_1)
    buildType(subProj_bt_1997_0)
    buildType(subProj_bt_1997_3)
    buildType(subProj_bt_1997_2)
    buildType(subProj_bt_1997_5)
    buildType(subProj_bt_1997_4)
})
