package subProj_1417

import subProj_1417.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1417")
    name = "subProj 1417"

    buildType(subProj_bt_1417_4)
    buildType(subProj_bt_1417_3)
    buildType(subProj_bt_1417_2)
    buildType(subProj_bt_1417_1)
    buildType(subProj_bt_1417_5)
    buildType(subProj_bt_1417_0)
})
