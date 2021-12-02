package subProj_1448

import subProj_1448.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1448")
    name = "subProj 1448"

    buildType(subProj_bt_1448_4)
    buildType(subProj_bt_1448_3)
    buildType(subProj_bt_1448_5)
    buildType(subProj_bt_1448_0)
    buildType(subProj_bt_1448_2)
    buildType(subProj_bt_1448_1)
})
