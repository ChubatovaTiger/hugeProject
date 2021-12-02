package subProj_898

import subProj_898.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_898")
    name = "subProj 898"

    buildType(subProj_bt_898_5)
    buildType(subProj_bt_898_1)
    buildType(subProj_bt_898_2)
    buildType(subProj_bt_898_3)
    buildType(subProj_bt_898_4)
    buildType(subProj_bt_898_0)
})
