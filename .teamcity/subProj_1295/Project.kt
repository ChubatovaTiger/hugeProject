package subProj_1295

import subProj_1295.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1295")
    name = "subProj 1295"

    buildType(subProj_bt_1295_5)
    buildType(subProj_bt_1295_0)
    buildType(subProj_bt_1295_4)
    buildType(subProj_bt_1295_3)
    buildType(subProj_bt_1295_2)
    buildType(subProj_bt_1295_1)
})
