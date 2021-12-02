package subProj_1528

import subProj_1528.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1528")
    name = "subProj 1528"

    buildType(subProj_bt_1528_2)
    buildType(subProj_bt_1528_3)
    buildType(subProj_bt_1528_0)
    buildType(subProj_bt_1528_1)
    buildType(subProj_bt_1528_4)
    buildType(subProj_bt_1528_5)
})
