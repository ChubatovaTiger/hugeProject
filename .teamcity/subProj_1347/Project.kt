package subProj_1347

import subProj_1347.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1347")
    name = "subProj 1347"

    buildType(subProj_bt_1347_5)
    buildType(subProj_bt_1347_4)
    buildType(subProj_bt_1347_3)
    buildType(subProj_bt_1347_2)
    buildType(subProj_bt_1347_1)
    buildType(subProj_bt_1347_0)
})
