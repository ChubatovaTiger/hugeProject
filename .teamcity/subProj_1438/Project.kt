package subProj_1438

import subProj_1438.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1438")
    name = "subProj 1438"

    buildType(subProj_bt_1438_2)
    buildType(subProj_bt_1438_3)
    buildType(subProj_bt_1438_4)
    buildType(subProj_bt_1438_5)
    buildType(subProj_bt_1438_0)
    buildType(subProj_bt_1438_1)
})
