package subProj_1318

import subProj_1318.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1318")
    name = "subProj 1318"

    buildType(subProj_bt_1318_5)
    buildType(subProj_bt_1318_2)
    buildType(subProj_bt_1318_1)
    buildType(subProj_bt_1318_4)
    buildType(subProj_bt_1318_3)
    buildType(subProj_bt_1318_0)
})
