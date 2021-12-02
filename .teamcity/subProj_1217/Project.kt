package subProj_1217

import subProj_1217.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1217")
    name = "subProj 1217"

    buildType(subProj_bt_1217_5)
    buildType(subProj_bt_1217_4)
    buildType(subProj_bt_1217_3)
    buildType(subProj_bt_1217_2)
    buildType(subProj_bt_1217_1)
    buildType(subProj_bt_1217_0)
})
