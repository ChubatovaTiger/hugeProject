package subProj_1451

import subProj_1451.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1451")
    name = "subProj 1451"

    buildType(subProj_bt_1451_0)
    buildType(subProj_bt_1451_2)
    buildType(subProj_bt_1451_1)
    buildType(subProj_bt_1451_4)
    buildType(subProj_bt_1451_3)
    buildType(subProj_bt_1451_5)
})
