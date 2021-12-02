package subProj_1627

import subProj_1627.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1627")
    name = "subProj 1627"

    buildType(subProj_bt_1627_0)
    buildType(subProj_bt_1627_1)
    buildType(subProj_bt_1627_2)
    buildType(subProj_bt_1627_3)
    buildType(subProj_bt_1627_4)
    buildType(subProj_bt_1627_5)
})
