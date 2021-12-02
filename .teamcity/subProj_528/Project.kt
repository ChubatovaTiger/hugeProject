package subProj_528

import subProj_528.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_528")
    name = "subProj 528"

    buildType(subProj_bt_528_5)
    buildType(subProj_bt_528_4)
    buildType(subProj_bt_528_3)
    buildType(subProj_bt_528_2)
    buildType(subProj_bt_528_1)
    buildType(subProj_bt_528_0)
})
