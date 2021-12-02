package subProj_1297

import subProj_1297.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1297")
    name = "subProj 1297"

    buildType(subProj_bt_1297_5)
    buildType(subProj_bt_1297_4)
    buildType(subProj_bt_1297_3)
    buildType(subProj_bt_1297_2)
    buildType(subProj_bt_1297_1)
    buildType(subProj_bt_1297_0)
})
